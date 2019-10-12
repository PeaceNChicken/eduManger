package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.Lecture;

@Mapper
public interface LectureMapper {

	public List<Lecture> lectureList();
	
	public int LectureDelete(String lectureDel);
	
}
