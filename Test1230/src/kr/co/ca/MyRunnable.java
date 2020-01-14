package kr.co.ca;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// 스레드가 해야할 일
		System.out.println("MyRunnable클래스를이용해서 만든 스레드실행");
		
	}

}
