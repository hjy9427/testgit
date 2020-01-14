<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ȸ�� ���� ����");
		
		System.out.println("ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		
	
		dao.delete(id);

	}

}
=======
package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원 정보 삭제");
	    System.out.println("ID를 입력하세요");
	    
	    while(true) {
	    String id = sc.nextLine();
	    MemberDAO dao = new MemberDAO();
	    MemberDTO member = dao.selectById(id);
	        if(member == null) {
	        	System.out.println("없는 아이디입니다 다른 아이디를 입력하세요");
	        } else {
	        	dao.delete(id);
	        	System.out.println("삭제되었습니다");
	        	break;
	        }

	    }

	}

}

>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
