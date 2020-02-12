package com.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naver.Command;
import com.naver.CommandAction;

public class BReadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession sess = request.getSession(false);
		Object login=sess.getAttribute("login");
		if(login!=null) {
		
		String sNum = request.getParameter("num");
		
		int num = -1;
		
		if(sNum!=null) {
			num = Integer.parseInt(sNum);
		}
		
		BoardDTO dto = new BoardDAO().read(num);
		
		request.setAttribute("dto", dto);
				
		return new CommandAction(false, "b_read.jsp");
	}else {
		return new CommandAction(false, "m_login.jsp");
	}
	}
}
