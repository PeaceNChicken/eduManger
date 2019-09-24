package com.cafe24.eduManger.ProfessorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.ProfessorService.WorkTimeService;

@Controller
public class WorkTimeController {
	
	@Autowired
	private WorkTimeService workTimeService;
	
	@GetMapping("workTimeList")
	public String workTimeList() {
		return "professor/workTime/workTimeList";
	}

}
