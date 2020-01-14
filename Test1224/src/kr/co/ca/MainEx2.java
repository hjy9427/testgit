package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InputStream in = null;
		
		
		try {
			in = new FileInputStream("C:"+File.separator+"hello222.txt");
			System.out.println(4/0);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
				// TODO: handle exception
			}
		}
		
		
		
		
		Thread t = new Thread();	
		t.start();
		
		try {
			t.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(1111);
		}
	}

}
