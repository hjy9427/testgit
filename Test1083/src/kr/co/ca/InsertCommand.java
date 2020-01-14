package kr.co.ca;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
		} finally {

			MemberDAO dao = new MemberDAO();

			while(true) {
				MemberDTO someone = dao.selectById(id);
				if (someone!= null) {
					System.out.println("�ߺ��� ID�Դϴ�. �ٸ� ID�� �Է� �ϼ���");
					id = sc.nextLine();
				}else {	break;}
			}

			System.out.println("�̸��� �Է��ϼ���.");
			String name = sc.nextLine();

			System.out.println("���� �а� �ڵ� Did �� �ϳ��� �Է��ϼ���.");
			System.out.println("d001:������, d002:������, d003:����, d004:����");
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("d001", "������");
			map.put("d002", "������");
			map.put("d003", "����");
			map.put("d004", "����");
			Set<String> key = map.keySet();
			String departCode = null;

			while(true) {
				String tmpCode = sc.nextLine();
				if (!key.contains(tmpCode)) {
					System.out.println("���� �а��Դϴ�. �ٽ� �Է��ϼ���");
				}else {
					departCode = tmpCode;
					break;
				}
			}
			System.out.println("���̸� �Է��ϼ���.");
			int age = sc.nextInt();
			sc.nextLine();
			while(true) {
				if (age < 0 || age > 200) {
					System.out.println("�Ұ����� �����Դϴ�. �Է� ���� ���̴� 0 ���� ũ�ų� 200 �̸� �Դϴ�");
					System.out.println("�ٽ� ���̸� �Է��ϼ���.");
					age = sc.nextInt();
					sc.nextLine();

				}else {	break;}
			}
			MemberDTO dto = new MemberDTO(id, name, departCode, age);
			dao.insert(dto);
			System.out.println("ȸ�� ���� �Ǿ����ϴ�");

		}

	}

}
