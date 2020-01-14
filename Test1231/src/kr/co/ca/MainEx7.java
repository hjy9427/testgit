package kr.co.ca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;   //����Ʈ��Ʈ��
		InputStreamReader isr = null;   //���ڽ�Ʈ��
		BufferedReader br = null;
		
		try {
			in = new FileInputStream("C:"+File.separator+"zzz.txt");
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			while (true) {
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(isr != null) {
					isr.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}

}
