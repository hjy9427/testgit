package com.naver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ms2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = getServletContext();
		//application project의미함 내장객체중하나
		//스트림만들어서 그 쪽에 있는 데이터 가져오기
		InputStream in = application.getResourceAsStream("/WEB-INF/show.txt");
		//java.io에 있는 인풋스트림
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		response.setContentType("text/html;charset = euc-kr");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		while(true) {
			String msg = br.readLine();
			if(msg == null) {
				break;
			}
			out.print(msg);
			out.print("<br>");
		}
		out.print("</body>");
		out.print("</html>");
		
		br.close();
		isr.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
