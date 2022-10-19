package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {

	// ex15/sub01
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("메소드1번 일함!$!$#!$!@$#!@");
	}
	
	// sub02 요청
	// /WEB-INF/views/ex15/sub02.jsp 로 포워드 
	
	
}










