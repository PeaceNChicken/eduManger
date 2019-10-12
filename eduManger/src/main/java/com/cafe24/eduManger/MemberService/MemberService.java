package com.cafe24.eduManger.MemberService;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.MemberMapper.MemberMapper;
import com.cafe24.eduManger.MemberVo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	//맴버 list
	public List<Member> memberList(HttpSession session){
		
		String ac_code = (String)session.getAttribute("SACODE");
		
		//System.out.println(ac_code + "<--- ac_code com.cafe24.eduManger.MemberService.MemberService.memberList");
		List<Member> memberList = memberMapper.memberList(ac_code);
		//System.out.println(memberList.toString() + "<--- com.cafe24.eduManger.MemberService.MemberService.memberList");
		
		return memberList;
	}
			
	//맴버UpdateForm
	public Member memberUpdateForm(String m_id){
		return memberMapper.memberUpdateForm(m_id);
	}
	
	//맴버update
	public int memberUpdate(Member member) {
		return memberMapper.memberUpdate(member);
	}
	
	//맴버 delete
	public int memberDelete(String m_id) {
		return memberMapper.memberDelete(m_id);
	}
	
	//맴버 Search
	public List<Member> memberSearch(String sk, String sv){	
		return memberMapper.memberSearch(sk, sv);
	}

	
	
}
