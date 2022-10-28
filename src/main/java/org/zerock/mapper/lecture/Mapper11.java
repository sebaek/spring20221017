package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.JavaBean18;

public interface Mapper11 {
	int updateCustomer(JavaBean18 customer);

	JavaBean18 getCustomerById(int id);
}
