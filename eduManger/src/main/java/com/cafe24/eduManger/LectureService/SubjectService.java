package com.cafe24.eduManger.LectureService;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.LectureMapper.SubjectMapper;
import com.cafe24.eduManger.LectureVo.Subject;

@Service
public class SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	
	//과목 list
	public List<Subject> subjectList(HttpSession session) {		
		String sAcode = (String) session.getAttribute("SACODE");
		List<Subject> subjectList = subjectMapper.subjectList(sAcode);
		//System.out.println(subjectList.toString() + "<--- subjectList com.cafe24.eduManger.LectureService.SubjectService.java");
		return subjectList;		
	}
	
	// 과목 insert
	public int subjectInsert(String sub_name, HttpSession session) {
		Subject subject = new Subject();
		//과목코드 자동증가
		int sMaxcol = subjectMapper.subjectCountMaxcol() + 1;		
		String sCode = "subject";
		
		
		
		//subject객체 셋팅
		subject.setAc_code((String)session.getAttribute("SACODE"));
		subject.setM_id((String)session.getAttribute("SID"));
		subject.setSub_name(sub_name);
		subject.setSub_code(sCode+sMaxcol);
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
