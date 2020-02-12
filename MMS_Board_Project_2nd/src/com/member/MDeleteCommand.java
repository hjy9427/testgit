package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naver.Command;
import com.naver.CommandAction;

public class MDeleteCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		HttpSession sess = request.getSession(false);
		if(sess!=null) {
			sess.removeAttribute("login");
		}
		new MemberDAO().delete(id, pw);
		
		return new CommandAction(true, "index.jsp");
	}

}
