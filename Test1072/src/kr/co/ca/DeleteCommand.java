package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		
		System.out.println("������ ȸ�� ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		if (dto!= null) {
			dao.delete(id);
			System.out.println("������ �Ϸ� �Ǿ����ϴ�");
		}else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�. �ٸ� ID�� �Է��ϼ���");
		}

		

	}

}
