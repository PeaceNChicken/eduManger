package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@GetMapping("/lecStuList")
	public String view(Model model) {
		model.addAttribute("lectureStuGroupList", "getlectureStuGroupList");
		return "/lectureStuGroup/lectureStuGroupList";
	} //화면을 연결하고싶은데, 어떻게해야할지 모르겠... model이 아니라 map을 써야하는거 같은데..



}
