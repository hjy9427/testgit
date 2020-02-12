package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.MemberDAO;
import com.member.MemberDTO;
import com.naver.Command;
import com.naver.CommandAction;

public class MSearchPWCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");

		MemberDTO dto= new MemberDAO().searchPW(id, name, birth, email);

		request.setAttribute("dto", dto);
		
		return new CommandAction(false, "m_searchPW.jsp");
	}

}
