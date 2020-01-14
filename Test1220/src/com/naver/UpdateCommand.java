package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("Name을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("Age를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();             //넥스트인트에는 엔터가 안됨 그래서 엔터추가
		
		MemberDAO dao = new MemberDAO();
		dao.update(new MemberDTO(id, name, age));
		
	}

}
