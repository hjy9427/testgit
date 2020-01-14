package com.naver;

public class Test4 {
	
	
	public void me2() {
		new Command() {

			@Override
			public void execute() {
				// TODO Auto-generated method stub
					System.out.println("ÁøÂ¥ÀÍ¸í³»ºÎÅ¬·¡½º");
			}
			
		}.execute();   //Á¡ ÂïÀ¸¸é °´Ã¼·Î º¸¸é µÊ
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
