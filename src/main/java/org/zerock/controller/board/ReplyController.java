package org.zerock.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.board.ReplyDto;

@Controller
@RequestMapping("reply")
public class ReplyController {

	@PostMapping("add")
	public void add(@RequestBody ReplyDto reply) {
		System.out.println(reply);
	}
}




