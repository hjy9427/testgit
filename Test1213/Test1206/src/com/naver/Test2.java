package com.naver;

public class Test2 {
	
	public void me5(int data, int a, int b, int c) {
		data = 12345;
		a = 5;
		b = 7;
		c = 3;
		
		int result = ((data ^ a) ^ b) ^ c;
		int result2 = ((result ^ c) ^ b) ^ a;
		System.out.println(result2);
	}
	
	public void me4() {
		int a = 5 ^ 6;
		System.out.println(a);
	}
	
	public void me3() {
		int a = 5 | 6;
		System.out.println(a);
	}
	
	public int me2(int a, int b) {
		int result = a & b;
		return result;
	}
	
	
	
	public void me1() {
		int a = 5 & 6;
		System.out.println(a);
	}
		

}
