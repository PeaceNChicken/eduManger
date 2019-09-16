package kr.or.ksmart.eduManger.MainMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.BooksVo.Books;
import kr.or.ksmart.eduManger.RoomVo.Room;
import kr.or.ksmart.eduManger.memberVo.Member;
import kr.or.ksmart.eduManger.sangdamVo.Sangdam;

@Mapper
public interface MainMapper {

	//두산 교재리스트 DB연결
	public List<Books> bookList();
	
	//서율 맴버리스트 DB연결
	public List<Member> memberList();
	
	//광준 맴버리스트 DB연결
	public List<Sangdam> sangdamList();
	
	//병윤 강의실리스트 DB연결
	public List<Room> roomList();
}
