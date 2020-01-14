package com.naver;

import java.util.Random;

public class Test {
	
	
	public void me7() {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(5 + 1 - (-5)) - 5;
			System.out.println(num);
			
		}
	}
	public void me6() {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(23 + 1 - 10) + 10;
			System.out.println(num);
		}
	}
	
	
	public void me5() {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(45 + 1 - 1) + 1;
			System.out.println(num);
	}
	}
	
	public void me4() {
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt(5);
			System.out.println(num);
		}
		
	}
	
	public void me3() {
		Random rnd = new Random(System.currentTimeMillis());
	
		for (int i = 0; i < 10; i++) {
			int num = rnd.nextInt();
			System.out.println(num);
		}
		
		
		
	}
	public void me2() {
		Random rnd1 = new Random(10L);
		Random rnd2 = new Random(1L);
	
		for (int i = 0; i < 10; i++) {
			int num1 = rnd1.nextInt();
			int num2 = rnd2.nextInt();
			System.out.println(num1 == num2);
		}
		
		
	}
	
	
	
	public void me1() {
		Random rnd = new Random();
		
	}
}
