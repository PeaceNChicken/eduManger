package com.cafe24.eduManger.MemberMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;

@Mapper
public interface MemberMapper {
	
	public int AllListCount();
	
	public int SearchListCount();
	
	public List<Member> memberList(Map<String, Object> rowMap);
			
	public Member memberUpdateForm(String m_id);
	
	public int memberUpdate(Member member);
	
	public int memberDelete(String m_id);
	
	public List<Member> memberSearch(Map<String,Object> rowMap);
}
