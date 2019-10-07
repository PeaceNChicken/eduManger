package com.cafe24.eduManger.LectureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.LectureMapper.AcademyTimeTableMapper;
import com.cafe24.eduManger.LectureVo.AcademyTimeTable;

@Service
public class AcademyTimeTableService {

	@Autowired
	private AcademyTimeTableMapper academyTimeTableMapper;
	
	public List<AcademyTimeTable> academyTimeTableList(){
		return academyTimeTableMapper.academyTimeTableList();
	}
	
	public int academyTimeTableInsert(AcademyTimeTable aca) {
		String acTimeCode = "ac_timeTable_code";
		int count = academyTimeTableMapper.academyTimeTableMaxCount();		
		aca.set_id(acTimeCode + (count + 1));				
		return academyTimeTableMapper.academyTimeTableInsert(aca);
	}
	
	public int dayUpdate(AcademyTimeTable aca) {		
		return academyTimeTableMapper.dayUpdate(aca);
	}
	
	public int academyTimeTableUpdate(AcademyTimeTable aca) {		
		return academyTimeTableMapper.academyTimeTableUpdate(aca);
	}
	
	public int academyTimeTableDelete(String id) {
		return academyTimeTableMapper.academyTimeTableDelete(id);
	}
	
}
