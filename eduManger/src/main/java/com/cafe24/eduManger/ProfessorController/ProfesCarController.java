package com.cafe24.eduManger.ProfessorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.ProfessorService.ProfesCarService;

@Controller
public class ProfesCarController {
	@Autowired
	private ProfesCarService profesCarService;
	
	@GetMapping("/getprofesCareer")
	public String professorCareerSelect(Model model) {
		model.addAttribute("profesCarList", profesCarService.ProfesCarList());
		return "/professor/profesCar/profesCareerList";
	}
	
	@GetMapping("/profesCarInsert")
	public String professorCareerInsert() {
		return "/professor/profesCar/profesCareerInsert";
	}

	@GetMapping("/profesCarUpdate")
	public String professorCareerUpdate() {
		return "/professor/profesCar/profesCareerUpdate";
	}
	
	@GetMapping("/profesCarDelete")
	public String professorCareerDelete(@RequestParam(value="idprcarDel") String idprcarDel) {
		profesCarService.ProfesCarDelete(idprcarDel);
		return "redirect:/getprofesCareer";
	}
	
	//강사경력추가할 때, 저장한 값을 post로 보내고 페이지는 리스트로 이동
	@PostMapping("/postprofesCareer")
	public String professorCareerNew() {
		return "/professor/profesCar/profesCareerList";
	}
	
}
