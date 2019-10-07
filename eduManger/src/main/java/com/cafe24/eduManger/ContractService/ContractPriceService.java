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
	 * @return 	contractPriceMapper.contractPriceList() 실행결과를 담은 map객체
	 * @detail 	controller단에서 contractPriceList() 실행 요청받으면 계약지점 목록을 Map 객체로 담기 위해 Map데이터 타입으로 선언 후 실행한다. 
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 contractPriceMapper.contractPriceList() 메서드 실행하게 하고 
	 * 			실행결과로 리턴받은 목록을 List 데이터 타입으로 선언한 contractPriceList 변수에 담는다.
	 * 			그리고 생성된 map 변수에 contractPriceList라고 명명한 주머니에 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public Map<String, Object> contractPriceList(){
		Map<String, Object> map = new HashMap<String, Object>(); 
		List<ContractPrice> contractPriceList = contractPriceMapper.contractPriceList();   
		map.put("contractPriceList", contractPriceList); 
		//System.out.println(contractPriceList.toString() + "<-- contractPriceList.toString() ContractPriceService"); 
		return map;
	}
	/* @param  	contractPriceInsert url
	 * @return 	contractPriceMapper.contractPriceInsert(contractPrice) 실행결과(정수값)
	 * @detail 	controller단에서 contractPriceInsert(ContractPrice contractPrice) 실행 요청받으면
	 * 			insert쿼리문 결과값은 정수로 표현되기에 int 타입으로 선언하여 메서드 실행할 때
	 * 			contractPriceMapper.contractPriceInsert(contractPrice) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public int contractPriceInsert(ContractPrice contractPrice) {
		//System.out.println(contractPriceMapper.contractPriceInsert(contractPrice));
		return contractPriceMapper.contractPriceInsert(contractPrice);
	}
	
	/* @param  	contractPriceUpdateById url, 학원코드값
	 * @return 	contractPriceMapper.contractPriceUpdateById(contract_price_code) 실행결과(행 하나)
	 * @detail 	controller단에서 학원코드를 매개변수로 받아서 contractPriceUpdateById(String contract_price_code) 실행 요청받으면
	 * 			ContractPrice 클래스 데이터 타입으로 이루어진 하나의 행을 받아오기에 ContractPrice로 타입 지정하고 메서드 실행한다.
	 * 			cocontractPriceMapper.contractPriceUpdateById(contract_price_code) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public ContractPrice contractPriceUpdateById(String contract_price_code){
		
		return contractPriceMapper.contractPriceUpdateById(contract_price_code);
	}
	
	/* @param  	contractPriceUpdate url
	 * @return 	contractPriceMapper.contractPriceUpdate(contractPrice) 실행결과(정수값)
	 * @detail 	controller단에서 학원코드를 매개변수로 받아서 contractPriceUpdate(ContractPrice contractPrice) 실행 요청받으면
	 * 			contractPrice 클래스 데이터 타입으로 이루어진 하나의 행을 받아오기에 contractPrice로 타입 선언하여 메서드 실행한다.
	 * 			contractPriceMapper.contractPriceUpdate(contractPrice) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public int contractPriceUpdate(ContractPrice contractPrice) {
		
		return contractPriceMapper.contractPriceUpdate(contractPrice);
	}
	
	/* @param  	contractPriceDelete url, 학원코드값
	 * @return 	contractPriceMapper.contractPriceDelete(contract_price_code) 실행결과(정수값)
	 * @detail 	controller단에서 학원코드를 매개변수로 받아서 contractPriceDelete(contract_price_code) 실행 요청받으면
	 * 			delete 쿼리문 결과값은 정수로 표현되기에 int 로 타입 선언하여 메서드 실행한다.
	 * 			contractPriceMapper.contractPriceDelete(contract_price_code) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public int contractPriceDelete(String contract_price_code) {
		
		return contractPriceMapper.contractPriceDelete(contract_price_code);
	}
}
