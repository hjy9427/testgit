<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ȸ�� ���� ��ȸ");
		
		System.out.println("ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		
		System.out.println(dto);

	}

}
=======
package kr.co.ca;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ȸ�� ���� ��ȸ");
		
		System.out.println("ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		
		System.out.println(dto);

	}

}
>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
