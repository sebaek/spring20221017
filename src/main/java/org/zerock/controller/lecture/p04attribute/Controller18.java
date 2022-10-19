package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;

@Controller
@RequestMapping("ex18")
public class Controller18 {

	// /ex18/sub01?name=park&address=seoul&email=abc@daum.net
	@RequestMapping("sub01")
	public void method01(@ModelAttribute("bean") JavaBean01 b) {
		
	}
}






