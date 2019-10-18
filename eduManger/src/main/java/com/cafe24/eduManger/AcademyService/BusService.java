package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.BusMapper;
import com.cafe24.eduManger.AcademyVo.Bus;

@Service
@Transactional
public class BusService {
	@Autowired private BusMapper busMapper;	
	public Map<String, Object> getBusList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Bus> bu = busMapper.getBusList();
		map.put("bus", bu);
		return map;
	}
	
	public Bus getBusUpdate(String bus) {
		return busMapper.getBusUpdate(bus);
	}
	
	public int getBusDelete(String bus) {
		return busMapper.getBusDelete(bus);
	}
	
	public int getBusInsert(Bus bus) {
		return busMapper.getBusInsert(bus);
	}
}
