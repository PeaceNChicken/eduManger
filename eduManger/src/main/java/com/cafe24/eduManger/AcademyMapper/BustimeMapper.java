package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.Bustime;

@Mapper
public interface BustimeMapper {

	public List<Bustime> getBusTimeList();
	
	public Bustime getBustimeUpdate(String busstation);
	
	public int getBustimeDelete(String bustime);
}
