package com.cafe24.eduManger.ProfessorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.ProfessorService.ProLectureListService;

@Controller
public class ProLectureListController {
	
	@Autowired
	private ProLectureListService proLectureListService;
	
	@GetMapping("proLectureList")
	public String proLectureList() {
		return "professor/proLecture/proLectureList";
	}

}
