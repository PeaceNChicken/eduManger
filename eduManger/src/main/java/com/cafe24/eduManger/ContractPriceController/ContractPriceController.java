package com.cafe24.eduManger.ContractPriceController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContractPriceController {

	/* @param /contractPriceList url
	 * @return /contractPrice/contractPriceList.html 화면
	 * @detail 계약 단가 정보 목록을 클릭하면 return 화면으로 이동
	 */ 
	@RequestMapping(value="/contractPriceList") //@getMapping("/contractPriceList")로 바꿔도 무관
	public String contractPriceList() {
		
		return "/contractPrice/contractPriceList";
	}
}
