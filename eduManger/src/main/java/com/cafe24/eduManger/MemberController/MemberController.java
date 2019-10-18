package com.cafe24.eduManger.MemberController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.http.HttpSession;

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
	
	@SuppressWarnings("unchecked")
	@GetMapping("/memberList")
	public String memberList(Model model, 
							 HttpSession session
							,@RequestParam(value="currentPage", required = false, defaultValue = "1")int currentPage
							) {
		Map<String,Object> map = memberService.memberList(session, currentPage);
		
		
		model.addAttribute("memberList", (List<Member>)map.get("memberList"));
		model.addAttribute("currentPage", (int)map.get("currentPage"));
		model.addAttribute("lastPage", (int)map.get("lastPage"));
		model.addAttribute("startPageNum", (int)map.get("startPageNum"));
		model.addAttribute("lastPageNum", (int)map.get("lastPageNum"));
		
		return "/member/memberList/memberList";
	}
	
	@GetMapping("/memberInsertIndex")
	public String memberInsertIndex() {
		return "/member/memberIndex/memberIndex";
	}
			
	@GetMapping("/memberUpdate")
	public String memberUpdate(@RequestParam(value="memberId")String m_id,
								Model model) {
		//System.out.println(m_id + "<---- m_id com.cafe24.eduManger.MemberController.MemberController.memberUpdate");
		
		Member memberList = memberService.memberUpdateForm(m_id);
		//System.out.println(memberList.toString() + "<--- memberList.toString() com.cafe24.eduManger.MemberController.MemberController.memberUpdate");
		
		model.addAttribute("memberList", memberList);
		return "/member/memberUpdate/memberUpdate";
	}
	
	@PostMapping("/memberUpdate")
	public String memberUpdate(Member member) {
		//System.out.println(member + "<--- member ccom.cafe24.eduManger.MemberController.MemberController.memberUpdate");
		memberService.memberUpdate(member);
		return "redirect:/memberList";
	}
	
	@GetMapping("/memberDelete")
	public String memberDelete(@RequestParam(value="memberId")String m_id ) {
		//System.out.println(m_id + "<---- m_id com.cafe24.eduManger.MemberController.MemberController.memberDelete");
		memberService.memberDelete(m_id);
		return "redirect:/memberList";
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/memberSearch")
	public String memberSearch(
							   @RequestParam(value="sk")String sk
							  ,@RequestParam(value="sv")String sv
							  ,@RequestParam(value="currentPage" , required = false, defaultValue = "1")int currentPage
							  ,Model model							  
							  ) {		
		//System.out.println(sk + "<--- sk com.cafe24.eduManger.MemberController.MemberController.memberSearch" );
		//System.out.println(sv + "<--- sv com.cafe24.eduManger.MemberController.MemberController.memberSearch" );
		
		if(sk.equals("select")) {
			return "redirect:/memberList";
		}
		
		Map<String,Object> map = memberService.memberSearch(sk, sv, currentPage);
				
		model.addAttribute("memberList", (List<Member>)map.get("memberSearchList"));
		model.addAttribute("currentPage", (int)map.get("currentPage"));
		model.addAttribute("lastPage", (int)map.get("lastPage"));
		model.addAttribute("startPageNum", (int)map.get("startPageNum"));
		model.addAttribute("lastPageNum", (int)map.get("lastPageNum"));
		
		return "/member/memberList/memberList";
	}
	
	
}
