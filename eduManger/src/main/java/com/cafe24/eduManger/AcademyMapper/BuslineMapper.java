package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuslineMapper {

	public List<BuslineMapper> getBuslineList();
	
	public BuslineMapper getBuslineUpdate(String busline);
}
