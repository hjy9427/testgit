package com.samsung;

import java.util.Scanner;



public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("ID��  �Է��ϼ���.");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMemberDTOByID(id);
		System.out.println(dto);
	}

}