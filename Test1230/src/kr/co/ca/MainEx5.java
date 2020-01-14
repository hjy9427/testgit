package kr.co.ca;

public class MainEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 mt1 = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();
		
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
