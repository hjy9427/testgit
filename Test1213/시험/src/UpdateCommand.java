import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id�� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.update(new MemberDTO(id, name, age));
	}

}
