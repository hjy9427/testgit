package kr.co.ca;

import java.io.File;

public class MainEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("AAA"); //C:�ִ°Ŷ� �׳� �ִ� �� ��ġ�� �ٸ�
		
		String ap = f.getAbsolutePath(); //������ ��ǥ
		//�� ��ǥ ���� �����ǥ�� ������� ������ ���͸��� ���ݾ� �ٸ��ϱ�
		System.out.println(ap);
		
		if(f.exists()) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

}
