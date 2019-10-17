package com.cafe24.eduManger.LectureController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.LectureService.LectureService;
import com.cafe24.eduManger.LectureVo.Lecture;

@Controller
public class LectureController {
	
	@Autowired
	private LectureService lectureService;

	//리스트
	@GetMapping("/getlecture")
	public String lectureSelect(Model model) {
		model.addAttribute("lectureList", lectureService.lectureList());
		return "/lecture/lectureList/lectureList";
	}
	
	@GetMapping("/lectureInsertForm")
	public String lectureInsertForm(Model model) {
		List<Lecture> list = lectureService.lecInsertList();
		System.out.println(list.toString());
		model.addAttribute("lecInsertList", lectureService.lecInsertList());
		return "/lecture/lectureList/lectureInsert";
	}
	@PostMapping("/lectureInsert")
	public String lectureInsert(Lecture lecture) {
		lectureService.lectureInsert(lecture);
		return "redirect:/getlecture";
	}
	
	
	@GetMapping("/lectureUpdate")
	public String lectureUpdate() {
		return "/lecture/lectureList/lectureUpdate";
	}
	
	//삭제
	@GetMapping("/lectureDelete")
	public String lectureDelete(@RequestParam(value="lectureDel") String lectureDel) {
		//System.out.println(lectureDel + " <--com.cafe24.eduManger.LectureController.lectureDelete");
		lectureService.lectureDelete(lectureDel);
		return "redirect:/getlecture";
	}
	
	@GetMapping("/lecStuList")
	public String view(Model model) {
		model.addAttribute("lectureStuGroupList", "getlectureStuGroupList");
		return "/lectureStuGroup/lectureStuGroupList";
	} //화면을 연결하고싶은데, 어떻게해야할지 모르겠... model이 아니라 map을 써야하는거 같은데..



}
