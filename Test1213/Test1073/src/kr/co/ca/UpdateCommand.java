package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("회원 정보 수정");
		
		System.out.println("수정할 ID를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("새로운 이름을 입력하세요");
		String name = sc.nextLine();

		System.out.println("학과 Did를 입력하세요");
		String did = sc.nextLine();
		
		boolean isTrue = true;
		System.out.println("새로운 나이를 입력하세요");
		int age = sc.nextInt();
		sc.nextLine();
		while (isTrue) {
			if (age<0 || age>200) {
				System.out.println("새로운 나이를 입력하세요");
				age = sc.nextInt();
				sc.nextLine();
			}else {
				isTrue = false;
			}
		}
		MemberDTO dto = new MemberDTO(id, name, did, age);

		
		MemberDAO dao = new MemberDAO();
		MemberDTO someone = dao.selectById(id);
		if (someone!=null) {
			dao.update(dto);
		}else {
			System.out.println("존재하지 않는 ID입니다");
		}
		
	}

}
