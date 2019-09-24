package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceLectureController {

	@GetMapping("/priceLectureList")
	public String priceLectureList() {
		
		return "/academy/priceLecture/priceLectureList";
	}
	
}
