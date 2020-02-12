package com.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.Command;
import com.naver.CommandAction;

public class BReadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String sNum = request.getParameter("num");
		
		int num = -1;
		
		if(sNum!=null) {
			num = Integer.parseInt(sNum);
		}
			
		BoardDTO dto = new BoardDAO().read(num);
		
		
		String sCurPage = request.getParameter("curPage");
		
		int curPage = -1;
		
		if(sCurPage!=null) {
			curPage = Integer.parseInt(sCurPage);
		}
		
		
		
		request.setAttribute("dto", dto);
		request.setAttribute("curPage", curPage);
		
		return new CommandAction(false, "b_read.jsp");
	}

}
