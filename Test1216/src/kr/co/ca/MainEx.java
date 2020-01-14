package kr.co.ca;

import com.naver.MemberDTO;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDTO dto1 = new MemberDTO("m001", "kim", 15);
		MemberDTO dto2 = new MemberDTO("m002", "lee", 22);	
	
		boolean a = dto1.equals(dto2);
	}

}
