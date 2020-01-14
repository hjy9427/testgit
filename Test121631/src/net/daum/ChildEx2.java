package net.daum;

public class ChildEx2 extends ParentEx{
	
	private int a;//부모도 있다.
	
	public ChildEx2() {
		
	}

	public ChildEx2(int a) {
		super();//디폴트 생성자를 호출하는 코드
		this.a = a;
		
		super.setA(a);//이것은 부모 사용자 생성자 값을 바꿔줘서 부모의 멤버변수값a를 바꿔준다
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
}
