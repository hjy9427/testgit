package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("ȸ�� ���� ����");
		
		System.out.println("������ ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		System.out.println("���ο� �̸��� �Է��ϼ���");
		String name = sc.nextLine();

		System.out.println("�а� Did�� �Է��ϼ���");
		System.out.println("d001:������ , d002:������, d003:����");
		String did = sc.nextLine();
		
		
		boolean isTrue = true;
		boolean is = did.equals("d001");
		boolean is1 = did.equals("d002");
		boolean is2 = did.equals("d003");
	
		while(isTrue) {
			if (is == true || is1 == true || is2 == true) {
				System.out.println("���̸� �Է��ϼ���.");
				int age = sc.nextInt();
			//���� Enter�� ���ִ� ����
				sc.nextLine(); //Enter����
				while(true) {
					if (age < 0 || age > 200) {
						System.out.println("�Ұ����� �����Դϴ�. �Է� ���� ���̴� 0 ���� ũ�ų� 200 �̸� �Դϴ�");
						System.out.println("�ٽ� ���̸� �Է��ϼ���.");
						age = sc.nextInt();
						sc.nextLine(); //���� Enter�� ���ִ� ���¶� enter���� 

					}else {
						break;
					}
				}
				MemberDTO dto = new MemberDTO(id, name, did, age);
				MemberDTO someone = dao.selectById(id);
				if (someone!=null) {
					dao.update(dto);
					System.out.println("�����Ǿ����ϴ�");
				}else {
					System.out.println("�������� �ʴ� ID�Դϴ�");
				}
				break;
		} else {
			System.out.println("�а��� �ٽ� �Է��ϼ���");
			System.out.println("d001:������ , d002:������, d003:����");
			String did1= sc.nextLine();
			
			boolean is3 = did1.equals("d001");
			boolean is4 = did1.equals("d002");
			boolean is5 = did1.equals("d003");
		
			if (is3 == true || is4 == true || is5 == true) {
				System.out.println("���̸� �Է��ϼ���.");
				int age2 = sc.nextInt();
				sc.nextLine(); 
				while(true) {
					if (age2 < 0 || age2 > 200) {
						System.out.println("�Ұ����� �����Դϴ�. �Է� ���� ���̴� 0 ���� ũ�ų� 200 �̸� �Դϴ�");
						System.out.println("�ٽ� ���̸� �Է��ϼ���.");
						age2 = sc.nextInt();
						sc.nextLine(); //���� Enter�� ���ִ� ���¶� enter���� 

					}else {
						break;
					}
				}
				MemberDTO dto1 = new MemberDTO(id, name, did1, age2);
				MemberDTO someone = dao.selectById(id);
				if (someone!=null) {
					dao.update(dto1);
					System.out.println("�����Ǿ����ϴ�");
				}else {
					System.out.println("�������� �ʴ� ID�Դϴ�");
				}
				
				break;
			}
		}

		}
	

		
		
		
		
	}
	public void me1() {
		
	}
}
