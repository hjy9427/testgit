package com.naver;

public class Smartphone implements Phone, Camera, Cam, PC, Game{

	@Override
	public void call(String number) {
		// TODO Auto-generated method stub
		System.out.println(number+"�� ��ȭ�� �մϴ�");
	}

}
