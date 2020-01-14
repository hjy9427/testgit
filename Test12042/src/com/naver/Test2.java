package com.naver;

public class Test2 {
	private int a;
	private int b;
	private boolean c;
	private Test t;
	
	public Test2() {
		// TODO Auto-generated constructor stub
	}

	



	public Test2(int a, int b, boolean c, Test t) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.t = t;
	}





	public Test2(int a, Test t) {
		super();
		this.a = a;
		this.t = t;
	}





	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}

	public Test getT() {
		return t;
	}

	public void setT(Test t) {
		this.t = t;
	}
	
	
}
