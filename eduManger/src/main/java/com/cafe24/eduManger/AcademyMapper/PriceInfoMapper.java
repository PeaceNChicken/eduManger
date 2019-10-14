package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.PriceInfo;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;

@Mapper
public interface PriceInfoMapper {
	
	public List<PriceInfoList> priceInfoList();

}
