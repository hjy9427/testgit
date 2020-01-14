package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null; //출력을 곧바로 할거라서
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.png");
					//파일 이렇게 써줘야 모든 os에서 호환함
					//추상클래스라 객체 안만듦 마우스를 //가져다 대면 에이라고 써있음
					//파일 입력
			out = new FileOutputStream("C:"+File.separator+"copy_test.png");
			long a = System.currentTimeMillis();  //시간재기
			while (true) {
				int what = in.read();
				if(what == -1) {
					break;
				}
				out.write(what);
				long b = System.currentTimeMillis();
				System.out.println(b-a);
			}
			System.out.println("copy 완료");
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(in != null) { in.close(); }
					
				 if(out != null) { out.close(); }
				 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}

}
