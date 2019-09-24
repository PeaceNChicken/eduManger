package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncomeController {

	@GetMapping("/incomeList")
	public String incomeList() {
		
		return "/academy/income/incomeList";
	}
}
