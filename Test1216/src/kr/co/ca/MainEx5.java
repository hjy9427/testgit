package kr.co.ca;

import kr.co.samsung.BMW;
import kr.co.samsung.Car;
import kr.co.samsung.Person3;
import kr.co.samsung.SM5;
import kr.co.samsung.SM7;
import kr.co.samsung.Sonata;

public class MainEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		Sonata s1 = new Sonata();
		SM5 s5 = new SM5();
		
		Car[] cars = {b1, b2, s1, s5, new SM7()};
		
		
		Person3 anh = new Person3(cars);
	}

}
