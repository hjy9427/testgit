package com.naver;

public class Test1 {
	public int a = 10;
	public final int B_A = 100;
	public void me1() {
		System.out.println(a);
		System.out.println(B_A);
	}
	
	public class MIC{
		
		public int z = 5;
		public final int Y_X = 500;
		public void ko() {
			System.out.println(z);
			System.out.println(Y_X);
			System.out.println(a);
			System.out.println(B_A);
			me1();
			
			//외부클래스(Test1)의 자원을 가져다 쓰려고 이렇게 함
		}
	}
	
	//MIC Member inner class
	
	
}


class Dog {
	
}