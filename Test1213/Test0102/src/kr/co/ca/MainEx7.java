package kr.co.ca;

import java.io.File;
import java.util.ArrayList;

public class MainEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myDir = new File("C:"+File.separator);
		File[] list = myDir.listFiles();
		ArrayList<String> dirList = new ArrayList<String>();
		ArrayList<String> fileList = new ArrayList<String>();
		
		for (File f : list) {
			System.out.println(f.getName());
			if(f.isDirectory()) {//디렉토리냐구 묻는거
				dirList.add(f.getName());
			} else {
				fileList.add(f.getName());
			}
		}
		
		
	}

}
