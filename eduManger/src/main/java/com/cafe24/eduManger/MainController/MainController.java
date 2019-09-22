package com.cafe24.eduManger.MainController;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.MainService.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String MainList(Model model) {
		Map<String, Object> map = mainService.subjectList();
		
		//두산 bookList model에 넣기
		model.addAttribute("bookList", map.get("bookList"));
		
		//서율 memberList model에 넣기
		model.addAttribute("memberList", map.get("memberList"));
		
		//광준 sangdamList model에 넣기
		model.addAttribute("sangdamList", map.get("sangdamList"));
		
		//병윤 roomList model에 넣기
		model.addAttribute("roomList", map.get("roomList"));
		
		return "/index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login/login";
	}

}
