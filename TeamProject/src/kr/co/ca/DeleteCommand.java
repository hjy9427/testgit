<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("ȸ�� ���� ����");
	    System.out.println("ID�� �Է��ϼ���");
	    
	    while(true) {
	    String id = sc.nextLine();
	    MemberDAO dao = new MemberDAO();
	    MemberDTO member = dao.selectById(id);
	        if(member == null) {
	        	System.out.println("���� ���̵��Դϴ� �ٸ� ���̵� �Է��ϼ���");
	        } else {
	        	dao.delete(id);
	        	System.out.println("�����Ǿ����ϴ�");
	        	break;
	        }

	    }

	}

}
=======
package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("ȸ�� ���� ����");
	    System.out.println("ID�� �Է��ϼ���");
	    
	    while(true) {
	    String id = sc.nextLine();
	    MemberDAO dao = new MemberDAO();
	    MemberDTO member = dao.selectById(id);
	        if(member == null) {
	        	System.out.println("���� ���̵��Դϴ� �ٸ� ���̵� �Է��ϼ���");
	        } else {
	        	dao.delete(id);
	        	System.out.println("�����Ǿ����ϴ�");
	        	break;
	        }

	    }

	}

}
>>>>>>> 4b332e62fed9a3d11168077d6a58ce24e8b07bfb
