package com.naver;

public class Test {
	
	
	public void me4() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void me3(int[] arr) {
		try {
			System.out.println(arr[4]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(arr[arr.length - 1]);
		}
	}
	
	
	
	public void me2(int num) {
		try {
			System.out.println(4/num);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(4/1);//예외발생하면 이거 출력하란 얘기
		}
		
	}
	
	
	public int me1(String msg) {
		int idx = -1;
		try {
			int b = 3;
			idx = msg.indexOf("a");
			System.out.println(111);
		} catch (Exception e) {
			e.printStackTrace();  //예외가 발생하는지 알려줌
			System.out.println(222);//정상이면 111찍히고 비정상이면 222찍힘
		}
		
		return idx;
	}
}
