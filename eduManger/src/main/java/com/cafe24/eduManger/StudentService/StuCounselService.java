package com.cafe24.eduManger.StudentService;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.StudentMapper.StuCounselMapper;
import com.cafe24.eduManger.StudentVo.StuCounsel;

@Service
public class StuCounselService {
	
	@Autowired
	private StuCounselMapper stuCounselMapper;
	
	public List<StuCounsel> stuList(){
		return stuCounselMapper.stuList();		
	}
	
	public List<StuCounsel> stuSearch(String sk, String sv){
		return stuCounselMapper.stuSearch(sk, sv);
	}
	
	public List<StuCounsel> stuCounselList(String mId){
		return stuCounselMapper.stuCounselList(mId);
	}
	
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
	
	public StuCounsel stuCounselUpdateForm(String stuCounselCode) {		
		return stuCounselMapper.stuCounselUpdateForm(stuCounselCode);
	}
	
	public int stuCounselUpdate(StuCounsel stuCounsel) {		
		//System.out.println(stuCounsel.toString() + "<-------- stuCounsel.toString() com.cafe24.eduManger.StudentService.StuCounselService stuCounselUpdate");
		return stuCounselMapper.stuCounselUpdate(stuCounsel);
	}
	
	public int stuCounselDelete(String stuCounselCode) {
		return stuCounselMapper.stuCounselDelete(stuCounselCode);
	}

}
