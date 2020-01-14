package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		
		System.out.println("삭제할 회원 ID를 입력하세요");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		if (dto!= null) {
			dao.delete(id);
			System.out.println("삭제가 완료 되었습니다");
		}else {
			System.out.println("존재하지 않는 회원입니다. 다른 ID를 입력하세요");
		}

		

	}

}
