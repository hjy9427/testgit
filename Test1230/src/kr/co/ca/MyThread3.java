package kr.co.ca;

public class MyThread3 extends Thread{

	@Override
	public void run() {
		System.out.println("������ �۾���");
		while(true) {
			System.out.println(getName());
			System.out.println("������ �۾���");
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	

}
