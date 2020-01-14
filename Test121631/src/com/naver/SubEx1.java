package com.naver;

import java.util.Scanner;

public class SubEx1 extends SuperEx{
	
	@Override
	public void me1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan=sc.nextInt();
		
		dan(dan);
		
		sc.close();//반드시 수동으로 미리닫아줘야한다
	}
	
	public void show1() {
		me1();
	}
	

	@Override
	public void me2() {//구구단 잘찍어야-왜냐면 조심할것 다중 반복문x 메서드 이용해서 만들라
		
		for(int n=1;n<10;n++) {
			dan(n);
		}
		
	}
		
	public void dan(int n) {
		for(int i=2; i<10;i++) {
			System.out.println(n+"x"+i+"="+i*n);
			
		}
	}
		
		
	

}
