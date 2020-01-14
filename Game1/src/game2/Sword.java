package game2;

public class Sword extends Weapon{
	public Sword() {
		// TODO Auto-generated constructor stub
	}

	public Sword(int attackPower) {
		super(attackPower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void img() {
		// TODO Auto-generated method stub
		System.out.println("검으로 적을 베어냅니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "검";
	}
	
	

}
