package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean13;
import org.zerock.mapper.lecture.Mapper07;

@Controller
@RequestMapping("ex34")
public class Controller34 {

	@Autowired
	private Mapper07 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		JavaBean13 category = mapper.getCategory();
		System.out.println(category.getId());
		System.out.println(category.getName());
		category.getProduct().forEach(p -> {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
		});
	}
}







