package kr.co.lg;
public class Spear extends Weapon {
	 public Spear() {
		// TODO Auto-generated constructor stub
	}

	public Spear(int attackPower) {
		super(attackPower);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void img() {
		System.out.println("¸ó½ºÅÍÀ¸ ¤Ó¸ö¿¡ ±¸¸ÛÀÌ ½ö½ö ³³´Ï´Ù.");
	}

	@Override
	public String toString() {
		return "Ã¢";
	}
	 
	 
}
