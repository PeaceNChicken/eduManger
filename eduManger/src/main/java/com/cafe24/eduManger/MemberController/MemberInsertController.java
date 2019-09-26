package com.cafe24.eduManger.MemberController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.eduManger.MemberService.MemberInsertService;
import com.cafe24.eduManger.MemberService.MemberService;
import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Controller
public class MemberInsertController {
	@Autowired
	private MemberInsertService memberInsertService;
	
	@GetMapping("/masterInsert")
	public String masterInsert() {		
		return "/member/memberInsert/masterInsert";
	}
	
	@PostMapping("/masterInsert")
	public String masterInsert(Member member, HttpSession session) {
		//System.out.println(member.toString() +"<----member com.cafe24.eduManger.MemberController memberInsert");
		memberInsertService.masterInsert(member, session);
		return "redirect:/memberList";
	}
	
	@GetMapping("/professorInsert")
	public String professorInsert() {
		return "/member/memberInsert/professorInsert";
	}
	
	@PostMapping("/professorInsert")
	public String professorInsert(ProfesInfo profesInfo,HttpSession session) {
		//System.out.println(profesInfo + "<---- profesInfo com.cafe24.eduManger.MemberController professorInsert");
		memberInsertService.professorInsert(profesInfo, session);		
		return "/index";
	}
	
	@GetMapping("/studentInsert")
	public String studentInsert() {
		return "/member/memberInsert/studentInsert";
	}
	
	@PostMapping("/studentInsert")
	public String studentInsert(Stu_pi stuPi,HttpSession session) {
		//System.out.println(stuPi.toString() + "<--- stuPi.toString()");
		//System.out.println(stuPi.getM_id() + "<--- stuPi.getM_id()");
		memberInsertService.studentInfoInsert(stuPi, session);
		return "/index";
	}

}
