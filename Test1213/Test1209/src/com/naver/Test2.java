package com.naver;

public class Test2 {

	public void test5() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i % 3);
		}
	}
	
	
	
	public void test4() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			int key = i % 2; 
			switch (key) {
			case 0:
				System.out.println("´Â Â¦¼ö");
				break;

			default:
				System.out.println("´Â È¦¼ö");
				break;
			}
		}
	}
	
	
	
	public void test3() {
		
		for (int i = 0; i < 100; i++) {
			System.out.print(i);
			if(i % 2 == 0) {
				System.out.println("´Â Â¦¼ö");
			} else {
				System.out.println("´Â È¦¼ö");
			}
	
		}
			
	}
	
	
	
	public void test2() {
		for (int i = 0; i < 100; i++) {
			int key = i % 2;
			switch (key) {
			case 0:
				System.out.println(i);
				break;

			}
		}
	}
	
	
	public void test1() {
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
	}
	
	
	public void k4(int score) {
		int key = score / 10;
		switch (key) {
		case 10:
		case 9:
			System.out.println('a');
			break;
		case 8:
			System.out.println('b');
			break;
		case 7:
			System.out.println('c');
			break;
		case 6:
			System.out.println('d');
			break;
		default:
			System.out.println('f');
			break;
		}
	}
	
	public void k3(int month) {
		if(month < 1 || month > 12) {
			return;
		}
		switch (month) {
		case 2:
			System.out.println(28);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
			break;
		}
	}
	
	
	public void k2(int key) {
		
		
		
		
		switch (key) {
		
		case 5:
			System.out.println("hello");
			break;

		case 1:
			System.out.println("ok");
			break;
		default:
			System.out.println("end");
			break;
		}
	}
}
