package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.mapper.lecture.Mapper10;

@Configuration
@RequestMapping("ex36")
public class Controller36 {

	@Autowired
	private Mapper10 mapper;

	@RequestMapping("sub01")
	public void method1() {
		int cnt = mapper.removeCustomer();
		System.out.println(cnt + "개 레코드 삭제됨");
	}

	@RequestMapping("sub02")
	public void method2() {
		int cnt = mapper.removeEmployee(); // 1번 직원 삭제
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}

	@RequestMapping("sub03")
	public void method3(@RequestParam(name = "id", defaultValue = "0") int id) {
		int cnt = mapper.removeCustomerById(id);
		System.out.println(cnt + "개 고객 레코드 삭제됨");
	}

	@RequestMapping("sub04")
	public void method4(@RequestParam(name = "id", defaultValue = "0") int id) {
		int cnt = mapper.removeEmployeeById(id);
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}

}
