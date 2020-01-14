package kr.co.lg;

public class Sword extends Weapon {
	
	
	
	public Sword() {
		// TODO Auto-generated constructor stub
	}


	public Sword(int attackPower) {
		super(attackPower);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void img() {
		System.out.println("검으로 마구 내려칩니다.");
	}


	@Override
	public String toString() {
		return "검";
	}
	
	
}
