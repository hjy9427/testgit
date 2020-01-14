package com.naver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = getInitParameter("user");
		System.out.println(user);
		
		String password = getInitParameter("password");
		System.out.println(password);
		
		ServletContext ctx = getServletContext();
		String driver = ctx.getInitParameter("driver");
		System.out.println(driver);
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sAge = request.getParameter("age");
		
		int age = -1;
		if(sAge != null) {
			age = Integer.parseInt(sAge);	
		}
		
		MemberDAO dao = new MemberDAO();
		dao.insert(new MemberDTO(id, name, age));
		
		ServletContext application = getServletContext();
		//여기 데이터 저장
		//영역개체 네개있는데 사용방법은 가틈 데이터 저장
		//가장 스코프가 큰게 어플리케이션
		//다음 ?? 그 다음 리퀘스트 그 다음 페이지컨텍스트 
		//다 셋어트리뷰트 이용 가져올떈 겟어트리뷰트이용
		application.setAttribute("id", id);
		//모든 자료형을 다 저장할 수 있게 하기 위해 두번쨰꺼가 오브젝트임
		//setAttribute getAttribute
		//내장개체가 9개
		application.setAttribute("name", name);
		application.setAttribute("age", age);
		application.setAttribute("dto", new MemberDTO(id, name, age));
		
		//리다이렉트방식
		response.sendRedirect("test.jsp");
		//dispatcher보다간단
		//근데용도가다름
		
		
	
	}

}
