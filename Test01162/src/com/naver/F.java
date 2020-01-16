package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class F
 */
@WebServlet("/f")
public class F extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public F() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession(false);
		//로그인안하고 이체하러가는사람도 있을테니까
		if(sess != null) {
			String id = (String)sess.getAttribute("id");
			
			if(id.equals("T")) {
				System.out.println("이체 성공");
			} else {
				System.out.println("이체 실패");
				System.out.println("로그인하세요.");
				sess.removeAttribute("id");
			}
			
		}else {
			System.out.println("로그인부터 하세요");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
