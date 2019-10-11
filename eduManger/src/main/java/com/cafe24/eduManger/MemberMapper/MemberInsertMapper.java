package com.cafe24.eduManger.MemberMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.ContractVo.ContractAcademy;
import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Mapper
public interface MemberInsertMapper {
	
	//아이디 중복 조회
	public String idDuplicateCheck(String mId);
	
	//학원리스트
	public List<ContractAcademy> academyList();
	
	public int masterInsert(Member member);
	
	//자동증가 select
	public int professorMaxCount();
	
	public int professorInfoInsert(ProfesInfo profesInfo);
	
	public int studentInfoPiMaxCount();
	
	public int studentInfoInsert(Stu_pi stuPi);
		
}
