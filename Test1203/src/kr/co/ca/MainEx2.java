package kr.co.ca;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hello world";
		int size = msg.length();
		System.out.println(size);
		
		String str = new String ("hello world");
		size = msg.length();
		System.out.println(size);
		
		System.out.println(";;;;;;;;;;;;");
		str = str.replace('h', 'H');
		System.out.println(str);
		
		System.out.println(";;;;;;;;;;;;");
		
		String msg2 = msg.substring(2);
		System.out.println(msg2);
		
		String msg3 = str.substring(1,8);
		System.out.println(msg3);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
