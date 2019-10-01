package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuslineController {

	@GetMapping("/buslineList")
	public String getBuslineList() {
		return "/academy/bus/busLine/buslineList";
	}
	
	@GetMapping("/buslineInsert")
	public String getBuslineInsert() {
		return "/academy/bus/busLine/buslineInsert";
	}
	
	@GetMapping("/buslineUpdate")
	public String getBuslineUpdate() {
		return "/academy/bus/busLine/buslineUpdate";
	}
}
