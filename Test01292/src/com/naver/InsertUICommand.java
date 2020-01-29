package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertUICommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//response.sendRedirect("insert.jsp");
		
		//입력한 데이터를 보여주는 역할
		//데이터 바인딩 할 필요 없음
		//포워딩만하면됨
		//디스패쳐로해야함
		//위에 주소창이 바뀜
		
		//request.getRequestDispatcher("insert.jsp")
		//.forward(request, response);
		//디스팻쳐방식
	
		return new CommandAction(true, "insert.jsp");
	}

}
