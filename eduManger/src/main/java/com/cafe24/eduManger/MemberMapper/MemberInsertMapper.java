package com.cafe24.eduManger.MemberMapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;

@Mapper
public interface MemberInsertMapper {

	public int masterInsert(Member member);
	
	public int professorInsert(ProfesInfo profesInfo);
	
	public int professorInfoInsert(ProfesInfo profesInfo);
	
	//자동증가 select
	public int professorMaxCount();
	
	public int studentInsert(Member member);
}
