package com.cafe24.eduManger.ContractController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.ContractService.ContractAcademyService;
import com.cafe24.eduManger.ContractVo.ContractAcademy;

@Controller
public class ContractAcademyController {

	@Autowired private ContractAcademyService contractAcademyService;
	
	/* @param  	/contractAcademyList url
	 * @return 	/contract/contractAcademy/contractAcademyList.html 화면
	 * @detail 	get방식으로 contractAcademyList url 요청하면 controller단에서 contractAcademyList(Model model)
	 * 			메서드 실행하게되고 service단에서 리턴받은 맵 객체를 Map 클래스 데이터 타입으로 선언한 map 변수에 담는다.
	 * 			map 변수에 담겨있던 값들의 주소들을 model 객체에 contractAcademyList라는 주머니에 담고
	 * 			contractAcademyList.html 화면에 적은 타임리프 반복문으로 화면에 뿌려준다.  
	 */
	@GetMapping("/contractAcademyList")
	public String contractAcademyList(Model model) {
		Map<String, Object> map = contractAcademyService.contractAcademyList();
		System.out.println(map + "<-- controller");
		model.addAttribute("contractAcademyList", map.get("contractAcademyList"));
		return "/contract/contractAcademy/contractAcademyList";
	}
	
	/* @param  	/contractAcademyInsert url
	 * @return 	/contract/contractAcademy/contractAcademyInsert.html 화면
	 * @detail 	get방식으로 contractAcademyInsert url 요청하면 controller단에서 contractAcademyInsert()
	 *			메서드 실행하게 되고 계약 지점 추가 폼이 있는 contractAcademyInsert.html 화면으로이동한다.
	 */
	@GetMapping("/contractAcademyInsert")
	public String contractAcademyInsert() {
		
		return "/contract/contractAcademy/contractAcademyInsert";
	}
	
	/* @param  	ContractAcademy 타입 객체
	 * @return 	redirect:/contractAcademyList 화면
	 * @detail 	post방식으로 ContractAcademy 타입으로 입력한 데이터가 담긴 객체를 가지고 contractAcademyInsert url 요청하면
	 * 			controller단에서 contractAcademyInsert(ContractAcademy contractAcademy) 메서드 실행하게 되고 
	 * 			service단의 contractAcademyInsert(contractAcademy) 메서드 실행 요청하고 목록 화면으로 리다이렉트한다.
	 */
	@PostMapping("/contractAcademyInsert")
	public String contractAcademyInsert(ContractAcademy contractAcademy){
		//System.out.println(contractAcademy.toString() + "<-- 계약 지점 입력 데이터");
		contractAcademyService.contractAcademyInsert(contractAcademy);
		return "redirect:/contractAcademyList";
	}
	
	/* @param  	contractAcademyUpdateById url
	 * @return 	contract/contractAcademy/contractAcademyUpdate.html 화면
	 * @detail 	get방식으로contractAcademyUpdate url 요청할때 controller단에서 각행의 학원코드인 acCode 값을 매개변수로 
	 * 			contractAcademyUpdateById()를 실행하게 되고 service단에서 contractAcademyUpdateById(acCode) 
	 * 			실행 요청 후 리턴값을 model객체의 list라는 주머니에 담고 contractAcademyUpdate.html 화면에서
	 * 			수정 폼에 value값으로 list에 담긴 값들을 화면에 뿌려준다.
	 */
	@GetMapping("/contractAcademyUpdateById")
	public String contractAcademyUpdateById(@RequestParam(value="ac_code") String ac_code
											,Model model) {
		//System.out.println(ac_code + "<-- ContractAcademyController");
		model.addAttribute("list", contractAcademyService.contractAcademyUpdateById(ac_code));
		//System.out.println(contractAcademyService.contractAcademyUpdateById(acCode) + "<-- controller");
		return "/contract/contractAcademy/contractAcademyUpdate";
	}
	/* @param  	ContractAcademy 타입 객체
	 * @return 	redirect:/contractAcademyList 화면
	 * @detail 	post방식으로 ContractAcademy 타입으로 입력한 데이터가 담긴 객체를 가지고 contractAcademyUpdate url 요청하면
	 * 			controller단에서 contractAcademyUpdate(ContractAcademy contractAcademy) 메서드 실행하게 되고 
	 * 			service단의 contractAcademyUpdate(contractAcademy) 메서드 실행 요청하고 목록 화면으로 리다이렉트한다.
	 */
	@PostMapping("/contractAcademyUpdate")
	public String contractAcademyUpdate(ContractAcademy contractAcademy) {
		System.out.println(contractAcademy + "<--controller");
		contractAcademyService.contractAcademyUpdate(contractAcademy);
		return "redirect:/contractAcademyList";
	}
	
	/* @param  	contractAcademyDelete url
	 * @return 	contract/contractAcademy/contractAcademyDelete.html 화면
	 * @detail 	get방식으로 contractAcademyDelete url 요청할때 controller단에서 각행의 학원코드인 acCode 값을 매개변수로 
	 * 			contractAcademyDelete()를 실행하게 되고 service단에서 contractAcademyUpdateById(acCode) 
	 * 			실행 요청 후 리턴값을 model객체의 list라는 주머니에 담고 contractAcademyUpdate.html 화면에서
	 * 			수정 폼에 value값으로 list에 담긴 값들을 화면에 뿌려준다.
	 */
	@GetMapping("/contractAcademyDelete")
	public String contractAcademyDelete(@RequestParam(value="ac_code") String ac_code
										,Model model) {
		System.out.println(ac_code + "<-- contractAcademyDelete, ContractAcademyController");
		model.addAttribute("list", contractAcademyService.contractAcademyUpdateById(ac_code));
		contractAcademyService.contractAcademyUpdateById(ac_code);
		return "/contract/contractAcademy/contractAcademyDelete";
	}
	
	@PostMapping("/contractAcademyDelete")
	public String contractAcademyDelete(ContractAcademy contractAcademy) {
		
		contractAcademyService.contractAcademyDelete(contractAcademy);
		return "redirect:/contractAcademyList";
	}
	
	
}
