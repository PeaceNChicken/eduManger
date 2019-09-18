package com.cafe24.eduManger.BoardController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcademyController {

	@GetMapping("/academyInfo")
	public String academyInfo() {
		
		return "/board/academyInfo";
	}
	
	
}
