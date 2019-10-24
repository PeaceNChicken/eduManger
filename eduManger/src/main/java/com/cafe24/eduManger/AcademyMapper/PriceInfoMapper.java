package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.PriceInfo;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.LectureVo.Subject;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Mapper
public interface PriceInfoMapper {
	
	public List<PriceInfoList> priceInfoList();

	public List<Subject> subjectList();
	
	public List<Stu_pi> stuList(String ac_code);
	
	public String lectureCode(String subCode, String classLevelCode);
	
	public int lecturePrice(String lectureCode, String priceListEtc);
	
	public List<PriceLecture> priceLectureList();
	
	public int discountCode(String discountCode);
	
	public int getPriceInfoCode();
	
	public int priceInfoInsert(PriceInfo priceInfo);
	
	public String getMemberId(String mName, String sSchool);
	
	public String getLectureCode();
	
	public String GetPriceListCode(String lectureCode, String lecturePrice, String priceListEtc);
}
