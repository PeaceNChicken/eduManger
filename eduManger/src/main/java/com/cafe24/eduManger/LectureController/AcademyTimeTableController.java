package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcademyTimeTableController {
	
	@GetMapping("academyTimeTableList")
	public String academyTimeTableList() {
		return "/lecture/academyTimeTable/academyTimeTableList";
	}

}
