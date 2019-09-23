package com.cafe24.eduManger.BusController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusController {

	@GetMapping("/busList")
	public String getBusList() {
		
		return "/bus/busList";
	}
	@GetMapping("/busInsert")
	public String getbusInsert() {
		
		return "/bus/busInsert";
	}
}
