package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex27")
public class Controller27 {
	
	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql1 = "UPDATE Bank "
				+ "SET balance = balance - 100 "
				+ "WHERE customerId = 2";
		String sql2 = "UPDATE Bank SET balance = balance + 100 "
				+ "WHERE customerId = 1";
		
		try (Connection con = dataSource.getConnection()) {
			
			try {
				// autocommit : disabled
				con.setAutoCommit(false);
				
				Statement stmt1 = con.createStatement();
				stmt1.executeUpdate(sql1);
				
//				int a = 0;
//				int b = 3 / a; // ArithmeticException;
				
				Statement stmt2 = con.createStatement();
				stmt2.executeUpdate(sql2);
				
				con.commit();
				
			} catch (Exception e) {
				con.rollback();
			}
		}
	}
}













