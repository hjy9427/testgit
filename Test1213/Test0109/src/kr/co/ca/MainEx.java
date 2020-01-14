package kr.co.ca;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDAO dao = new BankDAO();
		dao.transfer("b002", "b001", 1000);
		
	}

}
