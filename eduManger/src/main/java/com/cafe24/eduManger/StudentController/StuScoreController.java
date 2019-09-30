package com.cafe24.eduManger.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StuScoreController {
	
		@GetMapping("/getStuScoreList")
	public String stuScoreSelect() {
		return "/students/stuScore/stuScoreList";
	}

		
		@GetMapping("stuScoreInsert")
		public String stuScoreInsert() {
			return "/students/stuScore/stuScoreInsert";
		}
		
		
}
