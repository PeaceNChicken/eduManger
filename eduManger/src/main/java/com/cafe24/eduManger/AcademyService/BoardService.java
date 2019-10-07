package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.BoardMapper;
import com.cafe24.eduManger.AcademyVo.Board;

@Service
@Transactional
public class BoardService {
@Autowired private BoardMapper boardMapper;
	public Map<String, Object> getBoard(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Board> bo = boardMapper.getBoard();
		map.put("board", bo);
		return map;
	}
	
	public Board getBoardUpdate(String board){
		return boardMapper.getBoardUpdate(board);
	}
	
}

