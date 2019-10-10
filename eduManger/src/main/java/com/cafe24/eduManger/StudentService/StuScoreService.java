package com.cafe24.eduManger.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cafe24.eduManger.StudentMapper.StuScoreMapper;
import com.cafe24.eduManger.StudentVo.StuScore;

@Service
public class StuScoreService {
	
	@Autowired
	private StuScoreMapper StuScoreMapper;
	
	public List<StuScore> StuScoreList() {
		List<StuScore> StuScoreList = StuScoreMapper.StuScoreList();
		System.out.println(StuScoreList + " <--com.cafe24.eduManger.StudentService.StuScoreService.StuScoreList()");
		return StuScoreList; 
	}
	
}
