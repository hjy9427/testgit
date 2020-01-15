package com.naver;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


/*@WebFilter("/*")*/
//url이 위에꺼처럼 들어오면 메서드 적용하란 뜻
//*
public class MyFilterImpl implements Filter {

  
    public MyFilterImpl() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		System.out.println("filter1 request");
		chain.doFilter(request, response);
		//위치 중요
		//이 코드 기준으로 이 앞에 선언되면 리퀘스트 떄 선언
		//이 밑에 코드는 리스펀스 때 적용되는 코드 
		System.out.println("filter1 response");
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
