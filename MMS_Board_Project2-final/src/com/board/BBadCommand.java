package com.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.naver.Command;
import com.naver.CommandAction;

public class BBadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String sNum = request.getParameter("num");

		int num = -1;
		if(sNum != null) {
			num = Integer.parseInt(sNum);
		}
		
		BoardDAO dao = new BoardDAO();
		int bad = dao.countBad(num);
		
		response.getWriter().print(bad);
		
		return null;
	}
	
}
