package com.naver;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public InsertUIServlet() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String url = ctx.getInitParameter("driver");
		System.out.println(url);
		//여긴 유알엘
		String user = getInitParameter("user");
		String password = getInitParameter("password");
		System.out.println(user);
		System.out.println(password);
		
		RequestDispatcher dis = request.getRequestDispatcher("insertui.html");
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
