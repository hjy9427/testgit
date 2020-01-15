package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class InsertUICommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("insert.jsp")
		.forward(request, response);
		//전에 리퀘스트디스패처 이스 는 request.getRequestDispatcher("insert.jsp")
		//디스 점 포워드 이렇게 두 줄 쓴걸 한 줄로 적은거
		//이렇게 해도 됨
	}

	

}
