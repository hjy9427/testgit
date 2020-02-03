package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String author=request.getParameter("author");
		String title =request.getParameter("title");
		String content =request.getParameter("content");
		
		BoardDAO dao = new BoardDAO();
		
		
		
			dao.insert(new BoardDTO(-1, author, title, content, null, 0, 0, 0, 0));
			
			
		/*
		 * for (int i = 0; i < 100; i++) { //백개 한꺼번에 만들고 싶을 때 
		 * dao.insert(newBoardDTO(-1, author, title+i, content, null, 0, 0, 0, 0)); 
		 * } 
		 * try {
		 * Thread.sleep(50); 
		 * } catch (InterruptedException e) {
		 * e.printStackTrace(); 
		 * }
		 */
		return new CommandAction(true, "list.do");
	}

}
