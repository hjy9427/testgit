package com.naver;

public class Test {
	
	
	private int a;
	private int b;
	private final int C;
	private final int D = 100;   //����� �� �빮��, ó���� ���� ���������
	private final int A_C = 100;
	
	public Test() {     //���⼭ �ʱ�ȭ�ص���
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
