package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/boardList")
	public String getBoard() {
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
}
