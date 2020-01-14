package kr.co.ca;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainEx4 {
	public static void main(String[] args) {
		
		OutputStream out = null;
		DataOutputStream dos = null;
		
		InputStream in = null;
		DataInputStream dis = null;
		
		try {
			out = new FileOutputStream("C:"+File.separator+"filter.txt");
			dos = new DataOutputStream(out);
			in = new FileInputStream("C:"+File.separator+"filter.txt");
			dis = new DataInputStream(in);   //스트림생성
			
			dos.writeInt(300); //인트형의 데이터를 유지하면서 보내겟다
			dos.writeFloat(3.14F);
			dos.writeBoolean(true);
			dos.writeUTF("hello world");
			dos.flush();   //반드시 있어야함 뭐까지 출력 다 하라고?
						//출력을 me1입력을me2에서 하면 이럴필욘없음
						//입출력같은곳에서 하면 반드시 넣어줘여함
						//문자스트림에서는
						//바이트스트림에선 이럴필요업슴
			
			int a = dis.readInt();
			float b = dis.readFloat();
			boolean d = dis.readBoolean();
			String c = dis.readUTF();//순서중요
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) {dos.close();}
				if(out != null) {out.close();}
				if(dis != null) {dis.close();}
				if(in != null) {in.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
