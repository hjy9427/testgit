package kr.co.ca;

import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDTO dto1 = new MemberDTO();
		String id = dto1.getid();
	    System.out.println(id);
	
	    
	    dto1.setName("ȫ�浿");
	    String name= dto1.getName();
	    System.out.println(name);
	    
	}
	
	
}
