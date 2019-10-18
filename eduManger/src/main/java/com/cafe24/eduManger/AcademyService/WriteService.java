package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.WriteMapper;
import com.cafe24.eduManger.AcademyVo.Write;



@Service
@Transactional
public class WriteService {
@Autowired private WriteMapper writeMapper;
	public Map<String, Object> getWrite(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Write> wr = writeMapper.getWrite();
		map.put("write", wr);
		return map;
	}
	
}
