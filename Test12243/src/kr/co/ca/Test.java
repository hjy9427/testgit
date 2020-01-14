package kr.co.ca;

public class Test {
	
	public int me4(int num) {
		int result = 1;
		if(num >= 2) {
			result = num * me4(num -1);
		} else {
			result = 1;
		}
		return result;
	}
	public int me3(int num) {
		int result = 0;
		if(num >=1) {
			result = num + me3(num - 1);
		}else {
			result = 0;
		}
		
		return result;
		
	}
	
	public void me2(int num) {
		if (num >= 0) {
			System.out.println("hello");
			me2(num - 1); //¿Ã∑∏∞‘ «ÿ¡‹
		}
	}
	public void me1() {
		System.out.println("hello");
		me1();
	}
}
