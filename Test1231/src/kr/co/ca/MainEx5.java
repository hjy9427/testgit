package kr.co.ca;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class MainEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer out = null;
		Reader in = null;
		
		try {
			out = new FileWriter("C:"+File.separator+"ss.txt");
			in = new FileReader("C:"+File.separator+"ss.txt");
			
			out.write("hello world");
			out.write("\r\n");//�ٹٲ�, �̰ͺ��� �Ʒ������� � os�ǽ���
			out.write("this is ");
			out.write(System.getProperty("line.separator"));//�ٹٲ�
			out.write("good morning");
			out.flush();
			
			char[] arr = new char[16];
			while(true) {
				int leng = in.read(arr, 0, arr.length);
				//�迭�� �ִ� ���߿��� 
											//0���� �ִ� length����
				if(leng == 1) {
					break;
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
				}
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null)	{
					out.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
