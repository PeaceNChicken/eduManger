package com.cafe24.eduManger.BoardController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/boardList")
	public String boardList() {
		
		return "/board/boardList";
	}
	
	
}
