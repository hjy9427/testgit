package kr.co.ca;

import java.math.BigInteger;

public class MainEx3 {
	public static void main(String[] args) {
		//BigInteger, long: 8 = 64 bit...63bit
		long a = 99999999999999999L;
		BigInteger bigNum1 = new BigInteger("99999999999999999");
		BigInteger bigNum2 = new BigInteger("99999999999999999");
		BigInteger result = bigNum1.add(bigNum2);
		System.out.println(result);
		BigInteger result1 = bigNum1.multiply(bigNum2);
		BigInteger result2 = bigNum1.subtract(bigNum2);
		BigInteger[] arr = bigNum1.divideAndRemainder(bigNum2);
		//몫과 나머지가 나와야 돼서 배열로함
		BigInteger result3 = bigNum1.divide(bigNum2);
	}
}
