<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("회원 정보 삭제");
		
		System.out.println("ID를 입력하세요");
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
		System.out.println("�쉶�썝 �젙蹂� �궘�젣");
	    System.out.println("ID瑜� �엯�젰�븯�꽭�슂");
	    
	    while(true) {
	    String id = sc.nextLine();
	    MemberDAO dao = new MemberDAO();
	    MemberDTO member = dao.selectById(id);
	        if(member == null) {
	        	System.out.println("�뾾�뒗 �븘�씠�뵒�엯�땲�떎 �떎瑜� �븘�씠�뵒瑜� �엯�젰�븯�꽭�슂");
	        } else {
	        	dao.delete(id);
	        	System.out.println("�궘�젣�릺�뿀�뒿�땲�떎");
	        	break;
	        }

	    }

	}

}

>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
