package org.zerock.controller.lecture.p09fetch;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("ex47")
public class Controller47 {
	
	@Autowired
	private Mapper11 mapper;

	@RequestMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	@ResponseBody
	public Map<String, String> method1() {
		return Map.of("address", "seoul", "name", "손흥민", "job", "soccer player");
	}
	
	@GetMapping("sub03")
	@ResponseBody
	public Map<String, Object> method3() {
		return Map.of("color", List.of("blue", "red"), "model", 5, "location", "usa");
	}
	
	@GetMapping("sub04")
	@ResponseBody
	public JavaBean18 method4() {
		return mapper.getCustomerById(30);
	}
	
	@GetMapping("sub05")
	@ResponseBody
	public JavaBean19 method5() {
		return mapper.getSupplierById(2);
	}
}










