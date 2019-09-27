package com.cafe24.eduManger.StudentMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Mapper
public interface StuPiMapper {
	
	public List<Stu_pi> stuList();
	
	public Stu_pi stuPi(String stuId);
	
	public int stuPiUpdate(Stu_pi stuPi);
}
