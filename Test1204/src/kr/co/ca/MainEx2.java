package kr.co.ca;

import com.naver.Test2;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.b = 10000;
		System.out.println(Test2.b);
		System.out.println(":::::::");
		
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		System.out.println(t1.b);
		System.out.println(t2.b);
		
		t1.b = -1;
		
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(Test2.b);
		
	}

}
