package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean04;
import org.zerock.mapper.lecture.Mapper03;

@Controller
@RequestMapping("ex30")
public class Controller30 {

	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		JavaBean04 customer = mapper.getCustomer();
		System.out.println(customer);
	}
}




