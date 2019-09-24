package com.cafe24.eduManger.ContractController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {

	@GetMapping("/contractList")
	public String contractList() {
		
		return "/contract/contractList";
	}
}
