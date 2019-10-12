package com.cafe24.eduManger.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.cafe24.eduManger.StudentService.StuScoreService;

@Controller
public class StuScoreController {
		@Autowired
		private StuScoreService StuScoreService;
	
		@GetMapping("/getStuScoreList")
	public String stuScoreSelect(Model model) {
			model.addAttribute("StuScoreList", StuScoreService.StuScoreList());
		return "/students/stuScore/stuScoreList";
	}
		
		@GetMapping("/stuScoreInsert")
		public String stuScoreInsert() {
			return "/students/stuScore/stuScoreInsert";
		}

		
		@PostMapping("/postStuScoreList")
		public String poststuScore() {
			return "/students/stuScore/stuScoreList";
		}
		
		
		@GetMapping("/stuScoreUpdate")
		public String stuScoreUpdate() {
			return "/students/stuScore/stuScoreUpdate";
		}
		
		@GetMapping("/stuScoreDelete")
		public String stuScoreDelete() {
			return "/students/stuScore/stuScoreDelete";
		}
		
		
		
}
