package com.cafe24.eduManger.LectureController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.LectureService.SubjectService;
import com.cafe24.eduManger.LectureVo.Subject;


@Controller
public class SubjectController {
	
	@Autowired
	//Subjectservice subjectservice = new SubjectService();
	private SubjectService subjectService;
	
	@GetMapping("/getsubjectList")//경로연결 시 필요한 키
							 //데이터타입   변수
	public String subjectSelect(Model model, HttpSession session) {
		
		model.addAttribute("subjectList", subjectService.subjectList(session));
							//객체 꺼낼 때 필요한 키
		return "/lecture/subject/subjectList";
	}

	@GetMapping("/subjectInsert")
	public String subjectInsert() {
		//Subject subject;
		//subject = 입력폼에서 입력한 데이터들;
		
		//함수호출(입력폼에서 입력한 데이터들);
		
		//객체에 접근
		//subjectService.subjectInsert(subject);
		
		return "/lecture/subject/subjectInsert";
	}

	@GetMapping("/subjectUpdate")
	public String subjectUpdate(@RequestParam(value="subcodeUp") String subcodeUp, Model model) {
		System.out.println(subcodeUp + "<-- subcodeUp com.cafe24.eduManger.LectureController.SubjectController.subjectUpdate");
		Subject subList = subjectService.subjectUpdate(subcodeUp);
		System.out.println(subList.toString() + "<---com.cafe24.eduManger.LectureController.SubjectController.subjectUpdate");
		model.addAttribute("subjectUpdate", subList);
		return "/lecture/subject/subjectUpdate";
	}	
	
	@GetMapping("/subjectDelete")	//한 컬럼값을 받을 경우 @RequestParam(value="받을키값") 받을데이터타입 변수)
	public String subjectDelete(@RequestParam(value="subcodeDel") String subcodeDel) {
		//System.out.println(subcodeDel + "<--subjectDelete com.cafe24.eduManger.LectureController.SubjectController.subjectDelete");
		subjectService.subjectDelete(subcodeDel);
		return "redirect:/getsubjectList";
	}
	
	@PostMapping("/subjectInsert") 
	public String subjectInsert(String sub_name, HttpSession session) {
		//System.out.println(subject.toString() + "<--subject.toString() com.cafe24.eduManger.LectureController.SubjectController.subjectInsert");
		subjectService.subjectInsert(sub_name, session);
		return "redirect:/getsubjectList";
	}
	
}
