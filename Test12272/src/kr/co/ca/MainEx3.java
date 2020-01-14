package kr.co.ca;

import java.util.ArrayList;
import java.util.Collections;

import com.naver.MemberAgeASC;
import com.naver.MemberAgeDesc;
import com.naver.MemberDTO;

public class MainEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m004", "kim", 11));
		list.add(new MemberDTO("m003", "kim", 22));
		list.add(new MemberDTO("m001", "kim", 31));
		list.add(new MemberDTO("m002", "kim", 26));
		
		System.out.println(list);
		Collections.sort(list, new MemberAgeASC());
		System.out.println(list);
		
		Collections.sort(list, new MemberAgeDesc());
		System.out.println(list);
		
		
		Collections.sort(list);  //memberDTO 내부에 comparable 인터페이스가 구현되어있어서 에러 안남
				
	}

}
