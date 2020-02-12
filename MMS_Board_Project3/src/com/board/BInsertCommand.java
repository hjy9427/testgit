package com.board;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naver.Command;
import com.naver.CommandAction;

public class BInsertCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDAO dao = new BoardDAO();
		dao.insert(new BoardDTO(-1, author, title, content, null, 0, -1, 0, 0, 0, 0)); //num값은 무엇을 넣어도 상관없음(어차피 dao에서 num값 다시 세팅함)
		
		return new CommandAction(true, "list.do");
	}

}
