package com.naver;

import java.util.Scanner;

public class SubEx1 extends SuperEx{
	
	@Override
	public void me1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int dan=sc.nextInt();
		
		dan(dan);
		
		sc.close();//�ݵ�� �������� �̸��ݾ�����Ѵ�
	}
	
	public void show1() {
		me1();
	}
	

	@Override
	public void me2() {//������ ������-�ֳĸ� �����Ұ� ���� �ݺ���x �޼��� �̿��ؼ� �����
		
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
