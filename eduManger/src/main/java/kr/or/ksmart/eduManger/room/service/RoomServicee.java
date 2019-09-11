package kr.or.ksmart.eduManger.room.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ksmart.eduManger.room.mapper.RoomMapper;
import kr.or.ksmart.eduManger.room.vo.RoomVo;

@Service
@Transactional
public class RoomServicee {
	@Autowired RoomMapper roomMapper;
	
	public List<RoomVo> getRoomList(){
		return roomMapper.getRoomList();
	}
}
