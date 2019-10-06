package com.cafe24.eduManger.ContractController;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.ContractService.ContractService;
import com.cafe24.eduManger.ContractVo.Contract;

@Controller
public class ContractController {

	@Autowired private ContractService contractService;
	
	/* @param  	contractList url
	 * @return 	계약목록 화면 contract/contractList.html
	 * @detail 	계약-계약목록을 누르면 get방식으로 contractList url 요청하고 controller단에서
	 * 			contractList(Model model) 메서드 실행하게되고 service단에서 contractList()실행시켜 
	 * 			리턴받은 맵 객체를 Map 클래스 데이터 타입으로 선언한 map 변수에 담는다. map 변수에 담겨있던 값들의 주소들을 
	 * 			model 객체에 list라는 이름표를 부여해서 담아 contractList.html 화면에 적은 타임리프 반복문으로 화면에 뿌려준다.
	 */
	@GetMapping("/contractList")
	public String contractList(Model model) {
		Map<String, Object> map = contractService.contractList();
		System.out.println(map +"<-- map ContractController.java");
		model.addAttribute("list", map.get("contractList"));
		return "/contract/contractList";
	}
	
	/* @param  	contractInsert url
	 * @return 	계약목록 화면 contract/contractInsert.html
	 * @detail 	계약목록화면에서 계약 추가 버튼을 누르면 get방식으로 contractList url 요청하고 controller단에서
	 * 			contractList() 메서드 실행하게되고 리턴받은 계약 추가 폼이 있는 contractInsert.html 화면으로 이동한다.
	 */
	@GetMapping("/contractInsert")
	public String contractInsert() {
		return "/contract/contractInsert";
	}
	
	@PostMapping("/contractInsert")
	public String contractInsert(Contract contract) {
		System.out.println(contract +"<-- contract contractController");
		contractService.contractInsert(contract);
		return "redirect:/contractList";
	}
	
	@GetMapping("/contractUpdateById")
	public String contractUpdateById(@RequestParam(value="contract_code") String contract_code, Model model) {
		System.out.println(contract_code +"<-- contract_code contractController");
		model.addAttribute("list", contractService.contractUpdateById(contract_code));
		System.out.println(contractService.contractUpdateById(contract_code));
		return "contract/contractUpdate";
	}
	
	@PostMapping("/contractUpdate")
	public String contractUpdate(Contract contract) {
		contractService.contractUpdate(contract);
		return "redirect:/contractList";
	}
	
	@GetMapping("/contractDelete")
	public String contractDelete(@RequestParam(value="contract_code") String contract_code) {
		contractService.contractDelete(contract_code);
		return "redirect:/contractList"; 
	}
}
