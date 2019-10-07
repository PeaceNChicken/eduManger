package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.AcademyTimeTable;

@Mapper
public interface AcademyTimeTableMapper {

	public List<AcademyTimeTable> academyTimeTableList();
	
	public int academyTimeTableMaxCount();
	
	public int academyTimeTableInsert(AcademyTimeTable aca);
	
	public int dayUpdate(AcademyTimeTable aca);
	
	public int academyTimeTableUpdate(AcademyTimeTable aca);
	
	public int academyTimeTableDelete(String id);
}
