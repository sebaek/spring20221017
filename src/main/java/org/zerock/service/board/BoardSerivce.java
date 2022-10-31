package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.mapper.board.BoardMapper;

@Service
public class BoardSerivce {

	@Autowired
	private BoardMapper mapper;
	
	public void register(BoardDto board) {
		mapper.insert(board);
	}

	public List<BoardDto> listBoard() {
		// TODO Auto-generated method stub
		return mapper.list();
	}
	
}





