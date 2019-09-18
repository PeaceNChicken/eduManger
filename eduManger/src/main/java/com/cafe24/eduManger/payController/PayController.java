package com.cafe24.eduManger.payController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {

	@GetMapping("/payList")
	public String getPayList() {
		
		return "/pay/payList";
	}
}
