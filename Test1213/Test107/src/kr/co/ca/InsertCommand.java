package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("Name을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("Age를 입력하세요.");
		int age = sc.nextInt();
		//현재 Enter가 들어가있는 상태
		sc.nextLine(); //Enter삭제
		
		
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		
		dao.insert(dto);
		
	}

}
