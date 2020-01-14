package kr.co.lg;

import kr.co.daum.Monster;

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
		int bHp = mon.getHp();   //Ǯhp  bHp beforeHp
		int aHp = bHp - attackPower;    //aHp afterHp
		
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
