package com.naver;

public class HisThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("his thread의 run() 안 입니다.");
	}
}
