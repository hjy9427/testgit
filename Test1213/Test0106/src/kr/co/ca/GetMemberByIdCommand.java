package kr.co.ca;

import java.util.Scanner;

public class GetMemberByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("ID��  �Է��ϼ���.");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMemberDTOById(id);
		System.out.println(dto);
		
	}

}
