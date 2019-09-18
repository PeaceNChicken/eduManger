package com.cafe24.eduManger.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StuScoreController {

	@GetMapping("stuScore")
	public String stuRecordList() {
		return "/students/stuScore/stuScoreList";
	}
	
}
