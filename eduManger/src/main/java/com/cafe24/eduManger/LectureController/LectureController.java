package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LectureController {

	@GetMapping("lecture")
	public String lectureList() {
		return "/lecture/lecture/lectureList";
	}
}
