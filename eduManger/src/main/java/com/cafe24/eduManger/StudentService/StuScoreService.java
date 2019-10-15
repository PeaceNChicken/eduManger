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
	
	//리스트
	public List<StuScore> StuScoreList() {
		List<StuScore> StuScoreList = StuScoreMapper.StuScoreList();
		System.out.println(StuScoreList + " <-- StuScoreList() com.cafe24.eduManger.StudentService.StuScoreService");
		return StuScoreList; 
	}
	
	//추가
	public int StuScoreInsert(StuScore stuScore) {
		//StuScoreMapper.stuScoreInsert();
		System.out.println(StuScoreMapper.toString() + " <--StuScoreMapper.toString() com.cafe24.eduManger.StudentService");
		return StuScoreMapper.stuScoreInsert(stuScore);	
	}
	
	//리스트삭제
	public int StuScoreDelete(String stuScoreDel) {
		//StuScoreMapper.stuScoreDelete(stuScoreDel);
		System.out.println(stuScoreDel + " <--StuScoreDelete() com.cafe24.eduManger.StudentService.StuScoreService");
		return StuScoreMapper.stuScoreDelete(stuScoreDel);
	}
 	
	
}
