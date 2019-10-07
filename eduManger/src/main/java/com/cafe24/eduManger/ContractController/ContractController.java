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
		//System.out.println(map +"<-- map ContractController.java");
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
	
	/* @param  	Contract 타입 객체
	 * @return 	계약내역 추가 후 계약목록 화면 contract/contractList.html
	 * @detail 	추가하기 버튼을 누르면 폼에서 입력한 Contract 타입의 데이터를 post방식으로 전달하면서 
	 * 			contractInsert 메서드 호출하고 매개변수로 담아서 실행. service단에 있는 contractInsert메서드에 
	 * 			매개변수값 전달해서 호출하고 처리되면 계약목록화면으로 리다이렉트한다.
	 */
	@PostMapping("/contractInsert")
	public String contractInsert(Contract contract) {
		System.out.println(contract +"<-- contract contractController");
		contractService.contractInsert(contract);
		return "redirect:/contractList";
	}
	
	/*
	 * @param 	contractUpdateById url, 계약코드 값
	 * @return 	계약내역 수정화면 contract/contractAcademy/contractAcademyUpdate.html
	 * @detail 	수정탭에 있는 버튼을 누르면 get방식으로 해당 행의 계약코드값을 가져와 contractUpdateById 메서드에 매개변수로 담아서
	 * 			실행한다. service단에서 contractUpdateById 메서드 실행 요청하면서 매개변수로 계약코드값을 전달해주고
	 * 			리턴값이 될 계약코드와 일치하는 행 데이터를 model객체의 list라는 이름표를 부여하고 담아서
	 * 			contractUpdate.html 화면에서 수정 폼에 value값으로 list에 담긴 값들을 화면에 뿌려준다.
	 */
	@GetMapping("/contractUpdateById")
	public String contractUpdateById(@RequestParam(value="contract_code") String contract_code, Model model) {
		//System.out.println(contract_code +"<-- contract_code contractController");
		model.addAttribute("list", contractService.contractUpdateById(contract_code));
		//System.out.println(contractService.contractUpdateById(contract_code));
		return "contract/contractUpdate";
	}
	
	/* @param  	Contract 타입 객체
	 * @return 	계약내역 수정 후 계약목록 화면 contract/contractList.html
	 * @detail 	수정하기 버튼을 누르면 폼에서 입력한 Contract 타입의 데이터를 post방식으로 전달하면서 
	 * 			contractInsert 메서드 호출하고 매개변수로 담아서 실행. service단에 있는 contractInsert메서드에 
	 * 			매개변수값 전달해서 호출하고 처리되면 계약목록화면으로 리다이렉트한다.
	 */
	@PostMapping("/contractUpdate")
	public String contractUpdate(Contract contract) {
		contractService.contractUpdate(contract);
		return "redirect:/contractList";
	}
	
	/*
	 * @param 	contractDelete url, 계약코드 값
	 * @return 	삭제버튼 눌러 처리 후 계약목록화면 contract/contractList.html
	 * @detail 	삭제탭에 있는 버튼을 누르면 get방식으로 해당 행의 계약코드값을 가져오면서 모달로 경고창을 띄운다. 모달창에서 YES를 누르면
	 * 			contractDelete url 요청되고 contractDelete() 메서드에 계약코드값을 매개변수로 담아 메서드 실행한다. 
	 * 			service단에서 매개변수인 계약코드값을 전달해서 메서드 실행요청하고 삭제 처리 되면 계약목록화면으로 리다이렉트한다.
	 */
	@GetMapping("/contractDelete")
	public String contractDelete(@RequestParam(value="contract_code") String contract_code) {
		contractService.contractDelete(contract_code);
		return "redirect:/contractList"; 
	}
}
