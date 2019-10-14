package com.cafe24.eduManger.LectureController;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.LectureService.ClassLevelService;
import com.cafe24.eduManger.LectureVo.ClassLevel;


@Controller
public class ClassLevelController {
	
	@Autowired
	private ClassLevelService ClassLevelService;
	
	
	//학년 및 수업과정 분류 리스트 - db연결
	@GetMapping("/getclassLevel")
		public String classLevelSelect(Model model) {	
			model.addAttribute("ClassLevelList", ClassLevelService.ClassLevelList());
			return "/lecture/classLevel/classLevelList";
		}

	
	//학년 및 수업과정 분류 추가폼으로 이동
	@GetMapping("/classLevelInsertForm")
		public String classLevelInsertForm() {
		return "/lecture/classLevel/classLevelInsert";
	}
	
	//학년 및 수업과정 분류 추가
	@PostMapping("/classLevelInsert")
		public String classLevelInsert(ClassLevel classLevel) {
		System.out.println(classLevel.toString() +" <--classLevel.toString() com.cafe24.eduManger.LectureController.ClassLevelController");
		ClassLevelService.classLevelInsert(classLevel);
			return "redirect:/getclassLevel";
	}
	
	
	//학년 및 수업과정 분류 수정
	@GetMapping("/classLevelUpdate")
		public String classLevelUpdate() {
			return "/lecture/classLevel/classLevelUpdate";
	}
	
	//학년 및 수업과정 분류 삭제
	@GetMapping("/classLevelDelete")
		public String classLevelDelete(@RequestParam(value="classLevelDel") String classLevelDel) {
		ClassLevelService.classLevelDelete(classLevelDel);
			return "redirect:/getclassLevel";
	}
	
	
	
	
}
