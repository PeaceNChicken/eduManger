package kr.or.ksmart.eduManger.RoomController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import groovy.transform.AutoClone;
import kr.or.ksmart.eduManger.RoomService.RoomService;
import kr.or.ksmart.eduManger.RoomVo.Room;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@GetMapping("/")
	public String roomList(Model model) {
		List<Room> roomList = roomService.roomList();
		model.addAttribute("roomList", roomList);
		
		return "/index";
	}
}
