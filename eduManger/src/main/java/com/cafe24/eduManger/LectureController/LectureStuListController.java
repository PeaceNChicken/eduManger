package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LectureStuListController {
	
	@GetMapping("lectureStuList")
	public String lectureStuList() {
		return "/lecture/lectureStuList/lectureStuList";
	}

}
