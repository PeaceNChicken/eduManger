package kr.or.ksmart.eduManger.room.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.room.vo.RoomVo;

@Mapper
public interface RoomMapper {

	public List<RoomVo> getRoomList();
}
