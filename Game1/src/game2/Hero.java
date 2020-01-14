package game2;

public class Hero {
	private Weapon[] weapons;
	private Weapon hasWeapon;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(Weapon[] weapons, Weapon hasWeapon) {
		super();
		this.weapons = weapons;
		this.hasWeapon = hasWeapon;
	}
	
	public void attack(Monster mon) {
		
		if(mon.getHp() <= 0) {
			return;
		}
		hasWeapon.attack(mon);
		System.out.println(mon.getHp());
	}
	public void changeWeapon(int idx) {
		if(idx < 0 || idx > weapons.length) {
			idx = 0;
	}
		hasWeapon = weapons[idx];
		System.out.println("무기가 교체되었습니다.");

	
}
}