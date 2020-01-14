package kr.co.ca;

import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.GetListCommand;
import com.naver.GetMemberDTOByIdCommand;
import com.naver.InsertCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Command[] com = {new InsertCommand(),new GetListCommand(), new GetMemberDTOByIdCommand(), new UpdateCommand(), new DeleteCommand()};
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("0:��� 1:��� 2:����");
			
			int menu = sc.nextInt();
			if(menu != com.length) {
				com[menu].execute(sc);
			} else {
				isTrue = false;
			}
			
		}
		
		
		sc.close();
		
		
	}

}
