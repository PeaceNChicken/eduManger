package com.cafe24.eduManger.StudentMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.StudentVo.StuCounsel;

@Mapper
public interface StuCounselMapper {

	public List<StuCounsel> stuList(); 
	
	public List<StuCounsel> stuSearch(String sk, String sv);
	
	public List<StuCounsel> stuCounselList(String mId);

}
