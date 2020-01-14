package kr.co.ca;

import java.util.Scanner;

import com.naver.Hero;

import kr.co.daum.Monster;
import kr.co.lg.Bow;
import kr.co.lg.Spear;
import kr.co.lg.Sword;
import kr.co.lg.Weapon;
import kr.co.lg.WeaponSpec;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Monster mon = new Monster(WeaponSpec.MONSTER_HP_1);
		
		System.out.println("DB���� ���� ������ �����ɴϴ�.");
		Weapon[] arr = {new Bow(1), new Sword(3), new Spear(10)
		
				};
		Weapon hasWeapon = arr[1];
		
		Hero spiderman = new Hero(arr, hasWeapon);
		
		while (true) {
			System.out.println("�޴��� ������.");
			System.out.println("1: ����, 2: ���� ���� 3: ���� ����");
			int menu = sc.nextInt();
			if(menu == 3) {
				break;
			} else if (menu == 1) {
				spiderman.attack(mon);
			} else {
				for(int i = 0; i < arr.length; i++) {
					System.out.println(i+": ");
					System.out.println(arr[i]);
				}
				int idx = sc.nextInt();
				spiderman.changeWeapon(idx);
			}
		}
		
		sc.close();
		
	}

}
