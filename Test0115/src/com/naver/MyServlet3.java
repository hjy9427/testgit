package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.smartcardio.CommandAPDU;


@WebServlet("*.do")
//.do로 끝나는건 다 여기로 들어와서 실행시키라는 의미
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MyServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String what = request.getServletPath();
		//클라이언트가 요구하는거
		//System.out.println(what);
		String uri = request.getRequestURI();
		System.out.println(uri);
		String cPath = request.getContextPath();
		System.out.println(cPath);
		
		String what = uri.substring(cPath.length());
		
		Command com = null;
		
		
		if(what.equalsIgnoreCase("/insert.do")) {
			com = new InsertCommand();
			
		} else if (what.equalsIgnoreCase("/list.do")){
			com = new SelectCommand();
	
		} else if (what.equalsIgnoreCase("/insertui.do")) {
			com = new InsertUICommand();
		}
				
		if (com != null) {
			com.execute(request, response);	
		}
		
		//mvc2 패턴 컨트롤러
		//프론트 컨트롤러
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
