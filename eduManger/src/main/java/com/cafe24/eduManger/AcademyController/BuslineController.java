package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.BuslineService;

@Controller
public class BuslineController {
@Autowired private BuslineService buslineService;

	@GetMapping("/buslineList")
	public String getBuslineList(Model model) {
		Map<String, Object> map = buslineService.getBuslineList();
		System.out.println(map+"<-- map board");
		model.addAttribute("busline", map.get("busline"));
		return "/academy/bus/busLine/buslineList";
	}
	
	@GetMapping("/buslineInsert")
	public String getBuslineInsert() {
		return "/academy/bus/busLine/buslineInsert";
	}
	
	@GetMapping("/buslineUpdate")
	public String getBuslineUpdate(@RequestParam(value="busline")String busline, Model model) {
		System.out.println(busline+"<--bl");
		System.out.println(buslineService.getBuslineUpdate(busline)+"<--");
		model.addAttribute("buslineUpdate", buslineService.getBuslineUpdate(busline));
		return "/academy/bus/busLine/buslineUpdate";
	}
	
	@GetMapping("/buslineDelete")
	public String getBuslineDelete(@RequestParam(value="busline")String busline, Model model) {
		model.addAttribute("buslineDelete", buslineService.getBuslineDelete(busline));
		return "redirect:/buslineList";
	}

}
