package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.PriceInfoMapper;
import com.cafe24.eduManger.AcademyVo.PriceInfo;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;

@Service
@Transactional
public class PriceInfoService {
	@Autowired private PriceInfoMapper priceInfoMapper;
	
	public Map<String, Object> priceInfoList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<PriceInfoList> list = priceInfoMapper.priceInfoList();
		map.put("pList", list);
		return map;
	}
}
