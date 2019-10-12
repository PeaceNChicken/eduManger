package com.cafe24.eduManger.MemberController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.eduManger.MemberService.MemberInsertService;
import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Controller
public class MemberInsertController {
	@Autowired
	private MemberInsertService memberInsertService;
	
	@RequestMapping(value="/idCheck" , produces = "application/json")
	public @ResponseBody Map<String,Object> idCheck(@RequestParam(value="mId")String mId) {
		Map<String, Object> map = new HashMap<String, Object>();
		//System.out.println(mId + "<----ajax mId");	
		map.put("mId", memberInsertService.idDuplicateCheck(mId));
		return map;
	}
	
	@GetMapping("/masterInsert")
	public String masterInsert(Model model) {					
		model.addAttribute("academyList", memberInsertService.academyList());
		return "/member/memberInsert/masterInsert";
	}
	
	@PostMapping("/masterInsert")
	public String masterInsert(Member member,Model model) {
		//System.out.println(member.toString() +"<----member.toString() com.cafe24.eduManger.MemberController.MemberInsertController.memberInsert");
		memberInsertService.masterInsert(member);
				
		return "redirect:/memberList";
	}
	
	@GetMapping("/professorInsert")
	public String professorInsert(Model model) {
		model.addAttribute("academyList", memberInsertService.academyList());
		return "/member/memberInsert/professorInsert";
	}
	
	@PostMapping("/professorInsert")
	public String professorInsert(ProfesInfo profesInfo,HttpSession session) {
		//System.out.println(profesInfo + "<---- profesInfo com.cafe24.eduManger.MemberController.MemberInsertController.professorInsert");
		memberInsertService.professorInsert(profesInfo, session);		
		return "/index";
	}
	
	@GetMapping("/studentInsert")
	public String studentInsert(Model model) {
		model.addAttribute("academyList", memberInsertService.academyList());
		return "/member/memberInsert/studentInsert";
	}
	
	@PostMapping("/studentInsert")
	public String studentInsert(Stu_pi stuPi,HttpSession session) {
		//System.out.println(stuPi.toString() + "<--- stuPi.toString() com.cafe24.eduManger.MemberController.MemberInsertController.studentInsert");
		//System.out.println(stuPi.getM_id() + "<--- stuPi.getM_id() com.cafe24.eduManger.MemberController.MemberInsertController.studentInsert");
		memberInsertService.studentInfoInsert(stuPi, session);
		return "/index";
	}

}
