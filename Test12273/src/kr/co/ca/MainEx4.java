package kr.co.ca;

import java.math.BigDecimal;

public class MainEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal big1 = new BigDecimal("2.0");
		BigDecimal big2 = new BigDecimal("1.1");
		System.out.println(2.0 - 1.1);   //0.899999999³ª¿È
	
		BigDecimal result = big1.subtract(big2);
		System.out.println(result);
		
	}

}
