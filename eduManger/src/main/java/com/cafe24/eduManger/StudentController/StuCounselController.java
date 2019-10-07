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
	
	//학생리스트 출력
	@GetMapping("/stuCounsel")
	public String stuCounsel(Model model, HttpSession session) {								
		stuCounselService.stuList(model,session);
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
		
		stuCounselService.stuSearch(sk, sv, model);
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselList")
	public String stuCounselList(@RequestParam(value="memberId", required=false)String mId
								,Model model
								,HttpSession session) {
		//System.out.println(mId + "<----- mId com.cafe24.eduManger.StudentController.StuCounselController.stuCounselList");	
		stuCounselService.stuCounselList(mId, session, model);
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
								  	  ,Model model
								  	  ,HttpSession session) { 
		//System.out.println(stuCounselCode + "<----- stuCounselCode com.cafe24.eduManger.StudentController.StuCounselController.stuCounselUpdateForm");
		//System.out.println(mId + "<----- mId com.cafe24.eduManger.StudentController.StuCounselController.stuCounselUpdateForm");
		
		stuCounselService.stuCounselUpdateForm(stuCounselCode, mId, model,session);
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
