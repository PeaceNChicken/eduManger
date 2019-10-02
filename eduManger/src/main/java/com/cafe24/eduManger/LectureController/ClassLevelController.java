package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassLevelController {
	//학년 및 수업과정 분류 리스트
	@GetMapping("/getclassLevel")
		public String classLevelSelect() {
			return "/lecture/classLevel/classLevelList";
		}
	
	//학년 및 수업과정 분류 추가
	@GetMapping("/classLevelInsert")
		public String classLevelInsert() {
			return "/lecture/classLevel/classLevelInsert";
	}
	
	//학년 및 수업과정 분류 수정
	@GetMapping("/classLevelUpdate")
		public String classLevelUpdate() {
			return "/lecture/classLevel/classLevelUpdate";
	}
	
	//학년 및 수업과정 분류 삭제
	@GetMapping("/classLevelDelete")
		public String classLevelDelete() {
			return "/lecture/classLevel/classLevelDelete";
	}
	
	
	
	
}
