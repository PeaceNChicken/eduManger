package com.cafe24.eduManger.StudentService;

import java.util.List;

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

}
