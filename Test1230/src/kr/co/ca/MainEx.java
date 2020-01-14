package kr.co.ca;

public class MainEx {

	public static void main(String[] args) {
		System.out.println("main start");    
		
		MyThread1 mt1 = new MyThread1("이순신");   
		
		MyThread1 mt2 = new MyThread1("김유신"); 
		
		
		mt1.setPriority(Thread.MAX_PRIORITY);       
		mt2.setPriority(Thread.MIN_PRIORITY); 
		
		mt1.start();
		mt2.start();

	}

}
