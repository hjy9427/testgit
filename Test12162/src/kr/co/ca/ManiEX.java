package kr.co.ca;

import com.naver.BMW;
import com.naver.Car;
import com.naver.Person3;
import com.naver.Sonata;

public class ManiEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Sonata();
		Car c3 = new BMW();
		
		Car[] cArr = {c1, c2, c3, new Sonata()};
		
		Person3 honggildong = new Person3(cArr);
		
	}

}
