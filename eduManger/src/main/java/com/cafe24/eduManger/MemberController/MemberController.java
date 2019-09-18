package com.cafe24.eduManger.MemberController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MemberController {

//	@Autowired 
//	private MemberService memberService;
	
	@GetMapping("/memberList")
	public String memberList() {
		return "/member/memberList";
	}
	
	@GetMapping("/memberInsert")
	public String memberInsert() {
		return "/member/memberInsert";
	}
	
	@GetMapping("/plectureInsert")
	public String plectureInsert() {
		return "/professor/plectureInsert";
	}
	
	@GetMapping("/plectureList")
	public String plectureList() {
		return "/professor/plectureList";
	}
}
