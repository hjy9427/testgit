package com.naver;

public class Test {
	
	
	private int a;
	private int b;
	private final int C;
	private final int D = 100;   //상수는 다 대문자, 처음에 값을 정해줘야함
	private final int A_C = 100;
	
	public Test() {     //여기서 초기화해도됨
		a = 10;
		b = 100;
		C = 111;
	}

	public Test(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		C = c;
	}
	
	
	
}
