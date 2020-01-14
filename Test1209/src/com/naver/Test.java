package com.naver;

public class Test {
	
	public char me6(int score) {
		char c = 0;
		if(score >= 90) {
			c = 'a';
		} else if(score >= 80) {
			c = 'b';			
		} else if(score >= 70) {
			c= 'c';
		} else if(score >= 60) {
			c = 'd';
		} else {
			c = 'f';
		}
		return c;
		
	}
	
	public void me51(int kor, int eng) {
		if((kor + eng) / 2 >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	public void me5(int kor, int eng) {
		if(kor >= 60 && eng >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("낙방");
		}
		
	}
	
	public void me4(String gen1, String gen2) {
		if (gen1.equals("m")) {
			if(gen2.equals("mm")) {
				System.out.println("mm");
			} 	else {
			System.out.println("mtf");
			}
		} else {
			if (gen2.equals("ff")) {
				System.out.println("ff");
		} else {
			System.out.println("ftm");
		}
		}
		
	}
	
	public void me4(int a) {
		if (a % 4 == 0) {
			System.out.println("hello");
		} else if (a % 4 == 1) {
			System.out.println("world");
		} else if (a % 4 == 2) {
			System.out.println("good");
		} else {
			System.out.println("end");
			System.out.println("bye");
		}
	}
	
	public void me31(int score) {
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	
	public void me3(int a) {
		if(a % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}
	}
	
	
	public void me21(int a) { 
		if(a % 4 == 1) {
			System.out.println("a를 4로 나누면 나머지가 1입니다.");
		}
	}
	
	
	
	
	public void me2(int a) {
		
		
		if(a % 3 == 0) {
			System.out.println(a + "는 3의 배수입니다.");
		}
	}
	
	
	public void me1(int a) {
		
		if(a % 2 == 0) {
			System.out.println(a + "는 짝수");
		}
		
		if(a % 2 != 0) {
	
		System.out.println(a + "는 홀수");
		
		
		}
	}
}
