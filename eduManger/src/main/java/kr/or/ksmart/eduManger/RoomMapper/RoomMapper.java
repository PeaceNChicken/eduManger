package kr.or.ksmart.eduManger.RoomMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.RoomVo.Room;

@Mapper
public interface RoomMapper {

	public List<Room> roomList();
}
