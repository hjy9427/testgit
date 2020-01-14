package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id를 입력하세요.");
		String id = sc.nextLine();
	
		System.out.println("name을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("age를 입력하세요.");
		int age = sc.nextInt();
		
		sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		
		MemberDAO dao = new MemberDAO();
		
		dao.insert(dto);
		
		
	}

}
