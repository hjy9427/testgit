package com.naver;

public class YourThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("������ main end���� ���� ��� �ϱ�");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		
		try {
			yt1.join();   //�̰Ŷ��� ���� ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("main end");
	}

}
