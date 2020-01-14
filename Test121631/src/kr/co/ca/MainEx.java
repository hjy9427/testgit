package kr.co.ca;

import java.util.Scanner;

import com.naver.SubEx1;
import com.naver.SubEx2;
import com.naver.SuperEx;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//표준입력장치,키보드가 시스템인)
		
		System.out.println("숫자를 입력하세요");
		String num =sc.next();
		System.out.println(num);
		
		sc.nextLine();
		
		System.out.println("이름을 입략하세요");
		String msg = sc.next();
		System.out.println(msg);
		
		
		sc.close();//반드시 닫기를 해줘야한다
		
		
		
		SubEx1 s1 = new SubEx1();
		s1.show1();
		
		SubEx2 s2 = new SubEx2();
		s2.test();
		
		SuperEx s3 = new SubEx2();//앞은 부모 /뒤는 자식생성자
		s3.me1();
		
		
	}

}
