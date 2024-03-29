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
	
	/* @param  	contractAcademyList url
	 * @return 	contractAcademyMapper.contractAcademyList() 실행결과를 담은 map객체
	 * @detail 	controller단에서 contractAcademyList() 실행 요청받으면 계약지점 목록을 Map 객체로 담기 위해 Map데이터 타입으로 선언 후 실행한다. 
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 contractAcademyMapper.contractAcademyList() 메서드 실행하게 하고 
	 * 			실행결과로 리턴받은 목록을 List 데이터 타입으로 선언한 contractAcademyList 변수에 담는다.
	 * 			그리고 생성된 map 변수에 contractAcademyList라고 명명한 주머니에 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public Map<String, Object> contractAcademyList(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<ContractAcademy> contractAcademyList = contractAcademyMapper.contractAcademyList();
		map.put("contractAcademyList", contractAcademyList);
		//System.out.println(contractAcademyList.toString() + "<-- service");
		return map;
	}
	
	/* @param  	contractAcademySearch url
	 * @return 	contractAcademyMapper.contractAcademySearch() 실행결과를 담은 List객체(행 하나 혹은 그 이상)
	 * @detail 	controller단에서 contractAcademySearch() 실행 요청받으면 계약지점 목록이 하나 이상이 나올수 있기에 List 데이터 타입으로 선언하고
	 * 			매개변수를 받아 contractAcademySearch() 메서드 실행한다. mapper쪽에 있는 
	 * 			contractAcademyMapper.contractAcademySearch() 메서드에 매개변수를 담아
	 *			 실행 요청하고 실행결과로 리턴받은 값을 controller단에 리턴시켜준다.
	 */
	public List<ContractAcademy> contractAcademySearch(String cak, String cav, String cafd, String cald){
		
		return contractAcademyMapper.contractAcademySearch(cak, cav, cafd, cald);
	}
	
	/* @param  	contractAcademyInsert url
	 * @return 	contractAcademyMapper.contractAcademyInsert(contractAcademy) 실행결과(정수값)
	 * @detail 	controller단에서 contractAcademyInsert(ContractAcademy contractAcademy) 실행 요청받으면
	 * 			insert 쿼리문 추가 결과값은 정수로 표현되기에 int 타입으로 선언하여 메서드 실행할 때
	 * 			contractAcademyMapper.contractAcademyInsert(contractAcademy) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public int contractAcademyInsert(ContractAcademy contractAcademy) {
		
		return contractAcademyMapper.contractAcademyInsert(contractAcademy);
	}
	
	/* @param  	contractAcademyUpdateById url
	 * @return 	contractAcademyMapper.contractAcademyUpdateById(acCode) 실행결과(행 하나)
	 * @detail 	controller단에서 학원코드를 매개변수로 받아서 contractAcademyUpdateById(String acCode) 실행 요청받으면
	 * 			ContractAcademy 클래스 데이터 타입으로 이루어진 하나의 행을 받아오기에 ContractAcademy로
	 * 			타입 선언하여 메서드 실행한다. contractAcademyMapper.contractAcademyUpdateById(acCode)
	 * 			실행 요청하고 메서드 실행 결과값을 controller단에 리턴시켜준다.
	 */
	public ContractAcademy contractAcademyUpdateById(String ac_code) {
		
		return contractAcademyMapper.contractAcademyUpdateById(ac_code);
	}
	
	/* @param  	contractAcademyUpdate url
	 * @return 	contractAcademyMapper.contractAcademyUpdate(contractAcademy) 실행결과(정수값)
	 * @detail 	controller단에서 contractAcademyUpdate(ContractAcademy contractAcademy) 실행 요청받으면
	 * 			update 쿼리문 추가 결과값은 정수로 표현되기에 int 타입으로 선언하여 메서드 실행할 때
	 * 			contractAcademyMapper.contractAcademyDelete(contractAcademy) 실행 요청하고 
	 * 			메서드 실행 결과값을 controller단에 리턴시켜준다.
	 */
	public int contractAcademyUpdate(ContractAcademy contractAcademy) {
		
		return contractAcademyMapper.contractAcademyUpdate(contractAcademy);
	}
	
	/* @param  	contractAcademyDelete url, 학원코드값
	 * @return 	contractAcademyMapper.contractAcademyDelete(ac_code) 실행결과(정수값)
	 * @detail 	controller단에서 학원코드를 매개변수로 받아서 contractAcademyDelete(ac_code) 실행 요청받으면
	 * 			delete 쿼리문 결과값은 정수로 표현되기에 int 로 타입 선언하여 메서드 실행한다.
	 * 			contractAcademyMapper.contractAcademyDelete(ac_code) 실행 요청하고 메서드 실행 결과값을
	 * 			controller단에 리턴시켜준다.
	 */
	public int contractAcademyDelete(String ac_code) {
		
		return contractAcademyMapper.contractAcademyDelete(ac_code);
	}
}
