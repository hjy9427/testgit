package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("Name을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("Age를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.update(new MemberDTO(id, name, age));
		
	}

}
