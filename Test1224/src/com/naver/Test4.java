package com.naver;

import java.util.Scanner;

public class Test4 {
	
	public void me2() throws Exception {
		String msg = "�ٺ�";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �Է��ϼ���.");
		String str = sc.nextLine();
		
		boolean isTrue = str.contains(msg);
		
		if(isTrue) {
			sc.close();
			throw new Exception("�弳����");
		} else {
			System.out.println(str);
			sc.close();
		}
		
	}
	public void me1() {
		String msg = "�ٺ�";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �Է��ϼ���.");
		String str = sc.nextLine();
		boolean isTrue = str.contains(msg);
		if(isTrue) {
			System.out.println("������ ������.");
			sc.close();
		} else {
			System.out.println(str);
			sc.close();
		}
		
		
	}
}
