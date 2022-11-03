package org.zerock.controller.lecture.p09fetch;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}











