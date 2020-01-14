package kr.co.ca;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "m001";
		String name = "kim";
		int age = 10;
		Test t1 = new Test("m001", "lee", 55);
		
		Test2 t2 = new Test2(3, t1);
		
		Test2 t21 = new Test2(44, new Test("m001", "hell", 44));
		
		Test3 t3 = new Test3("ad", 3, false, 'a');
		
		Test3 t31 = new Test3("kim", 0, false, 'c');
		
		int[] arr = new int[4]; 
		Test5 t5 = new Test5(new StringBuffer("hello"), arr, false);
		
	
		
	}

}
