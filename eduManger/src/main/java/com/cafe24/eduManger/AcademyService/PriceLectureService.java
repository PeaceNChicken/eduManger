package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.PriceLectureMapper;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.LectureVo.ClassLevel;
import com.cafe24.eduManger.LectureVo.Subject;

import groovy.transform.builder.InitializerStrategy.SET;

@Service
@Transactional
public class PriceLectureService {

	@Autowired private PriceLectureMapper priceLectureMapper;
	
	public Map<String, Object> priceLectureList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<PriceLecture> plist = priceLectureMapper.priceLectureList();
		System.out.println(plist +"<- list PriceLectureService");
		map.put("list", plist);
		return map;
	}
	public List<Subject> subjectList(){
		return priceLectureMapper.subjectList();
	}
	
	public List<ClassLevel> classLevelList(){
		return priceLectureMapper.classLevelList();
	}
	
	
	public int priceLectureInsert(String sub_code, String class_level_code, PriceLecture priceLecture, HttpSession session) {
		//Map<String, Object> map = new HashMap<String, Object>();
		//수강료코드 자동증가
		int count = priceLectureMapper.priceLectureMaxCount() + 1;
		String priceList = "priceList";
		priceLecture.setPrice_list_code(priceList + count);
		//학원코드
		priceLecture.setAc_code((String)session.getAttribute("SACODE"));
		//등록자 아이디
		priceLecture.setMember_id((String)session.getAttribute("SID"));
		System.out.println(priceLecture.toString() + "<- priceLecture priceLectureService");
		//강의코드
		String lectCode = priceLectureMapper.getLectureCode(sub_code, class_level_code);
		priceLecture.setLecture_code(lectCode);
		return priceLectureMapper.priceLectureInsert(priceLecture);
	}
}
