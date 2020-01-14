package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO someone = dao.selectById(id);
		
		if (someone!= null) {
			System.out.println("중복된 ID입니다. 다른 ID를 입력 하세요");
			
		}else {

			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			
			System.out.println("다음 학과 코드 Did 중 하나를 입력하세요.");
			System.out.println("d001:영문과 , d002:기계공학, d003:법학");
			String did= sc.nextLine();

			System.out.println("나이를 입력하세요.");
			int age = sc.nextInt();
			//현재 Enter가 들어가있는 상태
			sc.nextLine(); //Enter삭제

			
			MemberDTO dto = new MemberDTO(id, name, did, age);
			dao.insert(dto);
			System.out.println("가입 되었습니다");
		}
		
	}

}
