package com.cafe24.eduManger.LectureController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {
	
	@GetMapping("room")
	public String roomList() {
		return "/lecture/room/roomList";
	}

}
