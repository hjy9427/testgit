package com.naver;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("무조건 main end보다 먼저 찍게 하기");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		
		HisThread1 ht1 = new HisThread1();
		ht1.start();
		
		try {
			yt1.join();   //이거땜에 먼저 찍힘
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("main end");
	}

}
