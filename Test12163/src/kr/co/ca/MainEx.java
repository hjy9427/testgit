package kr.co.ca;

import java.util.Scanner;

import com.naver.SubEx1;
import com.naver.SubEx2;
import com.naver.SuperEx;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  //표준입력장치 system.in 키보드
		System.out.println("이름을 입력하세요.");
		String msg = sc.nextLine();
		System.out.println(msg);
		
		sc.nextLine();
		
		System.out.println("숫자를 입력하시오");
		String num = sc.next();
		System.out.println(num);
		
		
		sc.close();   
		
		
		SubEx1 s1 = new SubEx1();
		s1.show1();
		
		SubEx2 s2 = new SubEx2();
		s2.test();
		
		SuperEx s3 = new SubEx2();
		s3.me1();
	}

}
