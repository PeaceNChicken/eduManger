package com.cafe24.eduManger.DiscountController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiscountController {

	/* @param /discountList url
	 * @return /discount/discountList.html 화면
	 * @detail 수강료 할인 정보 목록을 클릭하면 return 화면으로 이동
	 */
	@RequestMapping(value="/discountList") //@getMapping("/discountList")로 바꿔도 무관
	public String discountList() {
		
		return "/discount/discountList";
	}
}
