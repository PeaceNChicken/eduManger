package com.cafe24.eduManger.StudentMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.StudentVo.StuCounsel;

@Mapper
public interface StuCounselMapper {

	public List<StuCounsel> stuList(); 
	
	public List<StuCounsel> stuSearch(String sk, String sv);
	
	public List<StuCounsel> stuCounselList(String mId);
	
	public int stuCounselMaxCount();
	
	public int stuCounselInsert(StuCounsel stuCounsel);
	
	public StuCounsel stuCounselUpdateForm(String stuCounselCode);
		
	public int stuCounselUpdate(StuCounsel stuCounsel);
	
	public int stuCounselDelete(String stuCounselCode);

}
