package kr.co.ca;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		String id = null;
		
		try {
			System.out.println("ID�� �Է��ϼ���.");
			while(true) {
				id = sc.nextLine();
				int idlen = id.length(); 
				if (idlen>7 || idlen == 0) {
					System.out.println("�ʹ� �� ID�Դϴ�. �ִ� ���� 6�ڱ��� ����");
					System.out.println("ID�� �ٽ� �Է��ϼ���");
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
				System.out.println("�ߺ��� ID�Դϴ�. �ٸ� ID�� �Է� �ϼ���");
				id = sc.nextLine();
			}else {	break;	}
		}
		
		MemberDTO someone = dao.selectById(id);
		
		if (someone!= null) {
			System.out.println("�ߺ��� ID�Դϴ�. �ٸ� ID�� �Է� �ϼ���");
			
		}else {

			System.out.println("�̸��� �Է��ϼ���.");
			String name = sc.nextLine();
			
			System.out.println("���� �а� �ڵ� Did �� �ϳ��� �Է��ϼ���.");
			System.out.println("d001:������ , d002:������, d003:����");
			String did= sc.nextLine();
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
					dao.insert(dto);
					System.out.println("���� �Ǿ����ϴ�");
					break;
			} else {
				System.out.println("�а��� �ٽ� �Է��ϼ���");
				System.out.println("d001:������ , d002:������, d003:����");
				did= sc.nextLine();
				
				boolean is3 = did.equals("d001");
				boolean is4 = did.equals("d002");
				boolean is5 = did.equals("d003");
			
				if (is3 == true || is4 == true || is5 == true) {
					System.out.println("���̸� �Է��ϼ���.");
					int age = sc.nextInt();
					sc.nextLine(); 
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
					dao.insert(dto);
					System.out.println("���� �Ǿ����ϴ�");
					break;
				}
			}
	
			}
		}
	}
}
}
		
	
	

