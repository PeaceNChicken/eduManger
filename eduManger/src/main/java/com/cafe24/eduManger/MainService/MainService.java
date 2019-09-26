package com.cafe24.eduManger.MainService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.MainMapper.MainMapper;
import com.cafe24.eduManger.MemberVo.Member;

@Service
public class MainService {
	@Autowired
	private MainMapper mainMapper;
	
	public Map<String,Object> login(HttpSession session, Member member) {
		
		Member memberList = mainMapper.login(member);
		//System.out.println(memberList + "<----- memberList com.cafe24.eduManger.MemberService login");
		Map<String, Object> map = new HashMap<String, Object>();
		String result = "";
		
		if(memberList != null) {
			//System.out.println("아이디 일치");
			if(memberList.getM_pw().equals(member.getM_pw())) {
				//System.out.println("로그인성공");
				session.setAttribute("SID", memberList.getM_id());
				session.setAttribute("SLEVEL", memberList.getM_level());
				session.setAttribute("SNAME", memberList.getM_name());
				session.setAttribute("SACODE", memberList.getAc_code());
				map.put("connect", memberList);
			}
			else{
				//System.out.println("비밀번호 불일치");
				result = "notPw";
			}
		}
		else{
			//System.out.println("아이디 불일치");
			result = "notId";
			
		}
		map.put("result", result);
		return map;
	}
	
	
	//return타입 Map
	/*
	 * public Map<String, Object> subjectList(){ //맵 인스턴스 생성 Map<String,Object> map
	 * = new HashMap<String, Object>(); //두산 DB에서 가져온 List 확인 List<Books> bookList =
	 * mainMapper.bookList(); System.out.println(bookList.toString() +
	 * "<---- bookList"); //두산 book리스트 Map에 넣기 map.put("bookList", bookList);
	 * 
	 * //서율 DB에서 가져온 List 확인 List<Member> memberList = mainMapper.memberList();
	 * System.out.println(memberList.toString() + "<---- memberList"); //서율 DB리스트
	 * Map에 put map.put("memberList", memberList);
	 * 
	 * //광준 DB에서 가져온 List 확인 List<Sangdam> sangdamList = mainMapper.sangdamList();
	 * System.out.println(sangdamList.toString() + "<---- sangdamList"); //광준
	 * DBsangdam리스트 Map에 put map.put("sangdamList", sangdamList);
	 * 
	 * //병윤 DB에서 가져온 List 확인 List<Room> roomList = mainMapper.roomList();
	 * System.out.println(roomList.toString() + "<--- roomList"); //병윤 DB강의실 리스트
	 * Map에 put map.put("roomList", roomList);
	 * 
	 * return map; }
	 */
	
	

}
