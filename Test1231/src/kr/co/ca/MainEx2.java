package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = null;
		OutputStream out = null;
		
		try {//배열을 이용해 여러개를 받아와서 여러개를 출력
			in = new FileInputStream("C:"+File.separator+"test.png");
			out = new FileOutputStream("C:"+File.separator+"test2.png");
			
			long a = System.currentTimeMillis();
			byte[] arr = new byte[1024];
			
			while(true) {//끝날떄까지 돌리겠다
				int length = in.read(arr); 
				//몇개가져오는지넘겨주는코드  
				//하나씩만가져올떈가져올게 없으면-1 여러개일떄도
				if(length == -1) {
					break;
				}
				out.write(arr, 0, length);//배열의 0번쨰부터 
				//length의 갯수만큼 가져오겟다
			}
			
		long b = System.currentTimeMillis();
		System.out.println(b-a);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {in.close();}
				if (out != null) {out.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("copy_end");
			
	}

}
