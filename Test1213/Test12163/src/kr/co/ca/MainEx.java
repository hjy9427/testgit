package kr.co.ca;

import java.util.Scanner;

import com.naver.SubEx1;
import com.naver.SubEx2;
import com.naver.SuperEx;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  //ǥ���Է���ġ system.in Ű����
		System.out.println("�̸��� �Է��ϼ���.");
		String msg = sc.nextLine();
		System.out.println(msg);
		
		sc.nextLine();
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
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
