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
			System.out.println("����ϼ̽��ϴ�.");
		}
	}
	public void me3(int num) throws Exception {
		try {
			System.out.println(4/num);
		} finally {
			// TODO: handle exception
			System.out.println("�� ���� �̿����ּż� �����մϴ�.");
		}
	}
	public void me2(int num) throws Exception {
		System.out.println(5/num);
		System.out.println("�̿����ּż� �����մϴ�.");
		
	}
	public void me1(int num) {
		try {
			System.out.println(5/num);
		} catch (Exception e) {
			System.out.println("���� �߸��ƴ�.");
		} finally {
			System.out.println("�̿����ּż� �����մϴ�.");//�����ϴ������ϴ� �ݵ�� ����
		}
		
	}
}
