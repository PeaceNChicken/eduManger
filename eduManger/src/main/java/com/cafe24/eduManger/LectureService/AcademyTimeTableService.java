package com.cafe24.eduManger.LectureService;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.LectureMapper.AcademyTimeTableMapper;
import com.cafe24.eduManger.LectureVo.AcademyTimeTable;
import com.cafe24.eduManger.LectureVo.Subject;
import com.cafe24.eduManger.MemberVo.Member;

@Service
public class AcademyTimeTableService {

	@Autowired
	private AcademyTimeTableMapper academyTimeTableMapper;
	
	public List<Member> adminList(HttpSession session){
		String acCode = (String)session.getAttribute("SACODE");
		//System.out.println(academyTimeTableMapper.adminList(acCode) + "<---academyTimeTableMapper.adminList(acCode) com.cafe24.eduManger.LectureService.AcademyTimeTableService.adminList");
		return academyTimeTableMapper.adminList(acCode);
	}
	
	public List<Subject> subjectList(){
		return academyTimeTableMapper.subjectList();
	}
	
	public List<AcademyTimeTable> academyTimeTableList(String acCode){		
		return academyTimeTableMapper.academyTimeTableList(acCode);
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
