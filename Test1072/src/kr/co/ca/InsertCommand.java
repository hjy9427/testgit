package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO someone = dao.selectById(id);
		
		if (someone!= null) {
			System.out.println("�ߺ��� ID�Դϴ�. �ٸ� ID�� �Է� �ϼ���");
			
		}else {

			System.out.println("�̸��� �Է��ϼ���.");
			String name = sc.nextLine();
			
			System.out.println("���� �а� �ڵ� Did �� �ϳ��� �Է��ϼ���.");
			System.out.println("d001:������ , d002:������, d003:����");
			String did= sc.nextLine();

			System.out.println("���̸� �Է��ϼ���.");
			int age = sc.nextInt();
			//���� Enter�� ���ִ� ����
			sc.nextLine(); //Enter����

			
			MemberDTO dto = new MemberDTO(id, name, did, age);
			dao.insert(dto);
			System.out.println("���� �Ǿ����ϴ�");
		}
		
	}

}
