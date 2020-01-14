package com.naver;

public class Test {
	
	int num = 0;
	
	public void me4() {
		System.out.println(--num);
		System.out.println(num);
		
	}
	
	
	public void me3() {
		System.out.println(num--);
		System.out.println(num);
	}
	
	
	public void me2() {
		System.out.println(++num);
		System.out.println(num);
	}
	
	public void me1() {
		System.out.println(num++);
		System.out.println(num);
	}
}
