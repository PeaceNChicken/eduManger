package com.cafe24.eduManger.ProfessorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.ProfessorService.ProfesCarService;

@Controller
public class ProfesCarController {
	@Autowired
	private ProfesCarService profesCarService;
	
	@GetMapping("/getprofesCareer")
	public String professorCareerSelect() {
		return "/professor/profesCar/profesCareerList";
	}
	
	@GetMapping("/profesCarInsert")
	public String professorCareerInsert() {
		return "/professor/profesCar/profesCareerInsert";
	}

}
