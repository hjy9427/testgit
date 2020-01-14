package game2;

public class Bow extends Weapon{
	public Bow() {
		// TODO Auto-generated constructor stub
	}

	public Bow(int attackPower) {
		super(attackPower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void img() {
		// TODO Auto-generated method stub
		System.out.println("화살이 빗발칩니다.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "활";
	}
	
	
	
}
