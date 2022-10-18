package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Controller07 {

	@GetMapping("sub01")
	public void method1() {
		System.out.println("method1 !!!!!!!!!!!!!!!!!!!");
	}
	
	@GetMapping(value = "sub01", params = "name")
	public void method2() {
		System.out.println("method2 @@@@@");
	}
	
	
	// get 방식
	// sub02 경로
	
	
	
	// get 방식
	// sub02 경로
	// address  request param
}


















