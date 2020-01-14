package kr.co.ca;

import com.naver.Car;


public class MainEx {

	public static void main(String[] args) {
		Car sm5 = new Car();
		try {
			sm5.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("타이어수리하자");
		}
	}

}
