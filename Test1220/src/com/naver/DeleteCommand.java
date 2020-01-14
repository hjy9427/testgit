package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("ID ют╥б");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
		
	}

}
