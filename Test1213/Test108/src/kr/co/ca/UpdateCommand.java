<<<<<<< HEAD
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
=======
package kr.co.ca;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		
		System.out.println("회원 정보 수정");
		
		System.out.println("수정할 회원의 ID를 입력하세요");
		String id = sc.nextLine();
		
		MemberDTO someone = dao.selectById(id);
		String name=null;
		if (someone!=null) {
			System.out.println("새이름을 입력하세요.\n최대 영문 12자까지 가능");
			
			while(true) {
				name = sc.nextLine();
				int namelen = name.length(); 
				if (namelen > 12 || namelen == 0) {
					System.out.println("가능한 이름를 다시 입력하세요.\n최대 영문 12자까지 가능");
				}else {
					break;
					}
				}
			
		System.out.println("학과 Did를 입력하세요");
		
	    String did = null;
		while(true) {
			System.out.println("d001:영문과 , d002:기계공학, d003:법학");
			did= sc.nextLine();
			boolean is = did.equals("d001");
			boolean is1 = did.equals("d002");
			boolean is2 = did.equals("d003");	
			if (is == true || is1 == true || is2 == true) {
				break;
		} else {
			System.out.println("학과를 다시 입력하세요");
			}
		}
		
		int age = 0;
		while(true) {
			System.out.println("나이를 입력하세요.");
			age = sc.nextInt();
			sc.nextLine(); 
			if (age < 0 || age > 200) {
				System.out.println("불가능한 나이입니다. 입력 가능 나이는 0 보다 크거나 200 미만 입니다");
				System.out.println("다시 나이를 입력하세요.");
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
				System.out.println("수정되었습니다");
			}else {
				System.out.println("존재하지 않는 ID입니다");
			}
		}
	}	
}
	

>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
