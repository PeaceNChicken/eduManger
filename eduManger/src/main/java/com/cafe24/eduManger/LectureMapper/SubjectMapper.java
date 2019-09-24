package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.Subject;

@Mapper
public interface SubjectMapper{

	public List<Subject> subjectList();
}
