package com.naver;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ main end���� ���� ��� �ϱ�");
		
		YourThread1 yt1 = new YourThread1();
		yt1.start();
		
		HisThread1 ht1 = new HisThread1();
		ht1.start();
		
		try {
			yt1.join();   //�̰Ŷ��� ���� ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("main end");
	}

}
