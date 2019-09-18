package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {
	
	@GetMapping("subject")
	public String subjectList() {
		return "/lecture/subject/subjectList";
	}

}
