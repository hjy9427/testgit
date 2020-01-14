import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub

	
	System.out.println("ID를  입력하세요.");
	String id = sc.nextLine();
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto = dao.getMemberDTOById(id);
	System.out.println(dto);
	}
}
