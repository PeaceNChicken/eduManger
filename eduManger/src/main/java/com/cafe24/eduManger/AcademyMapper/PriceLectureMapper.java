package com.cafe24.eduManger.AcademyMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.AcademyVo.PriceLectureList;
import com.cafe24.eduManger.LectureVo.ClassLevel;
import com.cafe24.eduManger.LectureVo.Subject;

@Mapper
public interface PriceLectureMapper {
	public List<PriceLectureList> priceLectureList();
	
	public List<ClassLevel> classLevelList();
	
	public List<Subject> subjectList();
	
	public int priceLectureMaxCount();
	
	public String getLectureCode(String sub_code, String class_level_code);
		
	public int priceLectureInsert(PriceLecture priceLecture);
	
	public PriceLecture priceLectureUpdateById(String price_list_code); 
	
}
