package com.cafe24.eduManger.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.cafe24.eduManger.StudentMapper.StuCounselMapper;
import com.cafe24.eduManger.StudentVo.StuCounsel;

@Service
public class StuCounselService {
	
	@Autowired
	private StuCounselMapper stuCounselMapper;
	
//*******************학생리스트 출력**************
	public Map<String,Object> stuList(Model model){
		Map<String,Object> map = new HashMap<String, Object>();
		
		StuCounsel stucounsel = new StuCounsel();
		map.put("stuCounselUpdateForm", model.addAttribute("stuCounselUpdateForm", stucounsel));
		map.put("stuList", model.addAttribute("stuList", stuCounselMapper.stuList()));
		
		return map;		
	}
	
//*****************학생검색******************
	public Map<String,Object> stuSearch(String sk, String sv, Model model){
		Map<String,Object> map = new HashMap<String, Object>();
		
		StuCounsel stucounsel = new StuCounsel();
		map.put("stuCounselUpdateForm", model.addAttribute("stuCounselUpdateForm", stucounsel));
		map.put("stuList", model.addAttribute("stuList", stuCounselMapper.stuSearch(sk, sv)));
		return map;
	}
	
//*************학생상담 리스트 출력*****************
	public Map<String,Object> stuCounselList(String mId, HttpSession session, Model model){
		Map<String,Object> map = new HashMap<String, Object>();
		
		//StuCounsel vo 초기화
		StuCounsel stucounsel = new StuCounsel();
		String sessionId = "";
		
		//mId가 null이 아닐때 session영역에 mId값 대입
		if(mId != null) {
			session.setAttribute("CounselMid", mId);
		}
		
		sessionId = (String)session.getAttribute("CounselMid");
		//초기화된 StuCounsel vo 에 session영역에 저장된 mId를 대입
		stucounsel.setM_id(sessionId);
		
		String voMid = stucounsel.getM_id();
		System.out.println(sessionId + "<---- sessionId");
		System.out.println(voMid + "<----voMid");
		//상담내용 초기화
		map.put("stuCounselUpdateForm", model.addAttribute("stuCounselUpdateForm", stucounsel));
		//학생리스트
		map.put("stuList", model.addAttribute("stuList", stuCounselMapper.stuList()));
		//상담리스트
		map.put("stuCounselList", model.addAttribute("stuCounselList", stuCounselMapper.stuCounselList(sessionId)));
		
		return map;
	}
	
//************학생상담 등록******************
	public int stuCounselInsert(StuCounsel stuCounsel
							   ,HttpSession session) {
		String counselCode = "stu_counsel";
		int maxCount = stuCounselMapper.stuCounselMaxCount() + 1;
		stuCounsel.setStu_counsel_code(counselCode + maxCount);
		stuCounsel.setAc_code((String)session.getAttribute("SACODE"));
		//System.out.println(stuCounsel.toString() + "<--------- stuCounsel.toString() com.cafe24.eduManger.StudentService.StuCounselService.stuCounselInsert");
		//System.out.println(stuCounsel.getM_id() +  "<--------stuCounsel.getM_id() com.cafe24.eduManger.StudentService.StuCounselService.stuCounselInsert");
		//System.out.println(stuCounsel.getAc_code() + "<--------stuCounsel.getAc_code() com.cafe24.eduManger.StudentService.StuCounselService.stuCounselInsert");
		
		return stuCounselMapper.stuCounselInsert(stuCounsel);
	}
	
//*************학생상담수정 폼****************
	public Map<String,Object> stuCounselUpdateForm(String stuCounselCode, String mId, Model model) {		
		Map<String,Object> map = new HashMap<String, Object>();
		
		//학생리스트출력
		map.put("stuList", model.addAttribute("stuList", stuCounselMapper.stuList()));
		//상담리스트출력
		map.put("stuCounselList", model.addAttribute("stuCounselList", stuCounselMapper.stuCounselList(mId)));
		//상담내용출력
		map.put("stuCounselUpdateForm", model.addAttribute("stuCounselUpdateForm", stuCounselMapper.stuCounselUpdateForm(stuCounselCode)));	
		return map;
	}
	
//*************학생상담 수정****************
	public int stuCounselUpdate(StuCounsel stuCounsel) {		
		//System.out.println(stuCounsel.toString() + "<-------- stuCounsel.toString() com.cafe24.eduManger.StudentService.StuCounselService stuCounselUpdate");
		return stuCounselMapper.stuCounselUpdate(stuCounsel);
	}
	
//******************학생상담 삭제**************
	public int stuCounselDelete(String stuCounselCode) {
		return stuCounselMapper.stuCounselDelete(stuCounselCode);
	}

}
