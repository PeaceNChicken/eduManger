package com.cafe24.eduManger.LectureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.LectureMapper.ClassLevelMapper;
import com.cafe24.eduManger.LectureVo.ClassLevel;

@Service
public class ClassLevelService {

	@Autowired
	private ClassLevelMapper classLevelMapper;
	
	//리스트
	public List<ClassLevel> ClassLevelList() {
		List<ClassLevel> ClassLevelList = classLevelMapper.ClassLevelList();
		//System.out.println(ClassLevelList + " <-- com.cafe24.eduManger.LectureService.ClassLevelService.ClassLevelList()");
		return ClassLevelList;
	}
	
	//삭제
	public int classLevelDelete(String classLevelDel) {
		//classLevelMapper.ClassLevelDel(classLevelDel);
		return classLevelMapper.classLevelDel(classLevelDel);
	}
	
	
	//입력
	public int classLevelInsert(ClassLevel classLevel) {
		//classLevelMapper.classLevelInsert(classLevel);
		return classLevelMapper.classLevelInsert(classLevel);
	}
}
