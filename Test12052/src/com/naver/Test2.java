package com.naver;

public class Test2 {
	
	public boolean ls6(Dog a, Dog b) {
		return a != b;
	}
	
	
	
	public void ls5(double a) {
		boolean result = a == 3.4;
		System.out.println(result);
	}
	
	public boolean ls4(float a) {
		boolean result = a <= 3.4F;
		return result;
	}
	
	
	
	public void ls3(long a, long b) {
		boolean result = a < b;
		System.out.println(result);
	}
	
	
	
	
	public boolean ls2(byte a, byte b) {
		boolean result = a >= b;
		return result;
		
	}
	
	
	public void ls1(int a, int b) {
		boolean result = a > b;
		System.out.println(result);
	}
	
	
	
}
