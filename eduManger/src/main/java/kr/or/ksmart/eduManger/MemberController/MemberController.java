package kr.or.ksmart.eduManger.MemberController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ksmart.eduManger.MemberService.MemberService;
import kr.or.ksmart.eduManger.vo.Member;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@GetMapping("/memberList")
	public String getmemberList(
			//@RequestParam (value="sk") String sk,
			//@RequestParam (value="sv") String sv,
			Model model) {
		
		List<Member> list = memberService.getMemberList();
		model.addAttribute("memberList", list);
		
		
		return "/member/memberList";
	}
	
	
}
