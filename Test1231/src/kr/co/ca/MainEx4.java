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
			dis = new DataInputStream(in);   //��Ʈ������
			
			dos.writeInt(300); //��Ʈ���� �����͸� �����ϸ鼭 �����ٴ�
			dos.writeFloat(3.14F);
			dos.writeBoolean(true);
			dos.writeUTF("hello world");
			dos.flush();   //�ݵ�� �־���� ������ ��� �� �϶��?
						//����� me1�Է���me2���� �ϸ� �̷��ʿ����
						//����°��������� �ϸ� �ݵ�� �־��࿩��
						//���ڽ�Ʈ��������
						//����Ʈ��Ʈ������ �̷��ʿ����
			
			int a = dis.readInt();
			float b = dis.readFloat();
			boolean d = dis.readBoolean();
			String c = dis.readUTF();//�����߿�
			
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
