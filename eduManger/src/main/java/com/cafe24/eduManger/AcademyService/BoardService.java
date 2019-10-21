package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
	
	public int getBoardDelete(String board) {
		return boardMapper.getBoardDelete(board);    
	}
	
	public List<Board> getBoardSearch(String sk, String sv) {
		return boardMapper.getBoardSearch(sk, sv);
		
	}
	
	public int getBoardInsert(Board board, HttpSession session) {
	String bp = (String)session.getAttribute("SACODE");	
	board.setAc_code(bp);
	System.out.println(board);
	int pu = boardMapper.getBoardCode()+1;
	String ba = "board";
	board.setBoard_code(ba + pu);
	System.out.println(board+"<--board");
		return boardMapper.getBoardInsert(board);
	}
}

