package kr.co.ca;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.print(3);
					System.out.print("*");
					System.out.print(i);
					System.out.println("=");
					System.out.println(3 * i);
					
				}
			}
		}).run();
		
		
		
	}

}
