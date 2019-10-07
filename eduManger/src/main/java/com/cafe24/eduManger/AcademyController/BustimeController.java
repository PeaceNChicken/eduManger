package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BustimeController {

	@GetMapping("/bustimeList")
	public String getBusTimeList() {
		return "/academy/bus/busTime/bustimeList";
	}
	
	@GetMapping("/bustimeInsert")
	public String getBusTimeInsert() {
		return "/academy/bus/busTime/bustimeInsert";
	}
	
	@GetMapping("/bustimeUpdate")
	public String getBustimeUpdate() {
		return "/academy/bus/busTime/bustimeUpdate";
	}
}
