package com.cafe24.eduManger.RoomController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomController {

	/* @param /roomList url
	 * @return /room/roomList.html 화면
	 * @detail 강의실 위치 정보 목록을 클릭하면 return 화면으로 이동
	 */
	@RequestMapping(value="/roomList") //@getMapping("/roomList")로 바꿔도 무관
	public String roomList() {
		
		return "/room/roomList";
	}
}
