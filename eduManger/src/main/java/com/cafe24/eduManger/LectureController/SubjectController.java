package com.cafe24.eduManger.LectureController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.eduManger.LectureService.SubjectService;
import com.cafe24.eduManger.LectureVo.Subject;


@Controller
public class SubjectController {
	
	@Autowired
	//Subjectservice subjectservice = new SubjectService();
	private SubjectService subjectService;
	
	@GetMapping("/getsubjectList")//경로연결 시 필요한 키
	public String subjectSelect(Model model) {
		
		model.addAttribute("subjectList", subjectService.subjectList());
							//객체 꺼낼 때 필요한 키
		return "/lecture/subject/subjectList";
	}

	@GetMapping("/subjectInsert")
	public String subjectInsert() {
		return "/lecture/subject/subjectInsert";
	}

	@GetMapping("/subjectUpdate")
	public String subjectUpdate() {
		return "/lecture/subject/subjectUpdate";
	}
	
	@GetMapping("/subjectDelete")
	public String subjectDelete() {
		return "/lecture/subject/subjectDelete";
	}
	
	
}
