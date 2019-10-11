package com.cafe24.eduManger.LectureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.LectureMapper.LectureMapper;
import com.cafe24.eduManger.LectureVo.Lecture;

@Service
public class LectureService {
	
	@Autowired
	private LectureMapper lectureMapper;
	
	//강의 리스트
	public List<Lecture> lectureList() {
		List<Lecture> lectureList = lectureMapper.lectureList();
		//System.out.println(lectureList + " <--com.cafe24.eduManger.LectureService.lectureList()");
		return lectureList;
	}
	
	
	//강의 삭제
	public int lectureDelete(String lectureDel) {
		//lectureMapper.LectureDelete(lectureDel);
		//System.out.println(lectureDel + " <--com.cafe24.eduManger.LectureService.lectureDelete()");
		return lectureMapper.LectureDelete(lectureDel);
	}
	
}
