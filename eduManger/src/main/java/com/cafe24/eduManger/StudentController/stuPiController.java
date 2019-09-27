package com.cafe24.eduManger.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class stuPiController {

	@GetMapping("/stuPi")
	public String stuSangse() {
		return "/students/stuPi/stuPi";
	}
}
