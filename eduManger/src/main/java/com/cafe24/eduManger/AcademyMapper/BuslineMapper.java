package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.Busline;

@Mapper
public interface BuslineMapper {

	public List<Busline> getBuslineList();
	
	public Busline getBuslineUpdate(String busline);
	
	public int getBuslineDelete(String busline);
}
