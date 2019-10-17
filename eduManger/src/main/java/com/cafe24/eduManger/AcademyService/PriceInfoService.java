package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.PriceInfoMapper;
import com.cafe24.eduManger.AcademyVo.PriceInfo;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;
import com.cafe24.eduManger.StudentVo.Stu_pi;

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
	
	public List<Stu_pi> stuList(HttpSession session){
		String ac_code = (String)session.getAttribute("SACODE");
		//System.out.println(ac_code);
		return priceInfoMapper.stuList(ac_code);
	}
}
