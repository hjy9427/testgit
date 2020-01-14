package com.naver;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YourServlet1
 */
public class YourServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public YourServlet1() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		name = toKor(name);
		String sAge = request.getParameter("age");
		int age = -1;
		if(sAge != null) {
			age = Integer.parseInt(sAge);
		}
		System.out.println(name);
		System.out.println(age);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private String toKor(String msg) {
		try {
			return new String(msg.getBytes("8859_1"), "euc-kr");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
