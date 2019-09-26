package com.cafe24.eduManger.ContractService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.ContractMapper.ContractAcademyMapper;
import com.cafe24.eduManger.ContractVo.ContractAcademy;

@Service
@Transactional
public class ContractAcademyService {

	@Autowired private ContractAcademyMapper contractAcademyMapper;
	
	public Map<String, Object> contractAcademyList(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<ContractAcademy> contractAcademyList = contractAcademyMapper.contractAcademyList();
		map.put("contractAcademyList", contractAcademyList);
		//System.out.println(contractAcademyList.toString() + "<-- service");
		return map;
	}
	
	public int contractAcademyInsert(ContractAcademy contractAcademy) {
		
		return contractAcademyMapper.contractAcademyInsert(contractAcademy);
	}
}
