package com.naver;

public abstract class ParentEx {
	
	public void me3() {
		System.out.println("오버라이딩 금지");
	}
	public final void attack() {
		img();
		System.out.println("오버라이딩 금지");
	}
	
	public abstract void img();
}
