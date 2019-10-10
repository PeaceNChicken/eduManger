package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.BustimeService;

@Controller
public class BustimeController {
@Autowired private BustimeService bustimeService;
	
	@GetMapping("/bustimeList")
	public String getBusTimeList(Model model) {
		Map<String, Object> map = bustimeService.getBustime();
		System.out.println(map+"<--map bustime");
		model.addAttribute("bustime", map.get("bustime"));
		return "/academy/bus/busTime/bustimeList";
	}
	
	@GetMapping("/bustimeInsert")
	public String getBusTimeInsert() {
		return "/academy/bus/busTime/bustimeInsert";
	}
	
	@GetMapping("/bustimeUpdate")
	public String getBustimeUpdate(@RequestParam(value="busstation")String busstation, Model model) {
		System.out.println(busstation+"<--");
		System.out.println(bustimeService.getBustimeUpdate(busstation));
		model.addAttribute("busT", bustimeService.getBustimeUpdate(busstation));
		return "/academy/bus/busTime/bustimeUpdate";
	}
	
	@GetMapping("/bustimeDelete")
	public String getBustimeDelete(@RequestParam(value="bustime")String bustime, Model model) {
		model.addAttribute("bustimeDelete", bustimeService.getBustimeDelete(bustime));
		return "redirect:/bustimeList";
	}
}
