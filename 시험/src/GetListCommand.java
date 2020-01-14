import java.util.ArrayList;
import java.util.Scanner;

public class GetListCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.getList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			MemberDTO dto = list.get(i);
			System.out.println(dto);
		}
				
	}

}
