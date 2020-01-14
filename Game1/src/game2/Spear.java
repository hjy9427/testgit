package game2;

public class Spear extends Weapon{
	public Spear() {
	// TODO Auto-generated constructor stub
	}

	public Spear(int attackPower) {
		super(attackPower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void img() {
		// TODO Auto-generated method stub
		System.out.println("창으로 적을 찌릅니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "창";
	}
	
	
	
}
