package com.cafe24.eduManger.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StuLectureController {

	@GetMapping("stuLecture")
	public String stuSugang() {
		return "/students/stuLecture/stuLectureList";
	}
}
