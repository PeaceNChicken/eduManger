package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassLevelController {

	@GetMapping("classLevel")
	public String classLevelList() {
		return "/lecture/classLevel/classLevelList";
	}
}
