package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomsController {
	
	@GetMapping("rooms")
	public String roomList() {
		return "/lecture/rooms/roomsList";
	}

}
