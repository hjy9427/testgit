package kr.co.ca;

import com.naver.Sum;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum  sum = new Sum(0);
		
		for (int i = 0; i < 1001; i++) {
			sum.plusNum(i);
			
		}
		
		System.out.println(sum.num);
	}

}
