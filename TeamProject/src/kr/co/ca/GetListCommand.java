<<<<<<< HEAD
package kr.co.ca;

import java.util.ArrayList;
import java.util.Scanner;

public class GetListCommand implements Command {

	
	@Override
	public void execute(Scanner sc) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("DB에 있는 모든 회원 정보를 불러옵니다.");
				
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
=======
package kr.co.ca;

import java.util.ArrayList;
import java.util.Scanner;

public class GetListCommand implements Command {

	
	@Override
	public void execute(Scanner sc) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("DB에 있는 모든 회원 정보를 불러옵니다.");
				
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
>>>>>>> 4b332e62fed9a3d11168077d6a58ce24e8b07bfb
