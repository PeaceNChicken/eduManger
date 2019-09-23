package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcademyController {
	
	/*
	 * @GetMapping("/academyInfo") public String academyInfo() {
	 * 
	 * return "/board/academyInfo"; }
	 */

	/* @param /academyList url
	 * @return /academy/academyList.html 화면
	 * @detail 계약된 학원 정보 목록을 클릭하면 return 화면으로 이동
	 */ 
	@RequestMapping(value="/academyList") //@getMapping("/academyList")로 바꿔도 무관
	public String academyList() {
		
		return "/academy/academyList";
	}
	
	@GetMapping("/academyInfo")
	public String academyInfo() {
		
		return "/academy/academyInfo";
	}
	
}
