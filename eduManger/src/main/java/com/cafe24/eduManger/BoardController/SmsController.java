package com.cafe24.eduManger.BoardController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmsController {

	@GetMapping("/smsInsert")
	public String smsInsert() {
		
		return "/board/smsInsert";
	}
	
	
}
