package kr.co.ca;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
		} finally {

			MemberDAO dao = new MemberDAO();

			while(true) {
				MemberDTO someone = dao.selectById(id);
				if (someone!= null) {
					System.out.println("중복된 ID입니다. 다른 ID를 입력 하세요");
					id = sc.nextLine();
				}else {	break;}
			}

			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();

			System.out.println("다음 학과 코드 Did 중 하나를 입력하세요.");
			System.out.println("d001:영문과, d002:기계공학, d003:법학, d004:물리");
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("d001", "영문과");
			map.put("d002", "기계공학");
			map.put("d003", "법학");
			map.put("d004", "물리");
			Set<String> key = map.keySet();
			String departCode = null;

			while(true) {
				String tmpCode = sc.nextLine();
				if (!key.contains(tmpCode)) {
					System.out.println("없는 학과입니다. 다시 입력하세요");
				}else {
					departCode = tmpCode;
					break;
				}
			}
			System.out.println("나이를 입력하세요.");
			int age = sc.nextInt();
			sc.nextLine();
			while(true) {
				if (age < 0 || age > 200) {
					System.out.println("불가능한 나이입니다. 입력 가능 나이는 0 보다 크거나 200 미만 입니다");
					System.out.println("다시 나이를 입력하세요.");
					age = sc.nextInt();
					sc.nextLine();

				}else {	break;}
			}
			MemberDTO dto = new MemberDTO(id, name, departCode, age);
			dao.insert(dto);
			System.out.println("회원 가입 되었습니다");

		}

	}

}
