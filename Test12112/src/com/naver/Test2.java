package com.naver;

public class Test2 {
	
	
	private int idx;
	
	public void t6(int start, int end) {
		int count = 0;
		for(int i = start; i < end + 1; i++) {
			sossu1(i, count);
		}
		
		int[] arr = new int[count];
		int idx = 0;
		
		for(int num = start; num < end + 1; num++) {
			idx = sossu2(num, arr, idx);
			
			
		}
		for(int x : arr) {
			System.out.println(x);
		}
		
	}
	
	
	private int sossu2(int num, int[] arr, int idx) {
		// TODO Auto-generated method stub
		boolean isSossu = true;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isSossu = false;
				break;
			}
		}
		
		if(isSossu) {
			arr[idx++] = num;
			
		}
		return idx;
		
		
	}


	public void t5(int start, int end) {
		int count = 0;
		for(int i = start; i < end + 1; i++) {
			 count = sossu1(i, count);
		}
		
		int[] arr = new int[count];
		
		for(int i = start; i < end + 1; i++) {
			sossu2(i, arr);
		}
	
	
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			System.out.println(num);
		}
	}
	
	private void sossu2(int num, int[] arr) {
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
			++idx;
		}
	}


	public void t4(int start, int end) {
		int count = 0;
		
		for(int i = start; i <end + 1; i++) {
			count = sossu1(i, count);
		}
		
		
		int[] arr = new int[count];
	}
	
	public void t3(int start, int end) {
		int count = 0;
		for(int i = start; i < end + 1; i++) {
			count = sossu1(i, count);
		}
		System.out.println(count);
		
	}
	
	private int sossu1(int num, int count) {
		boolean isSossu = true;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isSossu = false;
				break;
			}
		}
		
		
		if(isSossu == true) {
			++count;
		}
		
		return count;
	}
	
	
	
	
	
	public void t2() {
		Dog d = new Dog(1, "hello");
		System.out.println(d.getMaster());
		w2(d);
		System.out.println(d.getMaster());
	}
	private void w2(Dog d) {
		// TODO Auto-generated method stub
		
		System.out.println(d.getMaster());
	}
	public void t1() {
		int a = 10;
		w1(a);
		System.out.println(a);
	}
	
	private void w1(int a) {
		a = a * 10;
		System.out.println("w1¿¡¼­ÀÇ a:" + a);
	}
}
