package com.naver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertui")
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
		
		RequestDispatcher dis = request.getRequestDispatcher("insert.html");
		dis.forward(request, response);
		
		
		/*
		 * PrintWriter out = response.getWriter(); 
		 * out.print("<html>");
		 * out.print("<body>"); 
		 * out.print("<form action = 'insert'>"); 
		 * //디비에 저장됨 
		 * //실제로
		 * 저장되게 하느 건 인서트임 
		 * out.print("</body>"); 
		 * out.print("</html>");
		 */
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
