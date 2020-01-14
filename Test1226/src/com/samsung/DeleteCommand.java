package com.samsung;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
	}

}
