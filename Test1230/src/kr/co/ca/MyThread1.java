package kr.co.ca;

public class MyThread1 extends Thread {

	public MyThread1(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("MyThread1Ŭ������ �̿��ؼ� ���� ������");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
	}

	
	
}
