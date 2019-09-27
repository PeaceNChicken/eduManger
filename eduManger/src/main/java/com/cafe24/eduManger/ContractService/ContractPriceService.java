package com.cafe24.eduManger.ContractService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.ContractMapper.ContractPriceMapper;
import com.cafe24.eduManger.ContractVo.ContractPrice;

@Service
@Transactional
public class ContractPriceService {

	@Autowired private ContractPriceMapper contractPriceMapper;
	
	public Map<String, Object> contractPriceList(){
		
		Map<String, Object> map = new HashMap<String, Object>(); //맵객체에 담아 controller단으로 리턴시켜줄거라서 Map 클래스 데이터 타입으로 map 변수선언
		List<ContractPrice> contractPriceList = contractPriceMapper.contractPriceList(); //mapper단에서 리턴받은 리스트를 선언된 contractPriceList 변수에 담는다.  
		map.put("contractPriceList", contractPriceList); // 리스트 데이터 타입의 contractPriceList 변수를 map객체에 담고 contractPriceList라는 이름표를 달아놓는다.
		System.out.println(contractPriceList.toString() + "<-- service"); //mapper에서 리턴받은 리스트를 담은 contractPriceList 변수에 값이 제대로 들어온것인지 확인.
		return map;
	}
}
