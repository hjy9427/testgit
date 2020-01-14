package com.naver;

public class Test {
	
	
	
	public void me6() {
		int i = 0;
		while (i < 100) {
			
			if(i % 3 == 00) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	
	public void me5() {
		int i = 100;
		while (i < 50) {
			System.out.println(111);
			i++;
			
		}
		
		do {
			System.out.println(222);
			i++;
		} while (i < 50);
	}
	
	
	public void sossu(int start, int end, int count) {
		boolean isSossu = true;
		int i = start;
		
		while(i < end + 1) {
		int find = isSossu(i);
		count = count - find;
		if(count == 0) {
			break;
		}
			i++;
		}
	}

	public int isSossu(int num) {
		boolean isSossu = true;
		int i = 2;
		while (i < num) {
			if (num % i == 0)
				isSossu = false;
			break;
		}
			i++;
		
		System.out.print(num);
		
			if(isSossu == true) {
				System.out.println(" 는 소수입니다.");
				return 1;
			} else {
				System.out.println(" 는 소수가 아닙니다.");
				return 0;
			}
		}


	public void gugudan3() {
		int i = 1;
		while (i < 10) {
			reversdan(i);
			System.out.println();
			i++;
		}
	}
	
	
	private void reversdan(int i) {
		int dan = 2;
		while(dan < 10) {
			System.out.print(dan+ " * ");
			System.out.print(i);
			System.out.print("=");
			System.out.print(dan * i);
			System.out.print("\t");
			dan++;
			
		}
	}
	
	
	public void gugudan2() {
		int dan = 2;
		while (dan < 10) {
			int i = 1;
			while(i < 10) {
				System.out.print(dan + " * ");
				System.out.print(i);
				System.out.print("=");
				System.out.println(dan * i);
				i++;
			}
			dan++;
		}
	}
	
	public void gugudan() {
		int dan = 2;
		while (dan < 10) {
			me4(dan);
			dan++;
		}
	}
	
	
	public void me4(int dan) {
		int i = 1;
		while(i < 10) {
			System.out.print(dan + " * ");
			System.out.print(i);
			System.out.print("=");
			System.out.println(dan * i);
			i++;
			
		}
	}
	
	
	
	
	public void me31 (int start, int end) {
		if(start % 2 != 0) {
			start = start + 1;
		}
		while(start < end+1) {
			System.out.println(start);
			start += 2;
		}
	}
	public void me3(int start, int end) {
		
		while(start < end + 1) {
			if(start % 2 == 0) {
				System.out.println(start);
				start++;
			}
			
		}
		
		
	}
	public void me2() {
		int i = 0;
		while (i < 101) {
			System.out.println(i);
			i += 4;
		}
	}
	
	public void me13() {
		int i = 0;
		while(i < 101) {
			System.out.println(i);
			
			i += 3;
		}
	}
	
	
	
	public void me12() {
		int i = 0;
		while (i < 101) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	
	public void me11() {
		int i = 0;	
		while(i < 101) {
			System.out.println(i);
			i++;
			
		}
	}

	public void me1() {
		for(int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
}
