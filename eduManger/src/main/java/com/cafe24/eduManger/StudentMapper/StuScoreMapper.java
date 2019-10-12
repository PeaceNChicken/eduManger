package com.cafe24.eduManger.StudentMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.StudentVo.StuScore;

@Mapper
public interface StuScoreMapper {

	public List<StuScore> StuScoreList();
	
}
