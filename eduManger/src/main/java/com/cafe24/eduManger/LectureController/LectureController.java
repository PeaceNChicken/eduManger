package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LectureController {
	
	@GetMapping("/getlecture")
	public String lectureSelect() {
		return "/lecture/lectureList/lectureList";
	}
	
	@GetMapping("/lectureInsert")
	public String lectureInsert() {
		return "/lecture/lectureList/lectureInsert";
	}
	
	@GetMapping("/lectureUpdate")
	public String lectureUpdate() {
		return "/lecture/lectureList/lectureUpdate";
	}
	
	@GetMapping("/lectureDelete")
	public String lectureDelete() {
		return "/lecture/lectureList/lecturedelete";
	}
	
}
