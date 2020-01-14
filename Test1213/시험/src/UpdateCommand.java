import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.update(new MemberDTO(id, name, age));
	}

}
