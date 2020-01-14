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
		OutputStream out = null; //����� ��ٷ� �ҰŶ�
		
		try {
			in = new FileInputStream("C:"+File.separator+"test.png");
					//���� �̷��� ����� ��� os���� ȣȯ��
					//�߻�Ŭ������ ��ü �ȸ��� ���콺�� //������ ��� ���̶�� ������
					//���� �Է�
			out = new FileOutputStream("C:"+File.separator+"copy_test.png");
			long a = System.currentTimeMillis();  //�ð����
			while (true) {
				int what = in.read();
				if(what == -1) {
					break;
				}
				out.write(what);
				long b = System.currentTimeMillis();
				System.out.println(b-a);
			}
			System.out.println("copy �Ϸ�");
		
		
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
