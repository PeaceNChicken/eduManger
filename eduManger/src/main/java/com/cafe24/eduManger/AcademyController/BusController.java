package com.cafe24.eduManger.AcademyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusController {

	@GetMapping("/busList")
	public String getBusList() {
		return "/academy/bus/busList";
	}
	
	@GetMapping("/busInsert")
	public String getBusInsert() {
		return "/academy/bus/busInsert";
	}
	
	@GetMapping("/busUpdate")
	public String getBusUpdate() {
		return "/academy/bus/busUpdate";
	}
}
