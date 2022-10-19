package org.zerock.controller.lecture.p05redirect;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex19")
public class Controller19 {
	
	@RequestMapping("sub01")
	public void method1(HttpServletResponse response) throws IOException {
		// redirect response
		String location = "sub02";
		response.sendRedirect(location);
	}
	
	@RequestMapping("sub03")
	public String method3() {
		return "redirect:sub04";
	}
	
	// sub05 요청
	// sub06 redirect 
}



















