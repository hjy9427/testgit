package kr.co.ca;

import com.naver.MyThread;
import com.naver.Sum;

public class MainEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum(0);
		
		MyThread mt1 = new MyThread(sum, 0, 5000);
		MyThread mt2 = new MyThread(sum, 5001, 10000);
		
		mt1.start();
		mt2.start();
		
		try {
			mt1.join();
			mt2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(sum.num);
		System.out.println(sum.val);
	}

}
