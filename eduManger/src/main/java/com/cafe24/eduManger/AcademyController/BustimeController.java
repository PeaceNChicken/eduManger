package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BustimeController {

	@GetMapping("/busTimeList")
	public String getBusTimeList() {
		return "/academy/bus/busTime/busTimeList";
	}
}
