package com.cafe24.eduManger.StudentController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.StudentService.StuCounselService;

@Controller
public class StuCounselController {
	
	@Autowired
	private StuCounselService stuCounselService;
	
	@GetMapping("/stuCounsel")
	public String stuCounsel(Model model) {						
		model.addAttribute("stuList", stuCounselService.stuList());
		return "/students/stuCounsel/stuCounsel";
	}
	
	@PostMapping("/stuCounselSearch")
	public String stuCounseSearch(@RequestParam(value="sk") String sk
								 ,@RequestParam(value="sv") String sv
								 ,Model model) {
		System.out.println(sk + "<----- sk");
		System.out.println(sv + "<----- sv");
		if(sk.equals("select")) {
			return "redirect:/stuCounsel";
		}
		model.addAttribute("stuList", stuCounselService.stuSearch(sk, sv));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselList")
	public String stuCounselList(@RequestParam(value="memberId")String mId
								,Model model) {
		System.out.println(mId + "<----- stuCounselCode");
		
		model.addAttribute("stuList", stuCounselService.stuList());
		model.addAttribute("stuCounselList", stuCounselService.stuCounselList(mId));
		return "/students/stuCounsel/stuCounsel";
	}
	
	@GetMapping("/stuCounselUpdate")
	public String stuCounselUpdate(@RequestParam(value="stu_counsel_code")String stuCounselCode
								  ,Model model) {
		System.out.println(stuCounselCode + "<----- stuCOunselCode");
		
		model.addAttribute("stuList", stuCounselService.stuList());
		return "/students/stuCounsel/stuCounsel";
	}
}
