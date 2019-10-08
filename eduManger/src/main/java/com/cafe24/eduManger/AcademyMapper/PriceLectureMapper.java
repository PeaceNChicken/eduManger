package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.PriceLecture;

@Mapper
public interface PriceLectureMapper {

	public List<PriceLecture> priceLectureList();
	
	public int priceLectureInsert();
	
}
