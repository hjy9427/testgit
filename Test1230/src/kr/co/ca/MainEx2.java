package kr.co.ca;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable();   //러너블 객체
		Thread t = new Thread(mr);     //스레드 객체
		t.start();     //스레드 생성
		
		
	}

}
