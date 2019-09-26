package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassLevelController {

	@GetMapping("/getclassLevel")
		public String classLevelSelect() {
			return "/lecture/classLevel/classLevelList";
		}
	
	
	@GetMapping("/classLevelInsert")
		public String classLevelInsert() {
			return "/lecture/classLevel/classLevelInsert";
	}
	
	
}
