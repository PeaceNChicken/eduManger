package com.cafe24.eduManger.StudentController;


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
		//System.out.println(sk + "<----- sk com.cafe24.eduManger.StudentController.stuCounseSearch");
		//System.out.println(sv + "<----- sv com.cafe24.eduManger.StudentController.stuCounseSearch");
		if(sk.equals("select")) {
			return "redirect:/stuCounsel";
		}
		model.addAttribute("stuList", stuCounselService.stuSearch(sk, sv));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselList")
	public String stuCounselList(@RequestParam(value="memberId")String mId
								,Model model) {
		//System.out.println(mId + "<----- mId com.cafe24.eduManger.StudentController.stuCounselList");
		
		StuCounsel stucounsel = new StuCounsel();
		model.addAttribute("stuCounselUpdateForm", stucounsel);
		
		model.addAttribute("stuList", stuCounselService.stuList());
		model.addAttribute("stuCounselList", stuCounselService.stuCounselList(mId));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselUpdateForm")
	public String stuCounselUpdateForm(@RequestParam(value="counsel_code")String stuCounselCode
								  ,@RequestParam(value="mId")String mId
								  ,Model model) { 
		//System.out.println(stuCounselCode + "<----- stuCounselCode com.cafe24.eduManger.StudentController.stuCounselUpdate");
		//System.out.println(mId + "<----- mId com.cafe24.eduManger.StudentController.stuCounselUpdate");
		
		model.addAttribute("stuCounselList", stuCounselService.stuCounselList(mId));
		model.addAttribute("stuCounselUpdateForm", stuCounselService.stuCounselUpdateForm(stuCounselCode));
		model.addAttribute("stuList", stuCounselService.stuList());
		return "/students/stuCounsel/stuCounsel";
	}
	
	@PostMapping("/stuCounselUdpate")
	public String stuCounselUpdate(StuCounsel stuCounsel
								  ,Model model) {
		System.out.println(stuCounsel.toString());
		System.out.println(stuCounsel.getM_id());
		
		String mId = stuCounsel.getM_id();
		//th:value 초기화
		StuCounsel stucounsel = new StuCounsel();
		model.addAttribute("stuCounselUpdateForm", stucounsel);		
		model.addAttribute("stuCounselList", stuCounselService.stuCounselList(mId));
		return "/students/stuCounsel/stuCounsel";
	}
}
