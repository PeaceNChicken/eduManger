package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.Lecture;

@Mapper
public interface LectureMapper {

	public List<Lecture> lectureList();
	
	public int LectureDelete(String lectureDel);
	
	public int LectureInsert(Lecture lecture);
	
	
	//insert처리 select속성들
	public List<Lecture> lecInsertList();
	
	public String lecMidInsertList(Lecture lecture);
}
