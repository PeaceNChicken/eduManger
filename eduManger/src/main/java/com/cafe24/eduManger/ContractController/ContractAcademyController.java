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
	/* @param  /contractAcademyList url
	 * @return /contract/contractAcademy/contractAcademyList.html 화면
	 * @detail 계약-계약지점목록을 누르면 계약 지점 목록 화면으로 이동한다.
	 */
	@GetMapping("/contractAcademyList")
	public String contractAcademyList(Model model) {
		Map<String, Object> map = contractAcademyService.contractAcademyList();
		//System.out.println(map + "<-- controller");
		model.addAttribute("contractAcademyList", map.get("contractAcademyList"));
		return "/contract/contractAcademy/contractAcademyList";
	}
	
	@GetMapping("/contractAcademyInsert")
	public String contractAcademyInsert() {
		
		return "/contract/contractAcademy/contractAcademyInsert";
	}
	
	@PostMapping("/contractAcademyInsert")
	public String contractAcademyInsert(ContractAcademy contractAcademy){
		System.out.println(contractAcademy.toString() + "<-- 계약 지점 입력 데이터");
		contractAcademyService.contractAcademyInsert(contractAcademy);
		return "redirect:/contractAcademyList";
	}
	
}
