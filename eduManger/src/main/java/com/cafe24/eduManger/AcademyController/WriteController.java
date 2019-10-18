package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.AcademyService.WriteService;

@Controller
public class WriteController {
@Autowired private WriteService writeService;
	
	@GetMapping("/writeInsert")
	public String getWrite(Model model) {
		Map<String, Object> map = writeService.getWrite();
		System.out.println(map+"<--map");
		model.addAttribute("writeInsert", map.get("write"));
		return "/academy/board/writeInsert";
	}
}
