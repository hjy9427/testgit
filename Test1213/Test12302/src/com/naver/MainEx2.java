package com.naver;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		HerThread ht1 = new HerThread(yt1);
		ht1.start();
		
		
		System.out.println("main end");
	}

}
