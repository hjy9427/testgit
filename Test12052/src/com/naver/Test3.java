package com.naver;

public class Test3 {
	
	public void test2(boolean a) {
		 if(a) {
			 System.out.println("a는 참입니다.");
		 }else {
			 System.out.println("a는 거짓입니다");
		 }
	}
	
	
	
	public void key5(int a, int b, int c) {
		boolean d = (a > b) && (b < c);
	}
	
	
	public void key4(boolean a, boolean b, boolean c) {
		boolean d = (a && b) || c;
		System.out.println(d);
	}
	
	boolean n = true;
	public void test() {
		n = !n;
		System.out.println(n);
		
		
	}
	
	public void key3() {
		boolean a = true;
		boolean b = !a;
		System.out.println(b);
		
		a = false;
		b = !a;
		System.out.println(b);
	}
	
	public void key2() {
		boolean a = true || true;
		System.out.println(a);
	
		boolean b = true || false;
		System.out.println(b);
		
		boolean c = false || true;
		System.out.println(c);
		
		boolean d = false || false;
		System.out.println(d);
	}

	public void key1() {
		boolean a = true && true;
		System.out.println(a);
		
		
		boolean b = true && false;
		System.out.println(b);
		
		boolean c = false && true;
		System.out.println(c);
		
		
	}
	
}
