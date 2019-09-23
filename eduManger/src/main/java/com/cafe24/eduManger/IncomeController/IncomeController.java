package com.cafe24.eduManger.IncomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IncomeController {

	/* @param /incomeList url
	 * @return /income/incomeList.html 화면
	 * @detail 수납 내역 목록을 클릭하면 return 화면으로 이동
	 */
	@RequestMapping(value="/incomeList") //@getMapping("/incomeList")로 바꿔도 무관
	public String incomeList() {
		
		return "/income/incomeList";
	}
}
