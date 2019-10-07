package com.cafe24.eduManger.ContractController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.ContractService.ContractPriceService;
import com.cafe24.eduManger.ContractVo.ContractPrice;

@Controller
public class ContractPriceController {

	@Autowired private ContractPriceService contractPriceService;
	
	/* @param   contractPriceList url
	 * @return  계약단가 목록화면contract/contractPrice/contractPriceList.html
	 * @detail  계약-계약단가표을 눌렀을 때 get방식으로 contractPriceList 요청이 들어오면 
	 * 			service단에 있는 contractPriceList() 메서드 실행 요청하고 service단에서 리턴받은 
	 * 			map 객체값을 Map 클래스 데이터 타입으로 선언한 map 변수에 담는다.
	 * 			model 객체 내 contractPriceList라는 이름표를 붙여 map객체에 담겨있던 리스트 값을 담고
	 * 			타임리프 반복문으로 contractPriceList 화면에 뿌려준다. 
	 */
	@GetMapping("/contractPriceList")
	public String contractPriceList(Model model) {
		Map<String, Object> map = contractPriceService.contractPriceList();
		//System.out.println(map + "<-- controller");
		model.addAttribute("contractPriceList", map.get("contractPriceList"));  
		return "/contract/contractPrice/contractPriceList";
	}
	
	/* @param  	contractPriceInsert url
	 * @return 	계약단가 추가 폼 화면 contract/contractPrice/contractPriceInsert.html
	 * @detail 	계약 단가 추가 버튼을 누르면 get방식으로 contractPriceInsert url 요청되고
	 * 			계약 단가 추가 폼이 있는 화면으로 이동한다.
	 */
	@GetMapping("/contractPriceInsert")
	public String contractPriceInsert() {
		
		return "/contract/contractPrice/contractPriceInsert";
	}
	
	/* @param  	contractPrice 타입 객체
	 * @return 	추가 처리 후 계약단가 목록화면 redirect:/contractPriceList
	 * @detail 	post방식으로 contractPriceInsert url 요청하면 controller단에서 contractPriceInsert()
	 *			메서드 실행하면서 매개변수로 추가폼에서 입력된 데이터를 contractPrice 타입의 객체에 담아 실행한다.
	 *			service단의 contractPriceInsert() 메서드 실행요청하면서 contractPrice를 매개변수로 담아서 
	 *			실행 요청하고 추가 처리가 되면 목록화면으로 리다이렉트한다.
	 */
	@PostMapping("/contractPriceInsert")
	public String contractPriceInsert(ContractPrice contractPrice) {
		System.out.println(contractPrice.toString() +"<-- controller contractPriceInsert");
		contractPriceService.contractPriceInsert(contractPrice);
		return "redirect:/contractPriceList";
	}
	
	/* @param  	contractPriceUpdateById url, 계약단가 코드값
	 * @return 	계약 단가 수정 폼 화면 contract/contractPrice/contractPriceUpdate.html
	 * @detail 	수정버튼을 누르면 get방식으로 각 행의 계약단가 코드값을 받아오면서 contractPriceUpdateById url 요청한다.
	 * 			controller단에서 메서드 실행할 때 service단에 계약단가 코드를 매개변수로 넘겨서 
	 * 			contractPriceService.contractPriceUpdateById() 실행요청하고 리턴받은 행 하나를 list라는 이름표를 붙여서 
	 * 			model객체에 담고 contractPriceUpdate.html 화면에서 수정 폼에 value값으로 list에 담긴 값들을 넣고 화면에 뿌려준다.
	 */
	@GetMapping("/contractPriceUpdateById")
	public String contractPriceUpdateById(@RequestParam(value="contract_price_code") String contract_price_code
													   ,Model model) {
		//System.out.println(contract_price_code + "<-- contract_price_code ContractPriceController");
		model.addAttribute("list", contractPriceService.contractPriceUpdateById(contract_price_code));
		return "/contract/contractPrice/contractPriceUpdate";
	}
	
	/* @param  	contractPrice 타입 객체
	 * @return 	수정 처리 후 계약단가 목록화면 redirect:/contractPriceList
	 * @detail 	수정하기 버튼을 누르면 contractPriceUpdate url 요청하게되고 post방식으로  수정폼에서 contractPrice 타입으로 입력된
	 * 			객체를 매개변수로 삼아 contractPriceUpdate() 메서드 실행한다. service단에 입력했던 데이터를 매개변수로 전달해서
	 * 			contractPriceUpdate() 메서드 실행하도록 요청하고 처리되면 목록화면으로 리다이렉트한다.
	 */
	@PostMapping("/contractPriceUpdate")
	public String contractPriceUpdate(ContractPrice contractPrice) {
		System.out.println(contractPrice.toString() + "<-- contractPrice.toString() ContractPriceController");
		contractPriceService.contractPriceUpdate(contractPrice);
		return "redirect:/contractPriceList";
	}
	
	/* @param  	contractPriceDelete url, 계약단가 코드값
	 * @return 	계약 단가 삭제 처리 후 목록화면 redirect:/contractPriceList
	 * @detail 	삭제버튼을 누르면 get방식으로 각 행의 계약단가 코드값을 받아오면서 모달로 경고창을 띄운다. 모달창에서 YES를 누르면
	 * 			contractPriceDelete url 요청하면서 미리 받아온 코드값을 매개변수로 받아 contractPriceDelete() 메서드 실행 요청한다.
	 *			service단에서 매개변수인 contract_price_code를 전달하여 contractPriceDelete() 실행하도록 요청하고
	 *			삭제 처리가 되면 목록화면으로 리다이렉트한다
	 */
	@GetMapping("/contractPriceDelete")
	public String contractPriceDelete(@RequestParam(value="contract_price_code") String contract_price_code) {
		//System.out.println(contract_price_code + "<-- contract_price_code ContractPriceController");
		contractPriceService.contractPriceDelete(contract_price_code);
		return "redirect:/contractPriceList";
	}
	
}
