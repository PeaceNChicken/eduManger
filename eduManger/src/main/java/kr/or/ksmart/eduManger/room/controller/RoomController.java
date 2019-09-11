package kr.or.ksmart.eduManger.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.eduManger.room.service.RoomServicee;
import kr.or.ksmart.eduManger.room.vo.RoomVo;

@Controller
public class RoomController {
	@Autowired RoomServicee roomService;

	@GetMapping("/room")
	public String room() {
		List<RoomVo> list = roomService.getRoomList();
		System.out.println(list);
		return "/room/room.html";
	}

}