package game2;

public abstract class Weapon {
	private int attackPower;
	
	 public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(int attackPower) {
		super();
		this.attackPower = attackPower;
	}

	
	public void attack(Monster mon) {
		img();
		int bHp = mon.getHp();
		int aHp = bHp - attackPower;
		mon.setHp(aHp);
	}
	
	public abstract void img();
	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	 
	 
}
