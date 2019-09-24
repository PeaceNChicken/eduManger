package com.cafe24.eduManger.ProfessorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.ProfessorService.ProfesCarService;

@Controller
public class ProfesCarController {
	@Autowired
	private ProfesCarService profesCarService;
	
	@GetMapping("profesCarList")
	public String profesCarList() {
		return "professor/profesCar/profesCareerList";
	}


}
