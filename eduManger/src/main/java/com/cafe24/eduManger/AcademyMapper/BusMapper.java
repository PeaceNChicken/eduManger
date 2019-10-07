package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.Bus;

@Mapper
public interface BusMapper {

	public List<Bus> getBusList();
	
	public Bus getBusUpdate(String bus);
}
