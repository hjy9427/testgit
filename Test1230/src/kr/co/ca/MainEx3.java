package kr.co.ca;

public class MainEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {

			@Override
			public void run() {
				System.out.println("익명의 내부클래스를 이용해 만든 스레드");
			}
			
		}.start();//소괄호까지가 스레드 객체
	}

}
