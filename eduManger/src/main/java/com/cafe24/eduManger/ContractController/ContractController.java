package com.cafe24.eduManger.ContractController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContractController {

	/* @param /contractList url
	 * @return /contract/contractList.html 화면
	 * @detail 계약 정보 목록을 클릭하면 return 화면으로 이동
	 */
	@RequestMapping(value="/contractList") //@getMapping("/contractList")로 바꿔도 무관
	public String contractList() {
		
		return "/contract/contractList";
	}
	
}
