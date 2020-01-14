package com.naver;

public class HerThread extends Thread {
	
	private YourThread1 yt1;
	public HerThread() {
		// TODO Auto-generated constructor stub
	}
	public HerThread(YourThread1 yt1) {
		super();
		this.yt1 = yt1;
	}
	@Override
	public void run() {
		try {
			yt1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println(333);
	}

	
	
	
}
