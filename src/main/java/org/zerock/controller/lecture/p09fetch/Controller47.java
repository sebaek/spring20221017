package org.zerock.controller.lecture.p09fetch;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ex47")
public class Controller47 {

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
}










