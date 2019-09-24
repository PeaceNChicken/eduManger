package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcademyInfoController {

	@GetMapping("/academyInfo")
	public String academyInfo() {
		
		return "/academy/academyInfo/academyInfo";
	}
}
