package kr.co.ca;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable();   //���ʺ� ��ü
		Thread t = new Thread(mr);     //������ ��ü
		t.start();     //������ ����
		
		
	}

}
