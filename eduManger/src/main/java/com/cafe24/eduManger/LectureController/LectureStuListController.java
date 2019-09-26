package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LectureStuListController {

		@GetMapping("/getlectureStuGroupList")
		public String lectureStuListSelect() {
				return "/lecture/lectureStuGroup/lectureStuGroupList";
		}
		
	
		


}

