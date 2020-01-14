<<<<<<< HEAD
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
					 System.out.println("종료 합니다");
					 continue;
				 }
				 System.out.println("메뉴에 있는 숫자를 다시 입력하세요");
			}
		}
		sc.close();
	}
}
=======
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
			System.out.println("硫붾돱瑜� �꽑�깮�븯�꽭�슂");
			System.out.println("0-�쉶�썝媛��엯, 1-�쟾泥댁“�쉶, 2-�쉶�썝議고쉶");
			System.out.println("3-�닔�젙, 4-�궘�젣, 5-醫낅즺");
			int menu = sc.nextInt();
			sc.nextLine();
			try {
				if (menu != com.length) {
					com[menu].execute(sc);
				} else {
					isTrue = false;
					System.out.println("醫낅즺");
				} 
			} catch (Exception e) {
				 count++; 
				 if(count>=10) {
					 isTrue = false;
					 System.out.println("醫낅즺 �빀�땲�떎");
					 continue;
				 }
				 System.out.println("硫붾돱�뿉 �엳�뒗 �닽�옄瑜� �떎�떆 �엯�젰�븯�꽭�슂");
			}
		}
		sc.close();
	}
}
>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
