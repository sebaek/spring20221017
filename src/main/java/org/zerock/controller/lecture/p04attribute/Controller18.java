package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex18")
public class Controller18 {

	@RequestMapping("sub01")
	public void method01(
			@RequestParam("name")
			@ModelAttribute("str")
			String a) {
		
	}
}






