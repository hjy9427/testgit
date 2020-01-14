package com.naver;

public class YourThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("무조건 main end보다 먼저 찍게 하기");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		
		try {
			yt1.join();   //이거땜에 먼저 찍힘
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("main end");
	}

}
