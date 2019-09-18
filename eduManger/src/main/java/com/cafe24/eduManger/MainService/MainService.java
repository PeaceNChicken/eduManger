package com.cafe24.eduManger.MainService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.BooksVo.Books;
import com.cafe24.eduManger.MainMapper.MainMapper;
import com.cafe24.eduManger.RoomVo.Room;
import com.cafe24.eduManger.memberVo.Member;
import com.cafe24.eduManger.sangdamVo.Sangdam;

@Service
public class MainService {
	@Autowired
	private MainMapper mainMapper;
	//return타입 Map
	public Map<String, Object> subjectList(){
		//맵 인스턴스 생성
		Map<String,Object> map = new HashMap<String, Object>();
		//두산 DB에서 가져온 List 확인
		List<Books> bookList = mainMapper.bookList();
		System.out.println(bookList.toString() + "<---- bookList");	
		//두산 book리스트 Map에 넣기
		map.put("bookList", bookList);
		
		//서율 DB에서 가져온 List 확인
		List<Member> memberList = mainMapper.memberList();
		System.out.println(memberList.toString() + "<---- memberList");	
		//서율 DB리스트 Map에 put
		map.put("memberList", memberList);
		
		//광준 DB에서 가져온 List 확인
		List<Sangdam> sangdamList = mainMapper.sangdamList();
		System.out.println(sangdamList.toString() + "<---- sangdamList");
		//광준 DBsangdam리스트 Map에 put
		map.put("sangdamList", sangdamList);
		
		//병윤 DB에서 가져온 List 확인
		List<Room> roomList = mainMapper.roomList();
		System.out.println(roomList.toString() + "<--- roomList");
		//병윤 DB강의실 리스트 Map에 put
		map.put("roomList", roomList);
			
		return map;
	}

}
