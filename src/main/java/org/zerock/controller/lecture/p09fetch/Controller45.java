package org.zerock.controller.lecture.p09fetch;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean20;
import org.zerock.domain.lecture.JavaBean24;
import org.zerock.domain.lecture.JavaBean27;

@Controller
@RequestMapping("ex45")
public class Controller45 {

	@RequestMapping("sub")
	public void method() {

	}

	@GetMapping("sub01")
	public ResponseEntity method01() {
//		return ResponseEntity.ok().build();
//		return ResponseEntity.badRequest().build();
//		return ResponseEntity.notFound().build();
		return ResponseEntity.status(500).build();
	}
	
	@GetMapping("sub02")
	public ResponseEntity method02() {
//		return ResponseEntity.status(202).build();
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("sub03")
	public ResponseEntity method03() {
		return ResponseEntity.ok()
				.header("My-Header", "My-Value")
				.build();
	}
	
	@GetMapping("sub04")
	public ResponseEntity method04() {
		return ResponseEntity.ok()
				.header("Your-Header", "Your-Value")
				.build();
	}
	
	@GetMapping("sub05")
	public ResponseEntity<String> method05() {
		return ResponseEntity.ok()
				.header("Content-Type", "text/plain;charset=UTF-8")
				.body("헬로 월드");
	}
	
	@GetMapping("sub06")
	public ResponseEntity<JavaBean24> method06() {
		JavaBean24 data = new JavaBean24();
		data.setLocation("서울");
		data.setSince("2000년");
		
		return ResponseEntity.ok()
				.body(data);
	}
	
	@GetMapping("sub07")
	public ResponseEntity<JavaBean20> method07() {
		JavaBean20 data = new JavaBean20();
		data.setAddress("서울");
		data.setName("손흥민");
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub08")
	public ResponseEntity<JavaBean27> method08() {
		JavaBean27 data = new JavaBean27();
		data.setName("박지성");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return ResponseEntity.ok(data);
	}
	
}











