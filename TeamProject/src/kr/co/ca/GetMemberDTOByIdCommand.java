<<<<<<< HEAD
package kr.co.ca;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("회원 정보 조회");
		
		System.out.println("ID를 입력하세요");
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
		
		System.out.println("회원 정보 조회");
		
		System.out.println("ID를 입력하세요");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectById(id);
		
		System.out.println(dto);

	}

}
>>>>>>> 4b332e62fed9a3d11168077d6a58ce24e8b07bfb
