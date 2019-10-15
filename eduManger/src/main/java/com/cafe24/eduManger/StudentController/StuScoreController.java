package com.cafe24.eduManger.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.StudentService.StuScoreService;
import com.cafe24.eduManger.StudentVo.StuScore;

@Controller
public class StuScoreController {
		@Autowired
		private StuScoreService StuScoreService;
	
		@GetMapping("/getStuScoreList")
		public String stuScoreSelect(Model model) {
			model.addAttribute("StuScoreList", StuScoreService.StuScoreList());
			return "/students/stuScore/stuScoreList";
		}
		
		
		//성적입력폼으로 이동
		@GetMapping("/stuScoreInsertForm")
		public String stuScoreInsertForm() {		
			return "/students/stuScore/stuScoreInsert";
		}
		//성적입력, 저장
		@PostMapping("/StuScoreInsert")
		public String stuScoreInsert(StuScore stuScore) {
			StuScoreService.StuScoreInsert(stuScore);
			return "redirect:/getStuScoreList";
		}
		
		
		@GetMapping("/stuScoreUpdate")
		public String stuScoreUpdate() {
			return "/students/stuScore/stuScoreUpdate";
		}
		
		
		//성적리스트 삭제
		@GetMapping("/stuScoreDelete")
		public String stuScoreDelete(@RequestParam(value="stuScoreDel") String stuScoreDel) {
			StuScoreService.StuScoreDelete(stuScoreDel);
			return "redirect:/getStuScoreList";
		}
		
		
		
}
