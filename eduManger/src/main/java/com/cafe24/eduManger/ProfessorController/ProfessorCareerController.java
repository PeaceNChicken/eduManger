package com.cafe24.eduManger.ProfessorController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfessorCareerController {
	@GetMapping("/getprofesCareer")
	public String professorCareerSelect() {
		return "/professor/profesCar/profesCareerList";
	}
	
	@GetMapping("/profesCarInsert")
	public String professorCareerInsert() {
		return "/professor/profesCar/profesCareerInsert.html";
	}
}
