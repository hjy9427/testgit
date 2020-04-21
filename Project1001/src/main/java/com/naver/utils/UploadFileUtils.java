package com.naver.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class UploadFileUtils {
//utils에 들어가는건 자주 사용함 여기 메서드는 대부분 스태틱
	
	public static String uploadFile(String uploadPath, MultipartFile file) throws IOException {
		UUID uid = UUID.randomUUID();
		String savedName=uid.toString()+"_"+file.getOriginalFilename();
		
		String savedPath=calcPath(uploadPath);
		File target=new File(uploadPath+savedPath, savedName);
		
		FileCopyUtils.copy(file.getBytes(), target);
		
		String type=savedName.substring(savedName.lastIndexOf(".")+1);
		
		String uploadFileName=null;
		if(MediaUtils.getMediaType(type)==null) {
			//이미지파일이 아니란 의미 jpeg png gif
			uploadFileName=makeIcon(uploadPath, savedPath, savedName);
		}else {
			uploadFileName=makeThumbnail(uploadPath, savedPath, savedName);
		}
	
		return uploadFileName;
	}

	private static String makeThumbnail(String uploadPath, String savedPath, String savedName) throws IOException {
		String name1=uploadPath+savedPath+File.separator+"s_"+savedName;
		
		BufferedImage sourceImg=ImageIO.read(new File(uploadPath+savedPath, savedName));
		//throws 날림
		BufferedImage destImg=Scalr.resize(sourceImg, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_EXACT, 100);
		//100크기로 맞춰주란 의미 Scalr.Mode.FIT_EXACT, 100
		//썸네일만들기
		File f= new File(name1);
		String formatName=savedName.substring(savedName.lastIndexOf(".")+1);
		ImageIO.write(destImg, formatName.toUpperCase(), f);
		return name1.substring(uploadPath.length()).replace(File.separatorChar, '/');
	}
	public static String uploadFileprod(String uploadPath, MultipartFile file) throws IOException {
		UUID uid = UUID.randomUUID();
		String savedName=uid.toString()+"_"+file.getOriginalFilename();
		
		String savedPath=calcPath(uploadPath);
		File target=new File(uploadPath+savedPath, savedName);
		
		FileCopyUtils.copy(file.getBytes(), target);
		
		String type=savedName.substring(savedName.lastIndexOf(".")+1);
		
		String uploadFileName=null;
		if(MediaUtils.getMediaType(type)==null) {
			//이미지파일이 아니란 의미 jpeg png gif
			uploadFileName=makeIcon(uploadPath, savedPath, savedName);
		}else {
			uploadFileName=makeThumbnailprod(uploadPath, savedPath, savedName);
		}
	
		return uploadFileName;
	}

	private static String makeThumbnailprod(String uploadPath, String savedPath, String savedName) throws IOException {
		String name1=uploadPath+savedPath+File.separator+"s_"+savedName;
		
		BufferedImage sourceImg=ImageIO.read(new File(uploadPath+savedPath, savedName));
		//throws 날림
		BufferedImage destImg=Scalr.resize(sourceImg, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_EXACT, 270);
		//100크기로 맞춰주란 의미 Scalr.Mode.FIT_EXACT, 100
		//썸네일만들기
		File f= new File(name1);
		String formatName=savedName.substring(savedName.lastIndexOf(".")+1);
		ImageIO.write(destImg, formatName.toUpperCase(), f);
		return name1.substring(uploadPath.length()).replace(File.separatorChar, '/');
	}
	private static String makeIcon(String uploadPath, String savedPath, String savedName) {
		String name=uploadPath + savedPath + File.separator+savedName;
		return name.substring(uploadPath.length()).replace(File.separatorChar, '/');
		//윈도으는 역슬래시인데 실제 브라우저에서는 슬래시로 나옴
		//이거 바꿔주는게 리플레이스
	}

	private static String calcPath(String uploadPath) {
		Calendar cal=Calendar.getInstance();
		String yearPath=File.separator+cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		//그냥 2나오는거 02로 만들기new DecimalFormat("00").format(month)
		String monthPath=yearPath+File.separator+new DecimalFormat("00").format(month);
		int date=cal.get(Calendar.DATE);
		String datePath=monthPath+File.separator+new DecimalFormat("00").format(date);
		makeDir(uploadPath, yearPath, monthPath, datePath);
		return datePath;
	}

	private static void makeDir(String uploadPath, String ...arr) {
		//private static void makeDir(String uploadPath, String yearPath, String monthPath, String datePath) {
		//아래꺼랑 똑같음 똑같은 자료형 겹칠 떄
		if(new File(uploadPath+arr[arr.length-1]).exists()) {
			return;
		}
		for(String path:arr) {
			File f=new File(uploadPath+path);
			//괄호 안 pathname
			if(!f.exists()) {
				f.mkdir();
			}
		}
	}
}
