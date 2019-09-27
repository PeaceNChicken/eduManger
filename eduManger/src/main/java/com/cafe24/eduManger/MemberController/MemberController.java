package com.cafe24.eduManger.MemberController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.MemberService.MemberService;
import com.cafe24.eduManger.MemberVo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/memberList")
	public String memberList(Model model) {
		
		model.addAttribute("memberList", memberService.memberList());
		return "/member/memberList/memberList";
	}
	
	@GetMapping("/memberInsertIndex")
	public String memberInsertIndex() {
		return "/member/memberIndex/memberIndex";
	}
			
	@GetMapping("/memberUpdate")
	public String memberUpdate(@RequestParam(value="memberId")String m_id,
								Model model) {
		//System.out.println(m_id + "<---- m_id com.cafe24.eduManger.MemberController memberUpdate");
		
		Member memberList = memberService.memberUpdateForm(m_id);
		//System.out.println(memberList.toString() + "<--- memberList.toString() com.cafe24.eduManger.MemberController memberUpdateForm");
		
		model.addAttribute("memberList", memberList);
		return "/member/memberUpdate/memberUpdate";
	}
	
	@PostMapping("/memberUpdate")
	public String memberUpdate(Member member) {
		//System.out.println(member + "<--- member com.cafe24.eduManger.MemberController memberUpdate");
		memberService.memberUpdate(member);
		return "redirect:/memberList";
	}
	
	@GetMapping("/memberDelete")
	public String memberDelete(@RequestParam(value="memberId")String m_id ) {
		//System.out.println(m_id + "<---- m_id com.cafe24.eduManger.MemberController memberDelete");
		memberService.memberDelete(m_id);
		return "redirect:/memberList";
	}
	
	@PostMapping("/memberSearch")
	public String memberSearch(
							   @RequestParam(value="sk")String sk
							  ,@RequestParam(value="sv")String sv
							  ,Model model
							  ) {		
		System.out.println(sk + "<--- sk com.cafe24.eduManger.MemberController memberSearch" );
		System.out.println(sv + "<--- sv com.cafe24.eduManger.MemberController memberSearch" );
		
		if(sk.equals("select")) {
			return "redirect:/memberList";
		}
		model.addAttribute("memberList", memberService.memberSearch(sk, sv));
		
		return "/member/memberList/memberList";
	}
	
	
}
