package com.naver.ceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			if(session.getAttribute("login")!=null) {
				session.removeAttribute("login");
			}
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HttpSession session= request.getSession();
		Object login=modelAndView.getModelMap().get("login");
		if (login!=null) {
			//getmodelmap getmodel똑같음
			session.setAttribute("login", login);
			response.sendRedirect("/board/listpage");
		}else {
			response.sendRedirect("/user/login");

			
		}
		
	}
//~Adapter로 끝나는 건 그 앞에까진 인터페이스라는거 handlerinterceptor가 인터페이스
	//어댑터가 이 인터페이스 구현하는 클래스
	//오버라이드 가서 프리핸들이랑 포스트핸들만체크
	
	
}
