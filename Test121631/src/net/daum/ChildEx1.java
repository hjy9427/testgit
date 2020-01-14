package net.daum;

public class ChildEx1 extends ParentEx {
	private int z;
	
	public ChildEx1() {
		super();//부모의 디폴트 생성자이다.있었었다.부모클스를 말한다
		
	}

	public ChildEx1(int z) {
		super(z);//부모클래스의 생성자 호출,여지껏 부모 변수.메소드 그냥 이름만 넣어서 사용한건  super가 있었기 때문이다.보이지는 않았지만.
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	

}
