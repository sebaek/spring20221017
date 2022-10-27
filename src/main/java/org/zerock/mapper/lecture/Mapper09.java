package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.JavaBean04;

public interface Mapper09 {

	String getCustomerNameById(int id);

	String getEmployeeFirstNameById(int employeeId);
	
	List<String> getCustomerNameByCityAndCountry(String country, String city);

	String getSupplierNameByCityAndCountry(String nation, String location);
	
	String getContactName(JavaBean04 bean1);
}








