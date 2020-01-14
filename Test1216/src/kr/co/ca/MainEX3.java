package kr.co.ca;

import kr.co.samsung.BMW;
import kr.co.samsung.Person1;
import kr.co.samsung.Sonata;

public class MainEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person1 kim = new Person1(new Sonata(), new BMW());
		Person1 lee = new Person1(null, new BMW());
		Person1 park = new Person1(new Sonata(), null);
		Person1 choi = new Person1(null, null);
		//Person1 anh = new Person1(new K5(), null);
		
		kim.setS(new Sonata());
	}

}
