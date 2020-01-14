package kr.co.ca;

import com.naver.MyThread;
import com.naver.Sum;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum(0);
		
		MyThread mt1 = new MyThread(sum, 0, 10000); //0부터10000까지
		mt1.start();
		
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(sum.num);
	}

}
