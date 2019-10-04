package com.cafe24.eduManger.ContractService;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.ContractMapper.ContractMapper;
import com.cafe24.eduManger.ContractVo.Contract;

@Service
@Transactional
public class ContractService {

	@Autowired private ContractMapper contractMapper;
	
	/* @param  	contractList url
	 * @return 	contractMapper.contractList() 실행결과를 담은 map객체
	 * @detail 	controller단에서 contractList() 실행 요청받으면 계약지점 목록을 Map 객체로 담기 위해 Map데이터 타입으로 선언 후 실행한다. 
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 contractMapper.contractList() 메서드 실행하게 하고 
	 * 			생성된 map 변수에 contractList라고 명명한 주머니에 실행 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public Map<String, Object> contractList(){
		//System.out.println(contractMapper.contractList()+"<-- contractMapper.contractList() ContractService.java");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("contractList", contractMapper.contractList());
		return map;
	}
	
}