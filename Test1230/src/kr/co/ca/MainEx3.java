package kr.co.ca;

public class MainEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {

			@Override
			public void run() {
				System.out.println("�͸��� ����Ŭ������ �̿��� ���� ������");
			}
			
		}.start();//�Ұ�ȣ������ ������ ��ü
	}

}
