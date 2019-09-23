package com.cafe24.eduManger.ProfesCarController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfessorCareerController {

		@GetMapping("profesCareerList")
		public String professorCareerSelect() {
			return "profesCar/profesCareerList";
		}
		
	}


