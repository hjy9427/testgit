package kr.co.ca;

import java.util.Scanner;

import com.naver.SubEx1;
import com.naver.SubEx2;
import com.naver.SuperEx;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//ǥ���Է���ġ,Ű���尡 �ý�����)
		
		System.out.println("���ڸ� �Է��ϼ���");
		String num =sc.next();
		System.out.println(num);
		
		sc.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���");
		String msg = sc.next();
		System.out.println(msg);
		
		
		sc.close();//�ݵ�� �ݱ⸦ ������Ѵ�
		
		
		
		SubEx1 s1 = new SubEx1();
		s1.show1();
		
		SubEx2 s2 = new SubEx2();
		s2.test();
		
		SuperEx s3 = new SubEx2();//���� �θ� /�ڴ� �ڽĻ�����
		s3.me1();
		
		
	}

}
