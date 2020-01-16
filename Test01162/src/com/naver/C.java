package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class C
 */
@WebServlet("/c")
public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public C() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		System.out.println(sess);
		//javax
		//session.setAttribute();안됨
		//서블릿에 세션없음 서버에 있음 세션위치알려주는 제이세션아이디를
		//클라이언트한테 보냄
		//요청할 떄마다 자동으로이 제이세션아이디를 보냄
		//세션이 이 아이디 있는지 여부 확인
		//세션객체가져올떈리퀘이용해야함
		//로그인 처음할 떈 세션 없음
		//그래서 만들어줘야함
		//있으면 값ㅇ르 넣어주고 없으면 널
		//없으면 만들어서줌
		//HttpSession sess = request.getSession();
		//false 넣어주면 세션 없으면 널 주란 얘기
		//true 있으면 넘겨주고 없으면 만들어서 주기 기본값
		//false 로그인 이후 하는 작업에선 이거 사용
		//정보변경주소변경이런건 false
		
		sess.setAttribute("id", "teacheryo");
		response.sendRedirect("d");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
