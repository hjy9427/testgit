package com.naver;

public class Test3 {
	
	public void me5(int a, int b) {
		a %= b;
		System.out.println(a);
	}
	
	
	public void me4(int a, int b) {
		a /= b;
		System.out.println(a);
	}
	
	
	
	public void me3(int a, int b) {
		a *= b;
		System.out.println(a);
	}
	
	public void me3() {
		int a = 3;
		a *= 4;
		System.out.println(a);
	}
	
	
	
	public void me2(int a, int b) {
		a -= b;
		System.out.println(a);
	}
	
	
	
	
	public void me1() {
		int a = 3;
		int b = 4;
		
		System.out.println(a);
		
		a += b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
