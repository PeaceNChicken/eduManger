package com.cafe24.eduManger.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttendDataController {
	
	@GetMapping("attendData")
	public String attendData() {
		return "/students/attend_data/attend_data";
	}

}
