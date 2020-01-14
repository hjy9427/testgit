package com.naver;

public class Test {
	
	
	
	
	
	int n = 1;
	public void test() {
		n = 1-n;
		System.out.println(n);
	}
	
	public void me51(int a) {
		for(int i = 0; i < 100; i++) {
			int result = i % a;
			System.out.println(result);
		}
	}
	
	
	public void me5(int a, int b) {
		System.out.println(a % b);
	}
	
	
	public void me4(int a, int b) {
		System.out.println(a / b);
	}
	
	
	
	public void me3(int a, int b) {
		System.out.println(a * b);
	}
	
	
	public void me2(int a, int b) {
		System.out.println(a - b);
	}
	
	
	
	
	public void me11(String a, String b) {
		System.out.println(a + b);
	}
	
	public void me11(int a, int b) {
		System.out.println((long)a + b);
	}
	
	
	public void me1() {
		System.out.println(3 + 5);
		System.out.println("3 + 5 =");
		
		int a = 3;
		int b = 5;
		System.out.println(a + b);
	
	}
}
