package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		String id = null;
		
		try {
			System.out.println("ID를 입력하세요.");
			while(true) {
				id = sc.nextLine();
				int idlen = id.length(); 
				if (idlen>7 || idlen == 0) {
					System.out.println("너무 긴 ID입니다. 최대 영문 6자까지 가능");
					System.out.println("ID를 다시 입력하세요");
				}else {
					break;
				}
			}
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {

		MemberDAO dao = new MemberDAO();

		while(true) {
			MemberDTO someone = dao.selectById(id);
			if (someone!= null) {
				System.out.println("중복된 ID입니다. 다른 ID를 입력 하세요");
				id = sc.nextLine();
			}else {	break;	}
		}
		
		MemberDTO someone = dao.selectById(id);
		
		if (someone!= null) {
			System.out.println("중복된 ID입니다. 다른 ID를 입력 하세요");
			
		}else {

			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			
			System.out.println("다음 학과 코드 Did 중 하나를 입력하세요.");
			System.out.println("d001:영문과 , d002:기계공학, d003:법학");
			String did= sc.nextLine();
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
					dao.insert(dto);
					System.out.println("가입 되었습니다");
					break;
			} else {
				System.out.println("학과를 다시 입력하세요");
				System.out.println("d001:영문과 , d002:기계공학, d003:법학");
				did= sc.nextLine();
				
				boolean is3 = did.equals("d001");
				boolean is4 = did.equals("d002");
				boolean is5 = did.equals("d003");
			
				if (is3 == true || is4 == true || is5 == true) {
					System.out.println("나이를 입력하세요.");
					int age = sc.nextInt();
					sc.nextLine(); 
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
					dao.insert(dto);
					System.out.println("가입 되었습니다");
					break;
				}
			}
	
			}
		}
	}
}
}
		
	
	

