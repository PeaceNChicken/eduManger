//package com.cafe24.eduManger.MemberService;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cafe24.eduManger.MemberMapper.MemberMapper;
//import com.cafe24.eduManger.memberVo.Member;
//
//@Service
//public class MemberService {
//
//	@Autowired
//	private MemberMapper memberMapper;
//	
//	public Map<String, Object> subjectList(){
//		
//	Map<String, Object> map = new HashMap<String, Object>();
//	
//	List<Member> memberList = memberMapper.memberList();
//	System.out.println(memberList.toString() + "<-- memberList");
//	map.put("memberList", memberList);
//	
//	return map;
//	}
//
//}
