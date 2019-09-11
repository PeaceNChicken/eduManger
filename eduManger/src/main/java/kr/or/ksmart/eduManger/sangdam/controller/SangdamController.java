package kr.or.ksmart.eduManger.sangdam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.eduManger.sangdam.service.SangdamService;
import kr.or.ksmart.eduManger.sangdam.vo.Sangdam;

@Controller
public class SangdamController {
	@Autowired SangdamService sangdamService;
	
	@GetMapping("/sangdam")
	public String sangdamSelect(Map map) {
		
		/*
		 * List<Sangdam> list = sangdamService.getSangdamList(); Map<String, Object>
		 * sMap = new HashMap<String, Object>(); 
		 * sMap.put("list", list);
		 */
		  
		 
		return "/sangdam/sangdam.html";
	}
}
