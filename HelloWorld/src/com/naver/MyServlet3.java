package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet3
 */

public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(";;;;;doGet();;;;;;;;;");
		//브라우저에 안찍히고 콘솔에 찍힘
		
		String pw = request.getParameter("pw");
		//따옴표 잊지 말기 스트링형이니까 써줘야함
		//클라이언트가 보내준 정보를 받아올 수 있음
		//클라이언트가 뭔가를 보내면 다 스트링임
		//나이를 입력하는 코드는 숫자이지만 스트링형임
		System.out.println(pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(";;;;;;doPost;;;;;;;");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
	
	}

}
