package game2;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(100);
		
		System.out.println("���������� �ҷ���");
		
		Weapon[] arr = {new Bow(1), new Sword(5), new Spear(10)};
		Weapon hasWeapon = arr[1];
		
		Hero spiderman = new Hero(arr, hasWeapon);
		
		while(true) {
			System.out.println("�޴��� ���ÿ�");
			System.out.println("1.���� 2.���ⱳü3.��������");
			
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
