package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		String cPath = request.getContextPath();
		System.out.println(cPath);
		
		String what = uri.substring(cPath.length());
		
		Command com = null;
		
		
		if(what.equalsIgnoreCase("/insertui.do")) {
			com = new InsertUICommand();
			
		} else if (what.equalsIgnoreCase("/insert.do")){
			com = new InsertCommand();
	
		} else if (what.equalsIgnoreCase("/list.do")) {
			com = new ListCommand();
		} else if (what.equalsIgnoreCase("/loginui.do")) {
			com = new LoginUICommand();
		} else if (what.equalsIgnoreCase("/login.do")) {
			com = new LoginCommand();
		} else if (what.equalsIgnoreCase("/logoutui.do")) {
			com = new LogoutUICommand();
		} else if (what.equalsIgnoreCase("/logout.do")) {
			com = new LogoutCommand();
		}
				
		if (com != null) {
			CommandAction action = com.execute(request, response);	
			//포워딩 어디서 할지 어디로 갈건지에 대한 정보
			if(action.isRedirect()) {
				response.sendRedirect(action.getWhere());
			} else {
				request.getRequestDispatcher(action.getWhere())
				.forward(request, response);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
