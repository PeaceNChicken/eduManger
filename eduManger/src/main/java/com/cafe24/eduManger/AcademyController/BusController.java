package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.BusService;

@Controller
public class BusController {
@Autowired private BusService busService;

	@GetMapping("/busList")
	public String getBusList(Model model) {
		Map<String, Object> map = busService.getBusList();
		System.out.println(map+"<--");
		model.addAttribute("bus", map.get("bus"));
		return "/academy/bus/busList";
	}
	
	@GetMapping("/busInsert")
	public String getBusInsert() {
		return "/academy/bus/busInsert";
	}
	
	@GetMapping("/busUpdate")
	public String getBusUpdate(@RequestParam(value="bus")String bus, Model model) {
		System.out.println(bus+"<--bus");
		System.out.println(busService.getBusUpdate(bus)+"<--");
		model.addAttribute("busUpdate", busService.getBusUpdate(bus));
		return "/academy/bus/busUpdate";
	}
	
	@GetMapping("/busDelete")
	public String getBusDelete(@RequestParam(value="bus")String bus, Model model) {
		model.addAttribute("busDelete", busService.getBusDelete(bus));
		return "redirect:/busList";
	}
}
