package kr.or.ksmart.eduManger.RoomController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import groovy.transform.AutoClone;
import kr.or.ksmart.eduManger.RoomService.RoomService;
import kr.or.ksmart.eduManger.RoomVo.Room;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	public String roomList() {
		//List<Room> roomList = roomService.roomList();
		
		return "/index";
	}
}
