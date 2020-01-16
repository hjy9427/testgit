package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class E
 */
@WebServlet("/e")
public class E extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public E() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession(true);
		sess.setMaxInactiveInterval(15);
		//15초만 유지 15초 후엔 유지안됨
		
		sess.setAttribute("id", "teacheryo");
		System.out.println("login success");
		response.sendRedirect("f");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
