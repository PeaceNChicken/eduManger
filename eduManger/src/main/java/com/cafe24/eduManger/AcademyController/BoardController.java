package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.AcademyService.BoardService;

@Controller
public class BoardController {
@Autowired private BoardService boardService;

	@GetMapping("/boardList")
	public String getBoard(Model model) {
		Map<String, Object> map = boardService.getBoard();
		System.out.println(map+"<-- map board");
		model.addAttribute("Board", map.get("Board"));
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
	public String getReplyList(Model model) {
		return "/academy/board/reply/replyList";
	}
}
