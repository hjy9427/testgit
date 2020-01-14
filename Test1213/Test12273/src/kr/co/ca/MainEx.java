package kr.co.ca;

import java.util.Calendar;
import java.util.Scanner;

public class MainEx {
	
	public void me1(Scanner sc) {
		System.out.println("달을 입력하세요");
		int month = sc.nextInt();
		sc.nextLine();
		
		month = month - 1;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		int lastdate = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastdate);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		//캘린더는 앱스트랙트 클래스임 그래서 객체를 생성하면 안됨 그래서 겟인스턴스라는 메서드 이용
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		
		
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DATE, 19);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DATE);
		day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		
		
		
	}

}
