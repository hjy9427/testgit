package com.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.Command;
import com.naver.CommandAction;

public class MUpdateCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String curPW = request.getParameter("curPW");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		MemberDTO dto = new MemberDAO().read(id, curPW);
//		System.out.println("update command dto ="+dto);
		dto.setPw(pw);dto.setName(name); dto.setBirth(birth);dto.setEmail(email);
		new MemberDAO().update(dto);
		MemberDTO login = new MemberDAO().login(dto);
		request.getSession().setAttribute("login", login);
		return new CommandAction(true, "index.jsp");
	}

}
