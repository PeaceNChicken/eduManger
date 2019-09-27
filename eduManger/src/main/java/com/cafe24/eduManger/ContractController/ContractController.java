package com.cafe24.eduManger.ContractController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractController {

	/* @param  /contractList url
	 * @return /contract/contractAcademy/contractList.html 화면
	 * @detail 계약-계약목록을 누르면 계약한 내역 목록 화면으로 이동한다.
	 */
	@GetMapping("/contractList")
	public String contractList() {
		
		return "/contract/contractList";
	}
}
