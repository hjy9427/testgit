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
>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
