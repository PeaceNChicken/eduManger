package com.cafe24.eduManger.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.StudentMapper.StuPiMapper;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Service
public class StuPiService {

	@Autowired
	private StuPiMapper stuPiMapper;
	
	public List<Stu_pi> stuList(HttpSession session){
		String ac_code = (String)session.getAttribute("SACODE");
		//System.out.println(ac_code + "<---- ac_code");
		return stuPiMapper.stuList(ac_code);
	}
	
	public Stu_pi stuPi(String stuInfo) {		
		//System.out.println(stuPiMapper.stuPi(stuId).toString() + "<-----Stu_Pi");
		return stuPiMapper.stuPi(stuInfo);
	}
	
	public int stuPiUpdate(Stu_pi stuPi) {
		
		System.out.println(stuPi.getM_name());
		System.out.println(stuPi.getM_gender());
		System.out.println(stuPi.getM_id());
		System.out.println(stuPi.toString());
		return stuPiMapper.stuPiUpdate(stuPi);
	}
	
	public List<Stu_pi> stuPiSearch(String sk, String sv){
		return stuPiMapper.stuPiSearch(sk, sv);
	}
}
