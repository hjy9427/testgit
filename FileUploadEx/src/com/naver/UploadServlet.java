package com.naver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = "";
		String filename = "";
		String originalname = "";
		String uploadPath = request.getServletContext().getRealPath("img");
		
		MultipartRequest multi = new MultipartRequest(request, uploadPath, 10*1024*1024, "euc-kr", new DefaultFileRenamePolicy());
		//객체, 어디에 저장, 용량 위에껀 10메가, 브라우저에서 넘어올 떄, 이름 겹치지 않게
	
	multi.getParameter("id");
	filename = multi.getFilesystemName("file");
	originalname = multi.getOriginalFileName("file");
	
	request.setAttribute("id", id);
	request.setAttribute("filename", filename);
	request.setAttribute("originalname", originalname);
	
	request.getRequestDispatcher("check.jsp").forward(request, response);
	
	
	}

}
