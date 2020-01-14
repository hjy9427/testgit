package kr.co.ca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MainEx8 {
	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO("m001", "kim", 11);
		
		InputStream in =null;
		ObjectInputStream ois = null;
		OutputStream out = null;
		ObjectOutputStream oos = null;
		
		try {
			
			
			out = new FileOutputStream("C:"+File.separator+"obj.dat");
			oos = new ObjectOutputStream(out);
			
			//자바프로그램에서 오브젝트로 보내고 다시 받기
			oos.writeObject(dto);
			
			in = new FileInputStream("C:"+File.separator+"obj.dat");
			ois = new ObjectInputStream(in);
			
			Object obj = ois.readObject();
			if(obj instanceof MemberDTO) {
				MemberDTO re = (MemberDTO)obj;
				System.out.println(re.getId());
				System.out.println(re.getName());
				System.out.println(re.getAge());
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
				if(in != null)	{
					in.close();
				}
				if(oos != null) {
					oos.close();
				}
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
