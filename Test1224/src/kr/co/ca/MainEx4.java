package kr.co.ca;

import com.naver.Test4;

public class MainEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = new Test4();
		t.me1();
		
		try {
			t.me2();
		} catch (Exception e) {
			System.out.println("욕설을 금지합니다.");
		}
		
		
	}

}
