package game2;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(100);
		
		System.out.println("무기정보를 불러옴");
		
		Weapon[] arr = {new Bow(1), new Sword(5), new Spear(10)};
		Weapon hasWeapon = arr[1];
		
		Hero spiderman = new Hero(arr, hasWeapon);
		
		while(true) {
			System.out.println("메뉴를 고르시오");
			System.out.println("1.공격 2.무기교체3.게임종료");
			
			int menu = sc.nextInt();
			if(menu == 3) {
				break;
			} else if (menu == 1) {
				spiderman.attack(mon);
			} else {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(i + "=" + arr[i]);
				}
				int idx = sc.nextInt();
				spiderman.changeWeapon(idx);
			}
			
		}
		
	}

}
