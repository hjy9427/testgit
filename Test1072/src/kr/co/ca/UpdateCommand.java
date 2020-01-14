package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ȸ�� ���� ����");
		
		System.out.println("������ ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		System.out.println("���ο� �̸��� �Է��ϼ���");
		String name = sc.nextLine();

		System.out.println("�а� Did�� �Է��ϼ���");
		String did = sc.nextLine();
		
		boolean isTrue = true;
		System.out.println("���ο� ���̸� �Է��ϼ���");
		int age = sc.nextInt();
		sc.nextLine();
		while (isTrue) {
			if (age<0 || age>200) {
				System.out.println("���ο� ���̸� �Է��ϼ���");
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
			System.out.println("�������� �ʴ� ID�Դϴ�");
		}
		
	}

}
