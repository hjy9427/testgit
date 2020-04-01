package com.naver.ceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ca.Test39Controller;

public class TestHandlerInterceptorImpl implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 이 리턴값 false면 매핑해놔도 컨트롤러에 안 들어감
		//그래서 true로 해둬야함
		System.out.println("$$$$$$$preHandle$$$$$$$");
		HandlerMethod method=(HandlerMethod)handler;
		System.out.println(method.getBean());
		//kr.co.ca.Test39Controller@4bce8919라고나옴
		//그 uri를 담당하고 있는 컨트롤러 확인
		
		Method methodObj=method.getMethod();
		System.out.println(methodObj);
		
		Test39Controller t39=(Test39Controller)method.getBean();
		//반환하는게 오브젝트라 형변환함
		t39.me1();
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//컨트롤러실행끝난후
		System.out.println("&&&&&&&&postHandle&&&&&&&");
		//parameter에 ModelAndView하나 더 있음
		//옛날엔 여기다  정보 넣어서 보내줬음
		//세번쨰 파람 핸들러 기억하기 중요
		String login=(String)modelAndView.getModel().get("login");
		//겟모델은 맵임 키가 로그인인 애를 반환
		if(login!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("login", login);
			
			response.sendRedirect("/interC");
			//로그인페이지로 이동 가능
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
