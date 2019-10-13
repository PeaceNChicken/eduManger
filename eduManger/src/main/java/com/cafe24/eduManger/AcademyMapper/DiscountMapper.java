package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.Discount;

@Mapper
public interface DiscountMapper {

	public List<Discount> discountList();
	
	public int discountMaxCount();
	
	public int discountInsert(Discount discount);
	
	
}
