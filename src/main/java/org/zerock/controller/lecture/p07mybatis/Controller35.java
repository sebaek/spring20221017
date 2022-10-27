package org.zerock.controller.lecture.p07mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean04;
import org.zerock.mapper.lecture.Mapper09;

@Controller
@RequestMapping("ex35")
public class Controller35 {

	@Autowired
	private Mapper09 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		String name1 = mapper.getCustomerNameById(1);
		String name2 = mapper.getCustomerNameById(2);
		
		System.out.println(name1);
		System.out.println(name2);
	}
	
	@RequestMapping("sub02")
	public void method2() {
		/*
		 * SELECT FirstName FROM Employees WHERE EmployeeID = ?
		 * 
		 */
		String name1 = mapper.getEmployeeFirstNameById(1);
		String name2 = mapper.getEmployeeFirstNameById(2);
		
		System.out.println(name1);
		System.out.println(name2);
	}
	
	@RequestMapping("sub03")
	public void method3() {
		List<String> berlin = mapper.getCustomerNameByCityAndCountry("Germany", "Berlin");
		List<String> london = mapper.getCustomerNameByCityAndCountry("UK", "London");
		
		System.out.println(berlin);
		System.out.println(london);
	}
	
	@RequestMapping("sub04")
	public void method4() {
		String londona = mapper.getSupplierNameByCityAndCountry("UK", "Londona");
		String newOl = mapper.getSupplierNameByCityAndCountry("USA", "New Orleans");
		
		System.out.println(londona); // Exotic Liquid
		System.out.println(newOl); // New Orleans Cajun Delights
	}
	
	// /ex35/sub05?name=Alfreds Futterkiste&country=Germany
	// ---> Maria Anders
	// /ex35/sub05?name=Antonio Moreno Taquería&country=Mexico
	// ---> Antonio Moreno
	@RequestMapping("sub05")
	public void method5(JavaBean04 p) {
		String c1 = mapper.getContactName(p);
		System.out.println(c1);
	}
	
	// /ex35/sub06?name=New Orleans Cajun Delights&country=USA
	// ---> Shelley Burke
	
	// /ex35/sub06?name=Grandma Kelly's Homestead&country=USA
	// ---> Regina Murphy
	@RequestMapping("sub06")
	public void method6(JavaBean04 b) {
		String c = mapper.getSupplierContactName(b);
		System.out.println(c);
	}
}






