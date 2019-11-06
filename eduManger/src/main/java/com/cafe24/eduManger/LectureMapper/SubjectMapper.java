package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.Subject;

@Mapper
public interface SubjectMapper{

	//접근지정자 리턴타입 메서드명(화면에서 입력된 값);
	public List<Subject> subjectList(String sAcode);
		
	//Subject subject = 입력폼에서 받은 데이터들;
	public int subjectInsert(Subject subject);
	
	//post일경우, 객체에 담아서 전달
	
	public int subjectDelete(String subcodeDel);
	
	
	public Subject subjectUpdate(String subcodeUp);
	
	public int subjectCountMaxcol();

}
