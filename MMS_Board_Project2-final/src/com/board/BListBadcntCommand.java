package com.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.Command;
import com.naver.CommandAction;

public class BListBadcntCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String sCurPage = request.getParameter("curPage");
		int curPage = 1;
		if(sCurPage != null) {
			curPage = Integer.parseInt(sCurPage);
		}

		BoardDAO dao = new BoardDAO();
		
		BPageTO to = dao.listbadcnt(curPage);
		
		request.setAttribute("listType", "blistbad");
		request.setAttribute("list", to.getList());
		request.setAttribute("to", to);
		return new CommandAction(false, "b_list.jsp");

		}

}
