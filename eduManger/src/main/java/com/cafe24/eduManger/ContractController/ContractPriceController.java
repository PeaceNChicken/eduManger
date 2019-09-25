package com.cafe24.eduManger.ContractController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContractPriceController {

	/* @param  /contractAcademyList url
	 * @return /contract/contractAcademy/contractAcademyList.html 화면
	 * @detail 계약-계약단가표을 누르면 계약 단가 목록 화면으로 이동한다.
	 */
	@GetMapping("/contractPriceList")
	public String contractPriceList() {
		
		return "/contract/contractPrice/contractPriceList";
	}
	
	@GetMapping("/contractPriceInsert")
	public String contractPriceInsert() {
		
		return "/contract/contractPrice/contractPriceInsert";
	}
	
	@PostMapping("/contractPriceInsert")
	public String contractPriceInsert(Model model) {
		
		return "redirect:/contractPriceList";
	}
}
