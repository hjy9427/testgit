package kr.co.ca;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx3 {
	public static void main(String[] args) {
		InputStream in =null;
		BufferedInputStream bis = null;//스트림 연결
		OutputStream out = null;
		BufferedOutputStream bos = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.png");
			
			out = new FileOutputStream("C:"+File.separator+"copy_test.png");
			long a = System.currentTimeMillis();
			bis = new BufferedInputStream(in);
			//BIS라고 치고 컨트롤스페이스 누르면 나옴
			
			bos = new BufferedOutputStream(out);
			//BOS라고 치고 컨트롤스페이스 누르면 나옴
			while (true) {
				int what = bis.read();
				
				if (what == -1) {
					break;
				}
				bos.write(what);
			}
			
			long b = System.currentTimeMillis();
			System.out.println(b-a);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(bis != null) { bis.close(); }
				if(in != null) { in.close(); } 
				if(bos != null) { bos.close(); }
				if(out != null) { out.close(); }
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("copy end");
		
	}
}
