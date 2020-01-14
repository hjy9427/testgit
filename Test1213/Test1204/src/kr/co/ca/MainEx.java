package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		
		System.out.println(t1.getA());
		System.out.println(t2.getA());
		
		t1.setA(20);
		System.out.println(t1.getA());
		System.out.println(t2.getA());
		
		
		
		
		
	}

}
