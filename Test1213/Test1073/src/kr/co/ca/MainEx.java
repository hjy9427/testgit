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
			System.out.println("메뉴를 선택하세요");
			System.out.println("0-회원가입, 1-전체조회, 2-회원조회");
			System.out.println("3-수정, 4-삭제, 5-종료");
			int menu = sc.nextInt();
			sc.nextLine();
			try {
				if (menu != com.length) {
					com[menu].execute(sc);
				} else {
					isTrue = false;
					System.out.println("종료");
				} 
			} catch (Exception e) {
				 count++; 
				 if(count>=10) {
					 isTrue = false;
					 System.out.println("서비스를 종료 합니다. 다시 시작하세요");
					 continue;
				 }
				 System.out.println("메뉴에 있는 숫자를 다시 입력하세요");
			}
		}
		sc.close();
	}
}
