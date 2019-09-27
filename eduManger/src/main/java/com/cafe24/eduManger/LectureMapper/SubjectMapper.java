package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.Subject;

@Mapper
public interface SubjectMapper{

	//접근지정자 리턴타입 메서드명();
	public List<Subject> subjectList();
	
}
