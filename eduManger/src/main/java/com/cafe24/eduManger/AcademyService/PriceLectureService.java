package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.PriceLectureMapper;
import com.cafe24.eduManger.AcademyVo.PriceLecture;

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
	
	public int priceLectureInsert() {
		return 0;
	}
}
