package com.samsung;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id�� �Է��Ͻÿ�");
		String id = sc.nextLine();
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��Ͻÿ�");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		dao.insert(dto);
	}

}
