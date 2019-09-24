package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {

	@GetMapping("/payList")
	public String payList() {
		
		return "academy/pay/payList";
	}
}
