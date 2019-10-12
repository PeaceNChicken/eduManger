package com.cafe24.eduManger.LectureMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.LectureVo.AcademyTimeTable;
import com.cafe24.eduManger.LectureVo.Subject;
import com.cafe24.eduManger.MemberVo.Member;

@Mapper
public interface AcademyTimeTableMapper {
	
	public List<Member> adminList(String acCode);
	
	public List<Subject> subjectList();
	
	public List<AcademyTimeTable> academyTimeTableList(String acCode);
	
	public int academyTimeTableMaxCount();
	
	public int academyTimeTableInsert(AcademyTimeTable aca);
	
	public int dayUpdate(AcademyTimeTable aca);
	
	public int academyTimeTableUpdate(AcademyTimeTable aca);
	
	public int academyTimeTableDelete(String id);
}
