package com.naver;

public abstract class SuperEx {
	int a;
	
	public SuperEx() {
		// TODO Auto-generated constructor stub
	}
	
	public SuperEx(int a) {
		super();
		this.a = a;
	}
	
	public abstract void me1(); 
	public abstract void me2(); 
	public abstract void me3();
		
	
	public abstract void me4(); 
	
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
}
