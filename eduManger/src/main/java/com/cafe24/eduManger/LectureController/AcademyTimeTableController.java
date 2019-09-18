package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcademyTimeTableController {

	@GetMapping("acTimeTable")
	public String acTimeTalbe() {
		return "/lecture/academyTimeTable/academyTimeTableList";
	}
}
