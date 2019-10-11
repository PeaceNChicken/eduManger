package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.AcademyService.ReplyService;

@Controller
public class ReplyController {
@Autowired private ReplyService replyService;
	
	@GetMapping("/replyList")
	public String getReply(Model model) {
		Map<String, Object> map = replyService.getReply();
		System.out.println(map+"<--map");
		model.addAttribute("reply", map.get("reply"));
		return "/academy/board/reply/replyList";
	}
}
