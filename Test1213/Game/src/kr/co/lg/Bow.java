package kr.co.lg;

public class Bow extends Weapon {
	
	public Bow() {
		
		
	}
	
	public Bow(int attackPower) {
		super(attackPower);
	}

	@Override
	public void img() {    //이미지 메서드 오버라이딩
		System.out.println("화살이 빗발칩니다.");
	}

	@Override
	public String toString() {
		return "활";
	}
	
	
	
}
