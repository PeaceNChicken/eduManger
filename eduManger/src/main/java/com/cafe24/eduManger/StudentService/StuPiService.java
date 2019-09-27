package com.cafe24.eduManger.StudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.StudentMapper.StuPiMapper;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Service
public class StuPiService {

	@Autowired
	private StuPiMapper stuPiMapper;
	
	public List<Stu_pi> stuList(){
		return stuPiMapper.stuList();
	}
	
	public Stu_pi stuPi(String stuId) {		
		//System.out.println(stuPiMapper.stuPi(stuId).toString() + "<-----Stu_Pi");
		return stuPiMapper.stuPi(stuId);
	}
	
	public int stuPiUpdate(Stu_pi stuPi) {
		
		System.out.println(stuPi.getM_name());
		System.out.println(stuPi.getM_gender());
		System.out.println(stuPi.getM_id());
		System.out.println(stuPi.toString());
		return stuPiMapper.stuPiUpdate(stuPi);
	}
}
