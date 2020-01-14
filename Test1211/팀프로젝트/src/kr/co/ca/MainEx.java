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
			System.out.println("¸Ş´º¸¦ ¼±ÅÃÇÏ¼¼¿ä");
			System.out.println("0-È¸¿ø°¡ÀÔ, 1-ÀüÃ¼Á¶È¸, 2-È¸¿øÁ¶È¸");
			System.out.println("3-¼öÁ¤, 4-»èÁ¦, 5-Á¾·á");
			int menu = sc.nextInt();
			sc.nextLine();
			try {
				if (menu != com.length) {
					com[menu].execute(sc);
				} else {
					isTrue = false;
					System.out.println("Á¾·á");
				} 
			} catch (Exception e) {
				 count++; 
				 if(count>=10) {
					 isTrue = false;
					 System.out.println("Á¾·á ÇÕ´Ï´Ù");
					 continue;
				 }
				 System.out.println("¸Ş´º¿¡ ÀÖ´Â ¼ıÀÚ¸¦ ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
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
			System.out.println("ë©”ë‰´ë¥¼ ì„ íƒí•˜ì„¸ìš”");
			System.out.println("0-íšŒì›ê°€ì…, 1-ì „ì²´ì¡°íšŒ, 2-íšŒì›ì¡°íšŒ");
			System.out.println("3-ìˆ˜ì •, 4-ì‚­ì œ, 5-ì¢…ë£Œ");
			int menu = sc.nextInt();
			sc.nextLine();
			try {
				if (menu != com.length) {
					com[menu].execute(sc);
				} else {
					isTrue = false;
					System.out.println("ì¢…ë£Œ");
				} 
			} catch (Exception e) {
				 count++; 
				 if(count>=10) {
					 isTrue = false;
					 System.out.println("ì¢…ë£Œ í•©ë‹ˆë‹¤");
					 continue;
				 }
				 System.out.println("ë©”ë‰´ì— ìˆëŠ” ìˆ«ìë¥¼ ë‹¤ì‹œ ì…ë ¥í•˜ì„¸ìš”");
			}
		}
		sc.close();
	}
}
>>>>>>> 24eddf8246548c07a38003ef3967a2b930878048
