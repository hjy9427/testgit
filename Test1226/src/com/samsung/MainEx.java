package com.samsung;

import java.util.Scanner;

import com.samsung.Command;
import com.samsung.DeleteCommand;
import com.samsung.GetListCommand;
import com.samsung.GetMemberDTOByIdCommand;
import com.samsung.InsertCommand;
import com.samsung.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Command[] com = {new InsertCommand(), new GetListCommand(), new GetMemberDTOByIdCommand(), new UpdateCommand(), new DeleteCommand()};
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("0:등록 1:전체조회 2:회원 조회 3:수정 4:삭제 5:종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu != com.length) {
				Command c = com[menu];
				if(c != null) {
					c.execute(sc);
				}
				
			} else {
				isTrue = false;
			}
		}
		
		
		sc.close();
	}
}

