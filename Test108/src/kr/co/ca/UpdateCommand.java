package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("회원 정보 수정");
		
		System.out.println("수정할 ID를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("새로운 이름을 입력하세요");
		String name = sc.nextLine();

		System.out.println("학과 Did를 입력하세요");
		System.out.println("d001:영문과 , d002:기계공학, d003:법학");
		String did = sc.nextLine();
		
		
		boolean isTrue = true;
		boolean is = did.equals("d001");
		boolean is1 = did.equals("d002");
		boolean is2 = did.equals("d003");
	
		while(isTrue) {
			if (is == true || is1 == true || is2 == true) {
				System.out.println("나이를 입력하세요.");
				int age = sc.nextInt();
			//현재 Enter가 들어가있는 상태
				sc.nextLine(); //Enter삭제
				while(true) {
					if (age < 0 || age > 200) {
						System.out.println("불가능한 나이입니다. 입력 가능 나이는 0 보다 크거나 200 미만 입니다");
						System.out.println("다시 나이를 입력하세요.");
						age = sc.nextInt();
						sc.nextLine(); //현재 Enter가 들어가있는 상태라 enter삭제 

					}else {
						break;
					}
				}
				MemberDTO dto = new MemberDTO(id, name, did, age);
				MemberDTO someone = dao.selectById(id);
				if (someone!=null) {
					dao.update(dto);
					System.out.println("수정되었습니다");
				}else {
					System.out.println("존재하지 않는 ID입니다");
				}
				break;
		} else {
			System.out.println("학과를 다시 입력하세요");
			System.out.println("d001:영문과 , d002:기계공학, d003:법학");
			String did1= sc.nextLine();
			
			boolean is3 = did1.equals("d001");
			boolean is4 = did1.equals("d002");
			boolean is5 = did1.equals("d003");
		
			if (is3 == true || is4 == true || is5 == true) {
				System.out.println("나이를 입력하세요.");
				int age2 = sc.nextInt();
				sc.nextLine(); 
				while(true) {
					if (age2 < 0 || age2 > 200) {
						System.out.println("불가능한 나이입니다. 입력 가능 나이는 0 보다 크거나 200 미만 입니다");
						System.out.println("다시 나이를 입력하세요.");
						age2 = sc.nextInt();
						sc.nextLine(); //현재 Enter가 들어가있는 상태라 enter삭제 

					}else {
						break;
					}
				}
				MemberDTO dto1 = new MemberDTO(id, name, did1, age2);
				MemberDTO someone = dao.selectById(id);
				if (someone!=null) {
					dao.update(dto1);
					System.out.println("수정되었습니다");
				}else {
					System.out.println("존재하지 않는 ID입니다");
				}
				
				break;
			}
		}

		}
	

		
		
		
		
	}
	public void me1() {
		
	}
}
