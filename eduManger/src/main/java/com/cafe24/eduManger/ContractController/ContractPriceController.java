package com.cafe24.eduManger.ContractController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.eduManger.ContractService.ContractPriceService;
import com.cafe24.eduManger.ContractVo.ContractPrice;

@Controller
public class ContractPriceController {

	@Autowired private ContractPriceService contractPriceService;
	
	/* @param   contractPriceList url
	 * @return  contract/contractAcademy/contractPriceList.html 화면
	 * @detail  계약-계약단가표을 눌렀을 때 get방식으로 contractPriceList 요청이 들어오면 
	 * 			service단에 있는 contractPriceList() 메서드 실행 요청하고 리턴받은 값을 
	 * 			Map 클래스 데이터 타입으로 선언한 map 변수에 담는다. map 변수에 담겨있던 값들의 주소들을 model 객체에 
	 * 			contractPriceList라는 이름표를 부여해서 담아 contractPriceList.html 화면에 적은 타임리프 반복문으로 화면에 뿌려준다. 
	 */
	@GetMapping("/contractPriceList")
	public String contractPriceList(Model model) {
		Map<String, Object> map = contractPriceService.contractPriceList(); //service단에서 리턴받은 map객체를 map이라는 변수에 선언
		System.out.println(map + "<-- controller");  //map변수에 service단에서 리턴받은값이 제대로 들어왔는지 확인
		model.addAttribute("contractPriceList", map.get("contractPriceList")); //model객체에 map 객체 내에 contractPriceList란 이름표가 달렸던 데이터를 가져와서 contractPriceList라는 이름표를 달아놓는다.  
		return "/contract/contractPrice/contractPriceList";
	}
	
	/* @param  contractPriceInsert url
	 * @return contract/contractAcademy/contractPriceInsert.html 화면
	 * @detail get방식으로 계약 단가 추가 버튼을 누르면 계약 단가 추가할 수 있는 화면으로 이동한다.
	 */
	@GetMapping("/contractPriceInsert")
	public String contractPriceInsert() {
		
		return "/contract/contractPrice/contractPriceInsert";
	}
	
	/* @param  	contractAcademyInsert url
	 * @return 	계약지점추가화면 contract/contractAcademy/contractAcademyInsert.html
	 * @detail 	get방식으로 contractAcademyInsert url 요청하면 controller단에서 contractAcademyInsert()
	 *			메서드 실행하게 되고 계약 지점 추가 폼이 있는 contractAcademyInsert.html 화면으로이동한다.
	 */
	@PostMapping("/contractPriceInsert")
	public String contractPriceInsert(ContractPrice contractPrice) {
		System.out.println(contractPrice.toString() +"<-- controller contractPriceInsert");
		contractPriceService.contractPriceInsert(contractPrice);
		return "redirect:/contractPriceList";
	}
	
	/* @param  contractPriceUpdate url
	 * @return contract/contractAcademy/contractPriceUpdate.html 화면
	 * @detail 연필모양 버튼을 누르면 계약 단가 수정할 수 있는 화면으로 이동한다.
	 */
	@GetMapping("/contractPriceUpdate")
	public String contractPriceUpdate() {
		
		return "/contract/contractPrice/contractPriceUpdate";
	}
	
	/* @param  계약단가 수정 화면에서 입력된 데이터
	 * @return redirect:/contractPriceList 화면
	 * @detail 수정하기 버튼을 누르면 계약 단가 목록 화면으로 리다이렉트한다. (DB연결 전)
	 */
	@PostMapping("/contractPriceUpdate")
	public String contractPriceUpdate(Model model) {
		
		return "redirect:/contractList";
	}
}
