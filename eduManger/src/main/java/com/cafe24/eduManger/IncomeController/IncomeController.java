package com.cafe24.eduManger.IncomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncomeController {

	@GetMapping("/incomeList")
	public String getIncomeList() {
		
		return "/income/incomeList";
	}
}
