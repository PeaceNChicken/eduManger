package com.cafe24.eduManger.LectureController;

import java.sql.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.eduManger.LectureService.AcademyTimeTableService;
import com.cafe24.eduManger.LectureVo.AcademyTimeTable;

@Controller
public class AcademyTimeTableController {
	
	@Autowired
	private AcademyTimeTableService academyTimeTableService;
	
	@GetMapping("/academyTimeTable")
	public String academyTimeTable() {
		return "/lecture/academyTimeTable/academyTimeTableList";
	}
	
	@RequestMapping(value="/fullCalendar", produces = "application/json")
	public @ResponseBody List<AcademyTimeTable> academyTimeTableList() {
		Map<String,Object> map = new HashMap<String, Object>();
		//System.out.println(academyTimeTalbeService.academyTimeTableList());
		return academyTimeTableService.academyTimeTableList();
	}
	
	@PostMapping(value="/academyTimeTableInsert" , produces = "application/json")
	public String academyTimeTableInsert(AcademyTimeTable aca) {	
		System.out.println(aca.toString() + "aca.toString()");
		academyTimeTableService.academyTimeTableInsert(aca);
		return "redirect:/fullCalendar";
	}
	
	@RequestMapping(value="/dayUpdate" , produces = "application/json")
	public String dayUpdate(AcademyTimeTable aca,@RequestParam(value="id")String id) {
		//System.out.println(id);
		aca.set_id(id);
		//System.out.println(aca.toString());
		academyTimeTableService.dayUpdate(aca);
		return "redirect:/fullCalendar";
	}
	
	@PostMapping(value="/academyTimeTableUpdate" , produces = "application/json")
	public String academyTimeTableUpdate(AcademyTimeTable aca,@RequestParam(value="id")String id) {
		aca.set_id(id);
		//System.out.println(aca.toString());
		academyTimeTableService.academyTimeTableUpdate(aca);
		return "redirect:/fullCalendar";
	}
	
	@RequestMapping(value="/academyTimeTableDelete" , produces = "application/json")
	public String academyTimeTableDelete(@RequestParam(value="id")String id) {
		System.out.println(id);
		academyTimeTableService.academyTimeTableDelete(id);
		return "redirect:/fullCalendar";
	}
	
	

}
