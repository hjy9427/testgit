package com.board;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.naver.Command;
import com.naver.CommandAction;

public class BGoodCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession sess = request.getSession(false);
		Object login=sess.getAttribute("login");
		if(login!=null) {
		
		
		String sNum=request.getParameter("num");
		int num=-1;
		if(sNum!=null) {
			num=Integer.parseInt(sNum);
		}
		BoardDAO dao = new BoardDAO();
		BoardDTO dto =dao.countGood(num);
		request.setAttribute("dto", dto);
		request.setAttribute("num", num);
		return new CommandAction(false, "b_good.jsp");
	}else {
		return new CommandAction(false, "m_login.jsp");
	}
	}
}
