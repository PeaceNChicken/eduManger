package com.cafe24.eduManger.MemberMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;

@Mapper
public interface MemberMapper {
	
	public List<Member> memberList();
	
	public int memberInsert(Member member);
}
