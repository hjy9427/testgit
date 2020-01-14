package kr.co.ca;

public class MyThread3 extends Thread{

	@Override
	public void run() {
		System.out.println("스레드 작업전");
		while(true) {
			System.out.println(getName());
			System.out.println("스레드 작업중");
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	

}
