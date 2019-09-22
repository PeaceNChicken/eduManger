package com.cafe24.eduManger.PriceInfoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PriceInfoController {

	/* @param /priceInfoList url
	 * @return /priceInfo/priceInfoList.html 화면
	 * @detail 학원비 납부 안내 정보 목록을 클릭하면 return 화면으로 이동
	 */
	@RequestMapping(value="/priceInfoList") //@getMapping("/priceInfoList")로 바꿔도 무관
	public String priceInfoList() {
		
		return "/priceInfo/priceInfoList";
	}
}
