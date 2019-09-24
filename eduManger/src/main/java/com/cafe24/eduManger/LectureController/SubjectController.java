package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {
	
	@GetMapping("/getsubject")
	public String subjectSelect() {
		return "/lecture/subject/subjectList";
	}

	@GetMapping("/subjectInsert")
	public String subjectInsert() {
		return "/lecture/subject/subjectInsert";
	}


}
