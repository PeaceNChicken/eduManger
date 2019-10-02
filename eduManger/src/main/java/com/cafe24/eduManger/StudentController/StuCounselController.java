package com.cafe24.eduManger.StudentController;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.StudentService.StuCounselService;
import com.cafe24.eduManger.StudentVo.StuCounsel;

@Controller
public class StuCounselController {
	
	@Autowired
	private StuCounselService stuCounselService;
	
	@GetMapping("/stuCounsel")
	public String stuCounsel(Model model) {						
		
		StuCounsel stucounsel = new StuCounsel();
		model.addAttribute("stuCounselUpdateForm", stucounsel);
		model.addAttribute("stuList", stuCounselService.stuList());
		return "/students/stuCounsel/stuCounsel";
	}
	
	@PostMapping("/stuCounselSearch")
	public String stuCounseSearch(@RequestParam(value="sk") String sk
								 ,@RequestParam(value="sv") String sv
								 ,Model model) {
		//System.out.println(sk + "<----- sk com.cafe24.eduManger.StudentController.StuCounselController.stuCounseSearch");
		//System.out.println(sv + "<----- sv com.cafe24.eduManger.StudentController.StuCounselController.stuCounseSearch");
		if(sk.equals("select")) {
			return "redirect:/stuCounsel";
		}
		model.addAttribute("stuList", stuCounselService.stuSearch(sk, sv));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselList")
	public String stuCounselList(@RequestParam(value="memberId", required=false)String mId
								,Model model
								,HttpSession session) {
		//System.out.println(mId + "<----- mId com.cafe24.eduManger.StudentController.StuCounselController.stuCounselList");
		
		//StuCounsel vo 초기화
		StuCounsel stucounsel = new StuCounsel();
		String sessionId = "";
		
		//mId가 null이 아닐때 session영역에 mId값 대입
		if(mId != null) {
			session.setAttribute("CounselMid", mId);
		}
		
		sessionId = (String)session.getAttribute("CounselMid");
		//초기화된 StuCounsel vo 에 session영역에 저장된 mId를 대입
		stucounsel.setM_id(sessionId);
		
		String voMid = stucounsel.getM_id();
		System.out.println(sessionId + "<---- sessionId");
		System.out.println(voMid + "<----voMid");
		//상담내용 초기화
		model.addAttribute("stuCounselUpdateForm", stucounsel);
		//학생리스트
		model.addAttribute("stuList", stuCounselService.stuList());
		//상담리스트
		model.addAttribute("stuCounselList", stuCounselService.stuCounselList(sessionId));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselInsert")
	public String stuCounselInsert(@RequestParam(value="m_id")String m_id
								  ,Model model
								  ,HttpSession session) {
		model.addAttribute("m_id", m_id);
		model.addAttribute("admin_id", session.getAttribute("SID"));
		return "/students/stuCounsel/stuCounselInsert";
	}
	
	@PostMapping("/stuCounselInsert")
	public String stuCounselInsert(StuCounsel stuCounsel
								  ,HttpSession session) {
		//System.out.println(stuCounsel.toString() + "<---- stuCounsel.toString() com.cafe24.eduManger.StudentController.StuCounselController.stuCounselInsert");
		stuCounselService.stuCounselInsert(stuCounsel, session);
		return "redirect:/stuCounselList";
	}
	
	@GetMapping("/stuCounselUpdateForm")
	public String stuCounselUpdateForm(@RequestParam(value="counsel_code")String stuCounselCode
								  	  ,@RequestParam(value="mId")String mId
								  	  ,Model model) { 
		//System.out.println(stuCounselCode + "<----- stuCounselCode com.cafe24.eduManger.StudentController.StuCounselController.stuCounselUpdateForm");
		//System.out.println(mId + "<----- mId com.cafe24.eduManger.StudentController.StuCounselController.stuCounselUpdateForm");
		
		//학생리스트출력
		model.addAttribute("stuList", stuCounselService.stuList());
		//상담리스트출력
		model.addAttribute("stuCounselList", stuCounselService.stuCounselList(mId));
		//상담내용출력
		model.addAttribute("stuCounselUpdateForm", stuCounselService.stuCounselUpdateForm(stuCounselCode));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@PostMapping("/stuCounselUdpate")
	public String stuCounselUpdate(StuCounsel stuCounsel
								  ,Model model
								  ){
		//System.out.println(stuCounsel.toString() + "<------ stuCounsel.toString() com.cafe24.eduManger.StudentController.StuCounselController.stuCounselUpdate");
		//System.out.println(stuCounsel.getM_id() + "<------ stuCounsel.getM_id() com.cafe24.eduManger.StudentController.StuCounselController.stuCounselUpdate");
				
		stuCounselService.stuCounselUpdate(stuCounsel);	 
		return "redirect:/stuCounselList";
	}
	
	@GetMapping("/stuCounselDelete")
	public String stuCounselDelete(@RequestParam(value="stu_counsel_code")String stuCounselCode) {
		//System.out.println(stuCounselCode);
		stuCounselService.stuCounselDelete(stuCounselCode);
		return "redirect:/stuCounselList";
	}
}
