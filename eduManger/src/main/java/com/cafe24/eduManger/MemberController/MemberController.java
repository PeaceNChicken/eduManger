package com.cafe24.eduManger.MemberController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.eduManger.MemberService.MemberService;
import com.cafe24.eduManger.MemberVo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("memberList")
	public String memberList(Model model) {
		
		model.addAttribute("memberList", memberService.memberList());
		return "/member/memberList/memberList";
	}
	
	@GetMapping("memberInsert")
	public String memberInsert() {		
		return "/member/memberInsert/memberInsert";
	}
	
	@PostMapping("memberInsert")
	public String memberInsert(Member member) {
		System.out.println(member.toString() +"<----member com.cafe24.eduManger.MemberController memberInsert");
		//memberService.memberInsert(member);
		return "redirect:/memberList";
	}
	
	
}
