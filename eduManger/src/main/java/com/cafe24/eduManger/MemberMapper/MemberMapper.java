package com.cafe24.eduManger.MemberMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;

@Mapper
public interface MemberMapper {
	
	public List<Member> memberList();
			
	public Member memberUpdateForm(String m_id);
	
	public int memberUpdate(Member member);
	
	public int memberDelete(String m_id);
	
	public List<Member> memberSearch(String sk, String sv);
}
