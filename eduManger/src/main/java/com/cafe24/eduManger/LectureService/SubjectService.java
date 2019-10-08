package com.cafe24.eduManger.LectureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.LectureMapper.SubjectMapper;
import com.cafe24.eduManger.LectureVo.Subject;

@Service
public class SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	
	//과목 list
	public List<Subject> subjectList() {
		List<Subject> subjectList = subjectMapper.subjectList();
		//System.out.println(subjectList.toString() + "<--- subjectList com.cafe24.eduManger.LectureService.SubjectService.java");
		return subjectList;		
	}
	
	// 과목 insert
	public int subjectInsert(Subject subject) {
		//subjectMapper.subjectInsert(subject);
		return subjectMapper.subjectInsert(subject);
	}
	
	
	//과목 delete
	public int subjectDelete(String subcodeDel) {
		//subjectMapper.subjectDelete(subcodeDel);
		return subjectMapper.subjectDelete(subcodeDel);
	}
	
	//과목 update
	public Subject subjectUpdate(String subcodeUp) {
		//subjectMapper.subjectUpdate(subcodeUp);
		return subjectMapper.subjectUpdate(subcodeUp);
	}
}
