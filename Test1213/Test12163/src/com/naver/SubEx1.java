package com.naver;

import java.util.Scanner;

public class SubEx1 extends SuperEx {
	public void show1() {
		me1();	
		}
	

	@Override
	public void me2() {
		for(int dan = 2; dan < 10; dan++) {
			dan1(dan);
		}
		
	}
		private void dan1 (int dan) {
			for (int i = 1; i < 10; i++) {
				System.out.print(dan);
				System.out.print("*");
				System.out.print(i);
				System.out.print("=");
				System.out.println(dan * i);
			}
			}


		@Override
		public void me1() {
			Scanner sc = new Scanner(System.in);
			System.out.println("단을 입력하세요");
			int dan = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.print(dan);
				System.out.print("*");
				System.out.print(i);
				System.out.print("=");
				System.out.println(dan * i);
			}
			
			sc.close();
			
			

			
		}
	
		
		
		
		
		
		
	
}
