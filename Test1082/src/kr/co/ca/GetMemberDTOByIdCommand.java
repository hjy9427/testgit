package kr.co.ca;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("조회할 ID를 입력하세요");
		String id = sc.nextLine();
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		if (dto!= null) {
			System.out.println(dto);
		}else {
			System.out.println("존재하지 않는 회원입니다");
		}
	}
}
