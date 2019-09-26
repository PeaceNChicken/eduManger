package com.cafe24.eduManger.MemberMapper;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Mapper
public interface MemberInsertMapper {

	public int masterInsert(Member member);
	
	//자동증가 select
	public int professorMaxCount();
	
	public int professorInfoInsert(ProfesInfo profesInfo);
	
	public int studentInfoPiMaxCount();
	
	public int studentInfoInsert(Stu_pi stuPi);
		
}
