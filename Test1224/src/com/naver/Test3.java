package com.naver;

public class Test3 {
	public int me4(int num) {
		try {
			System.out.println(4/num);
			return 4/num;
		} catch (Exception e) {
			return -1;
			// TODO: handle exception
		} finally {
			System.out.println("고생하셨습니다.");
		}
	}
	public void me3(int num) throws Exception {
		try {
			System.out.println(4/num);
		} finally {
			// TODO: handle exception
			System.out.println("그 동안 이용해주셔서 감사합니다.");
		}
	}
	public void me2(int num) throws Exception {
		System.out.println(5/num);
		System.out.println("이용해주셔서 감사합니다.");
		
	}
	public void me1(int num) {
		try {
			System.out.println(5/num);
		} catch (Exception e) {
			System.out.println("뭔가 잘못됐다.");
		} finally {
			System.out.println("이용해주셔서 감사합니다.");//성공하던실패하던 반드시 실행
		}
		
	}
}
