package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naver.Command;
import com.naver.CommandAction;

public class MReadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession sess = request.getSession(false);
		Object login=sess.getAttribute("login");
		
		String id=request.getParameter("id");
		MemberDTO dto = new MemberDAO().read(id);
		request.setAttribute("dto", dto);
		request.setAttribute("login", login);
		return new CommandAction(false, "m_read.jsp");
	}

}
