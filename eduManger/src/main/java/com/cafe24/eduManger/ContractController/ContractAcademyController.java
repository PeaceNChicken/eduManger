package com.cafe24.eduManger.ContractController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractAcademyController {

	/* @param  /contractAcademyList url
	 * @return /contract/contractAcademy/contractAcademyList.html 화면
	 * @detail 계약-계약지점목록을 누르면 계약 지점 목록 화면으로 이동한다.
	 */
	@GetMapping("/contractAcademyList")
	public String contractAcademyList() {
		
		return "/contract/contractAcademy/contractAcademyList";
	}
}
