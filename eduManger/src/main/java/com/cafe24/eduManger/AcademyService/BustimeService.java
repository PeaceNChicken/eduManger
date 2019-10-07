package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.BustimeMapper;
import com.cafe24.eduManger.AcademyVo.Bustime;

@Service
@Transactional
public class BustimeService {
@Autowired private BustimeMapper bustimeMapper;
	public Map<String, Object> getBustime(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Bustime> bt = bustimeMapper.getBusTimeList();
		map.put("bustime", bt);
		return map;
	}
	
	public Bustime getBustimeUpdate(String busstation) {
		return bustimeMapper.getBustimeUpdate(busstation);
	}
}
