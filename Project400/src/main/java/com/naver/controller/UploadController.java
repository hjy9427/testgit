package com.naver.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.naver.utils.MediaUtils;
import com.naver.utils.UploadFileUtils;

@Controller
public class UploadController {
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@RequestMapping(value = "deletefile", method = RequestMethod.POST)
	@ResponseBody
	public String deletefile(String filename) {
		filename=filename.replace('/', File.separatorChar);
		
		File f= new File(uploadPath, filename);
		if(f.exists()) {
			f.delete();	
		}
				
		String type=filename.substring(filename.lastIndexOf(".")+1);
		
		if(MediaUtils.getMediaType(type)!=null) {
			String prefix=filename.substring(0, 12);
			String suffix=filename.substring(14);
			File f0=new File(uploadPath, prefix+suffix);
			if(f0.exists()) {
				f0.delete();
			}
		}
		return "삭제되었습니다";
	}
	
	@RequestMapping("display")
	@ResponseBody
	public ResponseEntity<byte[]> display(String filename) {
		try {
			filename=new String(filename.getBytes("8859_1"), "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//한글지원
		
		ResponseEntity<byte[]> entity=null;
		InputStream in =null;
		//파일이랑 여기 연결
		try {
			in=new FileInputStream(uploadPath+filename);
			String type=filename.substring(filename.lastIndexOf(".")+1);
			MediaType mType=MediaUtils.getMediaType(type);
			HttpHeaders headers=new HttpHeaders();
			if(mType!=null) {
				//이미지파일이란의미
				headers.setContentType(mType);
			}else {
				filename=filename.substring(filename.indexOf("_")+1);
				
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
				//다운로드 가능하게 하는 미디어타입이 어플리케이션 어쩌고
				headers.add("Content-Disposition", "attachment;filename=\""+new String(filename.getBytes("UTF-8"), "ISO-8859-1"));
				//파일네임을 동적으로 넣어주기 위해
			}
			entity=new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.OK);
			//성공했을 떄의 코드 세번쨰꺼
		} catch (Exception e) {
			e.printStackTrace();
			entity=new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		}finally {
				try {
					if(in!=null) {
						in.close();
					}
					
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		
		
		
		return entity;
	}
	
	
	//널아님
	@RequestMapping(value = "uploadajax", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	@ResponseBody//ajax통신가능케
	public String uploadajax(MultipartHttpServletRequest request) throws IOException {
		MultipartFile file=request.getFile("file");
		/*
		 * System.out.println(file.getOriginalFilename());
		 * System.out.println(file.getSize());
		 */
		return UploadFileUtils.uploadFile(uploadPath, file);
	}
	
	@RequestMapping(value = "uploadajax", method = RequestMethod.GET)
	public void uploadajax() {
	}
	
	@RequestMapping(value = "/uploadForm", method = RequestMethod.POST)
	public String uploadForm(MultipartHttpServletRequest request, Model model) throws IOException {
		//MultipartFile file로 parameter받으면 파일밖에 못받음
		MultipartFile file= request.getFile("file");
		//jsp에서 넘겨받은 파일 이름이 파일이니까
		//파라미터 지금 쓴걸로 받는게 더 좋음 멀티파트서블릿리퀘스트
		UUID uid=UUID.randomUUID();
		String savedName=uid.toString()+"_"+file.getOriginalFilename();
		
		File target=new File(uploadPath, savedName);
		FileCopyUtils.copy(file.getBytes(), target);
		//throws날리기
		//c드라이브에 업로드됨
		String title=request.getParameter("title");
		//이런 경우에도 사용할 수 있기 떄문MultipartHttpServletRequest
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());//jpeg이런거
		//파일중복 지원 안함 파일네임은 없고 오리지널 네임만 있음
		model.addAttribute("savedName", savedName);
		return "uploadResult";
	}
	@RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
	public void uploadForm() {
		
	}
}
