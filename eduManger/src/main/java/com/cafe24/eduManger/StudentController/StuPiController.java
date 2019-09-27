package com.cafe24.eduManger.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.StudentService.StuPiService;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Controller
public class StuPiController {

	@Autowired
	private StuPiService stuService;
	
	
	@GetMapping("/stuPi") 
	public String stuList(Model model) {
		
		Stu_pi stuPi = new Stu_pi();
		model.addAttribute("stuPi", stuPi);
		model.addAttribute("stuList", stuService.stuList()); 
		return "/students/stuPi/stuPi"; 
	}
	 
	
	@GetMapping("/stuPiList")
	public String stuPi(@RequestParam(value="stuId")String stuId
					   ,Model model) {		
		
		//System.out.println(stuService.stuPi(stuId).toString() + "<-----Stu_Pi");
		
		model.addAttribute("stuPi", stuService.stuPi(stuId));
		model.addAttribute("stuList", stuService.stuList());
		return "/students/stuPi/stuPi";
	}
	
	@PostMapping("/stuPiUpdate")
	public String stuPi(Stu_pi stuPi) {
		
		stuService.stuPiUpdate(stuPi);
		return "redirect:/stuPi"; 
	}
	
}
