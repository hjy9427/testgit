package kr.co.ca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test39Controller {
	
	@RequestMapping("interC")
	public void interC() {
		System.out.println(";;;;;;interC;;;;;;;;");
	}
	
	
	@RequestMapping("ceptorA")
	public void testInterceptor() {
		System.out.println(";;;;;;;;;;;;;testInterceptor;;;;;;;;;");
	}


}
