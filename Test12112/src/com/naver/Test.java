package com.naver;

import java.util.Iterator;

public class Test {
	private int count = 0;
	private int[] arr = null;
	private int idx = 0;
	
	public void me10(int start, int end) {
		
		for(int num = start; num < end + 1; num++) {
			sossu(num);
		
		}
		arr = new int[count];
		
		for (int num = 0; num < arr.length; num++) {
			sossu2(num);
		}
		
		
	}
	private void sossu2(int num) {
		// TODO Auto-generated method stub
		boolean isSossu = true;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isSossu = false; 
				break;
			}
		}
		if(isSossu) {
			arr[idx] = num;
			idx++;
		}
		
		
		
	}
	private int sossu(int num) {
		
		
		boolean isSossu = true;
		for (int i = 2; i < num+1; i++) {
			if(num % i == 0) {
				break;
			}
		}
		
		if(isSossu) {
			
			++count;
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + " 은 소수아님");
		}
		return count;
	}
	
	
	public void me9() {
		String str = "hello#world#good#morning#!!!";
		String[] arr = str.split("#");

		for(int i = 0; i < arr.length; i++) {
			String msg = arr[i];
			System.out.println(msg);
		}
		
		
		
	}
	
	
	public void me8() {
		String[] names = {"kim", "lee", "park", "kang"};
		Dog[] arr = new Dog[4];
		for(int i = 0; i < arr.length; i++) {
			arr[i] =new Dog(i+1, names[i]);
		}
		for(int i = 0; i < arr.length; i++) {
		Dog d = arr[i];
		String master = d.getMaster();
		System.out.println(master);
		}
		
	}
	
	
	
	public void me7() {
		int[] arr = new int[16];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i % 4;
		}
		for(int i = 0; i < arr.length; i++) {
			int n = arr[i];
			System.out.println(n);
		}
	}
	
	
	
	public void me63() {
		boolean[]arr = new boolean[5];
		
		boolean s = false;
		
		for (int i = 0; i < arr.length; i++) {
			s = !s;
			arr[i] = s;
		}
	}
	
	
	
	
	
	public void me62() {
		int[] arr = new int[8];
		
		arr[0] = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 - arr[i-1];
			
		
		}
	}
	
	public void me61() {
		boolean[] arr= new boolean[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
	}
	
	
	
	
	public void me6() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void me53() {
		Dog[] arr = {new Dog(1, "kim"), new Dog(2, "lee"), new Dog(3, "park"), new Dog(4, "kang")};
	}
	
	
	
	public void me52() {
		boolean[] arr = {true, true, false, true, true, false, false};
	}
	
	public void me51() {
		int[] arr = {1, 1, 2, 3, 5, 8, 13, 21, 24};
	}
	
	public void me5() {
		int[] arr = {2, 3, 5, 7, 11, 13};
	}
	
	public void me4() {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public int[] me3() {
		int[] arr = {1, 2, 3, 4, 5};
		
		return arr;
	}
	

}
