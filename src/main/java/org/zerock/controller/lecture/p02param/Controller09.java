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
	@GetMapping("sub02")
	public void method2(@RequestParam(name = "name") String p) {
		System.out.println("name : " + p);
	}
	
	@GetMapping("sub03")
	public void method3(@RequestParam(value = "name") String p) {
		System.out.println("name : " + p);
	}
	
	@GetMapping("sub04")
	public void method4(@RequestParam("name") String p) {
		System.out.println("name : " + p);
	}
	
	// /ex09/sub05?name=donald&address=ny
	@GetMapping("sub05")
	public void method5(@RequestParam("name") String a
						, @RequestParam("address") String b) {
		System.out.println("name:" + a);
		System.out.println("address:" + b);
	}
}















