package org.zerock.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.board.BoardDto;
import org.zerock.service.board.BoardSerivce;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardSerivce service;

	@GetMapping("register")
	public void register() {
		// 게시물 작성 view로 포워드
		// /WEB-INF/views/board/register.jsp
	}
	
	@PostMapping("register")
	public void register(BoardDto board) {
		// request param 수집/가공
		System.out.println(board);
		
		// business logic
		service.register(board);
	}
	
	
}








