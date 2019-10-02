package com.cafe24.eduManger.MainController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.MainService.MainService;
import com.cafe24.eduManger.MemberVo.Member;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String Main() {
		return "/index";
	}
	
	@GetMapping("/login")
	public String login() {		
		return "/login/login";
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, Member member,Model model) {
		Map<String,Object> loginCk = mainService.login(member,session);		
		String result = (String)loginCk.get("result");
					
		if(result.equals("notId") || result.equals("notPw")) {
			model.addAttribute("result", "아이디 혹은 비밀번호가 불일치합니다");
			return "/login/login";
		}			
		
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	/*
	 * @GetMapping("/") public String MainList(Model model) { Map<String, Object>
	 * map = mainService.subjectList();
	 * 
	 * //두산 bookList model에 넣기 model.addAttribute("bookList", map.get("bookList"));
	 * 
	 * //서율 memberList model에 넣기 model.addAttribute("memberList",
	 * map.get("memberList"));
	 * 
	 * //광준 sangdamList model에 넣기 model.addAttribute("sangdamList",
	 * map.get("sangdamList"));
	 * 
	 * //병윤 roomList model에 넣기 model.addAttribute("roomList", map.get("roomList"));
	 * 
	 * return "/index"; }
	 */
}
