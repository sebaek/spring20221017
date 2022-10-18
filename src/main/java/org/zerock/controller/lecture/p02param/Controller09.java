package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {

	// /ex09/sub01?address=seoul
	@GetMapping("sub01")
	public void method1(@RequestParam(name = "address") String a) {
		System.out.println(a);
	}
	
	// sub02 경로
	// get 방식
	// name request param를 받을 수 있는 @RequestParam
	
	// name request param 받아서 출력 
}















