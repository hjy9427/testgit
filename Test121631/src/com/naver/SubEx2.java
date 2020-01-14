package com.naver;

public class SubEx2 extends SuperEx{//서브클래스 자식 클래스-부모클래스는 슈퍼클래스
	public void test() {
		me1();
	}

	@Override
	public void me1() {
		
		System.out.println("good");
	}
	
	
	
}
