package com.naver;

import java.util.Scanner;

public class Test4 {
	
	public void me2() throws Exception {
		String msg = "바보";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("댓글을 입력하세요.");
		String str = sc.nextLine();
		
		boolean isTrue = str.contains(msg);
		
		if(isTrue) {
			sc.close();
			throw new Exception("욕설금지");
		} else {
			System.out.println(str);
			sc.close();
		}
		
	}
	public void me1() {
		String msg = "바보";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("댓글을 입력하세요.");
		String str = sc.nextLine();
		boolean isTrue = str.contains(msg);
		if(isTrue) {
			System.out.println("욕하지 마세요.");
			sc.close();
		} else {
			System.out.println(str);
			sc.close();
		}
		
		
	}
}
