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
		System.out.println(contractMapper.contractList()+"<-- contractMapper.contractList() ContractService.java");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("contractList", contractMapper.contractList());
		return map;
	}
	
	/* @param  	contractInsert url, contract 객체 변수값
	 * @return 	contractMapper.contractInsert(contract) 실행결과(정수값)
	 * @detail	controller단에서 contract 폼으로 입력된 데이터를 매개변수로 담아 contractInsert(Contract contract)
	 * 			실행요청 받을 때 contractMapper에서 contractInsert(contract)실행 후 결과값은 정수로 표현되기에 
	 * 			메서드 실행결과를 리턴시키기 위해서 int 타입으로 선언하여 메서드 실행하고 결과값을 controller단에 리턴시켜준다.
	 */
	public int contractInsert(Contract contract) {
		return contractMapper.contractInsert(contract);
	}
	
	/* @param  	contractUpdateById url, 계약코드 변수값
	 * @return 	contractMapper.contractUpdateById(contract_code) 실행결과(행 하나)
	 * @detail 	controller단에서 계약코드를 매개변수로 받아서 contractUpdateById(contract_code) 실행 요청받으면
	 * 			Contract 클래스 데이터 타입으로 이루어진 하나의 행을 받아오기에 ContractAcademy로
	 * 			타입 선언하여 메서드 실행한다. contractAcademyMapper.contractAcademyUpdateById(acCode)
	 * 			실행 요청하고 메서드 실행 결과값을 controller단에 리턴시켜준다.
	 */
	public Contract contractUpdateById(String contract_code) {
		return contractMapper.contractUpdateById(contract_code);
	}
	
	/* @param  	contractUpdate url, contract 객체 변수 값
	 * @return 	contractMapper.contractUpdate(contract) 실행결과(정수값)
	 * @detail 	controller단에서 contract 폼으로 수정된 데이터를 매개변수로 담아 contractUpdate(Contract contract)
	 * 			실행 요청 받으면 update쿼리문 실행결과값은 정수로 표현되기에 실행 결과를 리턴시켜주기 위해 int 타입으로 선언하여
	 * 			실행한다. 수정 처리가 되면 실행결과값을 controller단에 리턴시켜준다.  
	 */
	public int contractUpdate(Contract contract) {
		return contractMapper.contractUpdate(contract);
	}
	
	/* @param  	contractDelete url, 계약코드 변수 값
	 * @return 	contractMapper.contractDelete(contract_code) 실행결과(정수값)
	 * @detail 	controller단에서 학원코드를 매개변수로 받아서 contractDelete(contract_code) 실행 요청받았을 때
	 * 			delete 쿼리문 결과값은 정수로 표현되기에 int로 타입 선언하여 메서드 실행한다. contractMapper 내
	 * 			contractAcademyDelete(contract_code) 실행 요청하고 결과값을 controller단에 리턴시켜준다.
	 */
	public int contractDelete(String contract_code) {
		return contractMapper.contractDelete(contract_code);
	}
}