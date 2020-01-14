package kr.co.ca;

import java.util.ArrayList;
import java.util.Scanner;

public class GetListCommand implements Command {

	
	@Override
	public void execute(Scanner sc) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("DB�� �ִ� ��� ȸ�� ������ �ҷ��ɴϴ�.");
				
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.select();
				
				for(int i = 0; i < list.size(); i ++) {
					MemberDTO dto = list.get(i);
					System.out.println(dto);
				}
			}
		}).start();

	}

}
