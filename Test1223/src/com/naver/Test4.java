package com.naver;

public class Test4 {
	
	
	public void me2() {
		new Command() {

			@Override
			public void execute() {
				// TODO Auto-generated method stub
					System.out.println("��¥�͸���Ŭ����");
			}
			
		}.execute();   //�� ������ ��ü�� ���� ��
	}
	public Command com = new Command() {
		
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			System.out.println("overriding");
		}
	};
	
	public void me1() {
		com.execute();
	}
}
