package kr.or.ksmart.eduManger.RoomService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.eduManger.RoomMapper.RoomMapper;
import kr.or.ksmart.eduManger.RoomVo.Room;

@Service
public class RoomService {

	@Autowired
	private RoomMapper roomMapper;
	
	public List<Room> roomList(){
		return roomMapper.roomList();
	}
}
