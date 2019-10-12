package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.DiscountMapper;
import com.cafe24.eduManger.AcademyVo.Discount;

@Service
@Transactional
public class DiscountService {

	@Autowired private DiscountMapper discountMapper;
	
	public Map<String, Object> discountList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Discount> list = discountMapper.discountList();
		System.out.println(discountMapper.discountList());
		map.put("dList", list);
		return map;
	}
}
