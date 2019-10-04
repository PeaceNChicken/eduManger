package com.cafe24.eduManger.ContractController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.ContractService.ContractService;

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
	
	
}
