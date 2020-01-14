package com.naver;

public class Test4 {
	
	
	public void test(int score) {
		char dab = score >= 90? '수' : 
			score >=  80? '우' : 
				score >= 70 ? '미' :
					score >= 60? '양' : 
						'가';
	}

	
	
	

	public void me4(int a, int b) {
		int c = a == b ? 4 : ki(a, b); 
	}
	
	private int ki(int a, int b) {
		// TODO Auto-generated method stub
		return a > b ? 5 : -1;
	}

	public void me3() {
		//변수명 = 조건식? 참값 : 거짓값;
		int a = 10;
		int b = 20;
		int c = a > b ? 400 : -1;
		System.out.println(c);
	}
	
	
	public void me2(int num, int n) { 
		System.out.println(num << n);
	}
	
	
	public void me1(int num, int n) {
		System.out.println(num >> n );
	}
	
	
}
