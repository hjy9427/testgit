package com.naver;

public class Test {
	
	private int a;
	private int b;
	private int c;
	
	public static int d;
	static{
		Test.d = 100;
	}
	
	{
		a = 10;
		System.out.println("°´Ã¼ »ı¼º");
	}
	
	public Test() {
		
	}

	
	public Test(int b, int c) {
		a = 10;
		this.b = b;
		this.c = c;
	}


	public int getA() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
