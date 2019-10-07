package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.BuslineMapper;
import com.cafe24.eduManger.AcademyVo.Busline;

@Service
@Transactional
public class BuslineService {
@Autowired private BuslineMapper buslineMapper;
	public Map<String, Object> getBuslineList(){
		Map<String, Object> map = new HashMap<String, Object>(); 
		List<Busline> bl = buslineMapper.getBuslineList();
		map.put("busline", bl);
		return map;
	}
	
	public Busline getBuslineUpdate(String busline) {
		return buslineMapper.getBuslineUpdate(busline);
	}
}
