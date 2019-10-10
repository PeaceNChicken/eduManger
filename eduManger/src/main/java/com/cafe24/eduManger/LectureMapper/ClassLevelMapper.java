package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.ClassLevel;

@Mapper
public interface ClassLevelMapper {

	public List<ClassLevel> ClassLevelList();

}
