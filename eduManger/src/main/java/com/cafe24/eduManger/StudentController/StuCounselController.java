package com.cafe24.eduManger.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StuCounselController {

	@GetMapping("stuCounsel")
	public String stuSangdam() {
		return "/students/stuCounsel/stuCounselList";
	}
}
