package com.naver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession sess = request.getSession(false);
		if(sess != null) {
			sess.invalidate();
			//or
			//sess.removeAttribute("login");
			//영역객체세션 페이지컨텍스트 리퀘 ? 4개 모두에게 들어가 있음
		}
		return new CommandAction(true, "list.do");
		//주소 바뀌어야하니까 트루 첫 화면으로 돌아가기
		//db에있느 ㄴ데이타 안넘어감
	}

}
