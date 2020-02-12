package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.Command;
import com.naver.CommandAction;


public class MLoginCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		
		MemberDTO login = new MemberDAO().login(new MemberDTO(id, pw, null, null, null));
		
		request.getSession().setAttribute("login", login);
		
	      if(login != null) {
		         response.getWriter().print("0");
		         System.out.println("로그인성공");
		         return new CommandAction(true, "index.jsp");
		      }else {
		         response.getWriter().print("1");
		        //return new CommandAction(true, "mloginui.do");
		         System.out.println("로그인실패");
		         return null;
		      }
		
		
		
		//return null;

	}
	
}

