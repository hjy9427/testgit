package com.samsung;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id를 입력하시오");
		String id = sc.nextLine();
		System.out.println("이름을 입력하시오");
		String name = sc.nextLine();
		System.out.println("나이를 입력하시오");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
	}

}
