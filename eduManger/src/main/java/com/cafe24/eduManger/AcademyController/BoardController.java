package com.cafe24.eduManger.AcademyController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.BoardService;
import com.cafe24.eduManger.AcademyVo.Board;

@Controller
public class BoardController {
@Autowired private BoardService boardService;

	@GetMapping("/boardList")
	public String getBoard(Model model) {
		Map<String, Object> map = boardService.getBoard();
		System.out.println(map+"<-- map board");
		model.addAttribute("board", map.get("board"));
		return "/academy/board/boardList";
	}
	
	@GetMapping("/boardInsert")
	public String getBoardInsert() {
		return "/academy/board/boardInsert";
	}
	
	@GetMapping("/boardUpdate")
	public String getBoardUpdate() {
		return "/academy/board/boardUpdate";
	}
	
	@GetMapping("/replyList")
	public String getReplyList(@RequestParam(value="board") String board, Model model) {
		System.out.println(board+"<--dd");
		System.out.println(boardService.getReplyList(board)+"<--");
		model.addAttribute("replyList", boardService.getReplyList(board));
		return "/academy/board/boardUpdate";
	}
}
