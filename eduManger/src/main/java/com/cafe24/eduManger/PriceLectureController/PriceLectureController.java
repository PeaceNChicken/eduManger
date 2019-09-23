package com.cafe24.eduManger.PriceLectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PriceLectureController {
	
	/* @param /priceLectureList url
	 * @return /priceLecture/priceLectureList.html 화면
	 * @detail 강의별 수강료 정보 목록을 클릭하면 return 화면으로 이동
	 */
	@RequestMapping(value="/priceLectureList") //@getMapping("/priceLectureList")로 바꿔도 무관
	public String priceLectureList() {
		
		return "/priceLecture/priceLectureList";
	}
}
