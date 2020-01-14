package com.naver;

public class MyThread extends Thread {

	private int start;
	private int end;
	private Sum sum;

	
	
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread(int start, int end, Sum sum) {
		
		this.start = start;
		this.end = end;
		this.sum = sum;
	}



	@Override
	public void run() {
		for (int i = start; i < end+1; i++) {
			sum.plusNum(i);
			sum.plusVal(i);
			
		}
	}
}
