package kr.co.ca;

import java.util.Scanner;

//import com.naver.Command;
//import com.naver.DeleteCommand;
//import com.naver.GetListCommand;
//import com.naver.GetMemberDTOByIdCommand;
//import com.naver.InsertCommand;
//import com.naver.UpdateCommand;

public class MainEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Command[] com = {
						new InsertCommand(),
						new GetListCommand(),
						new GetMemberDTOByIdCommand(),
						new UpdateCommand(),
						new DeleteCommand()
						};
		boolean isTrue=true;
		int count = 0;
		while(isTrue) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("0-ȸ������, 1-��ü��ȸ, 2-ȸ����ȸ");
			System.out.println("3-����, 4-����, 5-����");
			int menu = sc.nextInt();
			sc.nextLine();
			try {
				if (menu != com.length) {
					com[menu].execute(sc);
				} else {
					isTrue = false;
					System.out.println("����");
				} 
			} catch (Exception e) {
				 count++; 
				 if(count>=10) {
					 isTrue = false;
					 System.out.println("���񽺸� ���� �մϴ�. �ٽ� �����ϼ���");
					 continue;
				 }
				 System.out.println("�޴��� �ִ� ���ڸ� �ٽ� �Է��ϼ���");
			}
		}
		sc.close();
	}
}
