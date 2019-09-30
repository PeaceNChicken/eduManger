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
	
	/* @param  	contractPriceList url
	 * @return 	contractAcademyMapper.contractPriceList() 실행결과를 담은 map객체
	 * @detail 	controller단에서 contractPriceList() 실행 요청받으면 계약지점 목록을 Map 객체로 담기 위해 Map데이터 타입으로 선언 후 실행한다. 
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 contractAcademyMapper.contractPriceList() 메서드 실행하게 하고 
	 * 			실행결과로 리턴받은 목록을 List 데이터 타입으로 선언한 contractPriceList 변수에 담는다.
	 * 			그리고 생성된 map 변수에 contractPriceList라고 명명한 주머니에 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public Map<String, Object> contractPriceList(){
		
		Map<String, Object> map = new HashMap<String, Object>(); 
		List<ContractPrice> contractPriceList = contractPriceMapper.contractPriceList();   
		map.put("contractPriceList", contractPriceList); 
		System.out.println(contractPriceList.toString() + "<-- service"); 
		return map;
	}
	/* @param  	contractPriceInsert url
	 * @return 	contractAcademyMapper.contractPriceInsert(contractPrice) 실행결과(정수값)
	 * @detail 	controller단에서 contractPriceInsert(ContractPrice contractPrice) 실행 요청받으면
	 * 			insert쿼리문 추가 결과값은 정수로 표현되기에 int 타입으로 선언하여 메서드 실행할 때
	 * 			contractAcademyMapper.contractPriceInsert(contractPrice) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public int contractPriceInsert(ContractPrice contractPrice) {
		//System.out.println(contractPriceMapper.contractPriceInsert(contractPrice));
		return contractPriceMapper.contractPriceInsert(contractPrice);
	}
}
