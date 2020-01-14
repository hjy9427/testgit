package kr.co.ca;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("��ȸ�� ID�� �Է��ϼ���");
		String id = sc.nextLine();
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		if (dto!= null) {
			System.out.println(dto);
		}else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�");
		}
	}
}
