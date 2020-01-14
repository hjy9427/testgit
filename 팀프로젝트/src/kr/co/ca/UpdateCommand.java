package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		
		System.out.println("ȸ�� ���� ����");
		
		System.out.println("������ ȸ���� ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		MemberDTO someone = dao.selectById(id);
		String name=null;
		if (someone!=null) {
			System.out.println("���̸��� �Է��ϼ���.\n�ִ� ���� 12�ڱ��� ����");
			
			while(true) {
				name = sc.nextLine();
				int namelen = name.length(); 
				if (namelen > 12 || namelen == 0) {
					System.out.println("������ �̸��� �ٽ� �Է��ϼ���.\n�ִ� ���� 12�ڱ��� ����");
				}else {
					break;
					}
				}
			
		System.out.println("�а� Did�� �Է��ϼ���");
		
	    String did = null;
		while(true) {
			System.out.println("d001:������ , d002:������, d003:����");
			did= sc.nextLine();
			boolean is = did.equals("d001");
			boolean is1 = did.equals("d002");
			boolean is2 = did.equals("d003");	
			if (is == true || is1 == true || is2 == true) {
				break;
		} else {
			System.out.println("�а��� �ٽ� �Է��ϼ���");
			}
		}
		
		int age = 0;
		while(true) {
			System.out.println("���̸� �Է��ϼ���.");
			age = sc.nextInt();
			sc.nextLine(); 
			if (age < 0 || age > 200) {
				System.out.println("�Ұ����� �����Դϴ�. �Է� ���� ���̴� 0 ���� ũ�ų� 200 �̸� �Դϴ�");
				System.out.println("�ٽ� ���̸� �Է��ϼ���.");
				age = sc.nextInt();
				sc.nextLine(); 
			}else {
				break;
			}
		}
		
			MemberDTO dto = new MemberDTO(id, name, did, age);
			MemberDTO someone1 = dao.selectById(id);
			if (someone1!=null) {
				dao.update(dto);
				System.out.println("�����Ǿ����ϴ�");
			}else {
				System.out.println("�������� �ʴ� ID�Դϴ�");
			}
		}
	}	
}
	

