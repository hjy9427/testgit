package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//1.client가 보내준 데이터를 획득/가공
		//2.DAO 객체 생성 및 해당 메서드 호출/ 데이터 획득
		//3.데이터 바인딩(application, session(login), 
		//request, pageContext)
		//request scope한리퀘안 디스패쳐방식에서만살아남고 
		//리다이렉트에ㅓㄴ살아남지못함
		//겟어트리뷰트, 셋어트리뷰트
		//포워딩작업:CommandAction 패턴으로작업
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sAge = request.getParameter("age");
		
		int age = -1;
		
		if(sAge != null) {
			age = Integer.valueOf(sAge);
			//parseInt valueOf써도됨
			
		}
		MemberDAO dao = new MemberDAO();
		dao.insert(new MemberDTO(id, name, age));
		//dto 객체를 넣는 것임 id name age 따로따로 
		//넣는게 아니라
		
		//response.sendRedirect("read.do?id="+id);
		//바인딩할 게 없음
		//포워딩해줌
		
		//response.sendRedirect("list.do");
		
		return new CommandAction(true, "list.do");
	}

	

}
