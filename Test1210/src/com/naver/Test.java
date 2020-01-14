package com.naver;

public class Test {
	
	public void me111(int a) {
		int skip = 3;
		for (int i = 0; i < 10; i++) {
			if(i == skip) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void me6() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
 	
	public void sossu(int start, int end) throws Exception {
		
		if(start < 2) {
			throw new Exception("소수는 2이상부터");
		}
		for (int num = start; num < end; num++) {
			me5(num);
		}
	}	
		
	
	
	public void me5(int num) {
		boolean isSossu = true;
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				isSossu = false;
				break;
			}
			
		}
		
		System.out.print(num);
		if(isSossu == true) {
			System.out.println(" 는 소수입니다.");
		} else {
			System.out.println(" 는 소수가 아닙니다.");
		}
	}
	
	
	
	public void me5() {
		int num = 27;
		
		
		boolean isSossu = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isSossu = false;
				System.out.println("xxx");
				break;
				} 
			}
		
			System.out.print(num);
		if(isSossu) {
			System.out.println("은 소수입니다.");
		} else {
			System.out.println("은 소수가 아닙니다.");
		}
	}
	
	public void me42() {
		for (int dan = 2; dan < 10; dan++) {
			me41(dan);
		}}
	
	
	public void me41(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.print(dan + " * ");
			System.out.print(i);
			System.out.print("= ");
			System.out.println(dan * i);
		}
	}
	
	
	public void me4() {
		for (int i = 1; i < 10; i++) {
			System.out.print("5 * ");
			System.out.print(i);
			System.out.print("= ");
			System.out.println(5 * i);
		}
	}
	
	public void me3(int start, int end) {
		for (int i = start; i < end + 1; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
		}
	}
	
	
	public void me21() {
		for(int i = 10; i <= 100; i++) {
			if(i % 21 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void me2(int start) {
		for(int i = start; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.println(i);
		}
	}
	
	public void me0() {
		for(int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
	}
 
	public void me12() {
		for(int i = 100; i >= 0; i--) {
			if (i % 3 == 0)
			System.out.println(i);
		}		
	}
	
	
	
	public void me11() {
		for(int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	public void me1() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			System.out.println("hello world");

		}
	}
}
