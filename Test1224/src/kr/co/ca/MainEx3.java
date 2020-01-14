package kr.co.ca;

import com.naver.Test3;

public class MainEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
		t.me1(25);
		t.me1(0);
		
		try {
			t.me2(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("°¨»ç");
		}
		
		System.out.println(";;;;;;;;;");
		int a = t.me4(2);
	}

}
