package kr.or.ksmart.eduManger.sangdamController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.eduManger.sangdamService.SangdamService;
import kr.or.ksmart.eduManger.sangdamVo.Sangdam;

@Controller
public class SangdamController {
	@Autowired SangdamService sangdamService;
	
	@GetMapping("/sangdam")
	public String sangdamSelect(Map<String, Object> map) {
		/*
		 * Map<String, Object> sMap = new HashMap<String, Object>();
		 * 
		 * List<Sangdam> list = sangdamService.getSangdamList();
		 * System.out.println(list);
		 */
		 
		 		  		 
		return "/sangdam/sangdam.html";
	}
}
