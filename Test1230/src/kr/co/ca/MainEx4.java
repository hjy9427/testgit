package kr.co.ca;

public class MainEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
		
		MyThread2 mt1 = new MyThread2("이순신");
		MyThread2 mt2 = new MyThread2("김유신");
		MyThread2 mt3 = new MyThread2("계백");
		
		
		mt1.start();
		mt2.start();
		mt3.start();
		
	}

}
