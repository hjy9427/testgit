package com.naver;

public abstract class ParentEx {
	
	public void me3() {
		System.out.println("�������̵� ����");
	}
	public final void attack() {
		img();
		System.out.println("�������̵� ����");
	}
	
	public abstract void img();
}
