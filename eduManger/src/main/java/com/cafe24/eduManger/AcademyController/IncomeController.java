package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.eduManger.AcademyService.IncomeService;
import com.cafe24.eduManger.AcademyService.PriceInfoService;

@Controller
public class IncomeController {
	@Autowired private IncomeService incomeService;
	@Autowired private PriceInfoService priceInfoService;
	/* @param  /incomeList url
	 * @return /academy/income/incomeList.html 화면
	 * @detail 수납 및 납부 안내 버튼을 누르면 할인 수납 및 납부 안내 목록 화면으로 이동한다.
	 */
	@GetMapping("/incomeList")
	public String incomeList(Model model, HttpSession session) {
		Map<String, Object> pMap = priceInfoService.priceInfoList(); 
		model.addAttribute("pList", pMap.get("pList"));
		model.addAttribute("stuList", priceInfoService.stuList(session));
		System.out.println(pMap);
		return "/academy/income/incomeList";
	}
	
	/* @param  /incomeInsert url
	 * @return /academy/income/incomeInsert.html 화면
	 * @detail 수납내역추가 버튼을 누르면 수납 정보 입력 폼이 있는 화면으로 이동한다.
	 */
	@GetMapping("/incomeInsert")
	public String incomeInsert() {
		
		System.out.println("수납 내역 입력 화면이동");
		return "/academy/income/incomeInsert";
	}
	
	/* @param  /수납 정보 폼에 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 추가하기 버튼을 누르면 수납 및 납부 안내 화면으로 리다이렉트한다.(DB연결 전)
	 */
	@PostMapping("/incomeInsert")
	public String incomeInsert(Model model) {
		
		System.out.println("수납 내역 입력 처리완료");
		return "redirect:/incomeList";
	}
	
	/* @param  /incomeUpdate url
	 * @return /academy/income/incomUpdate 화면
	 * @detail 연필모양 버튼을 누르면 수납 내역을 수정하는 화면으로 이동한다.
	 */
	@GetMapping("/incomeUpdate")
	public String incomeUpdate() {
		
		System.out.println("수납 내역 수정 화면이동");
		return "/academy/income/incomeUpdate";
	}
	
	/* @param  /수납 정보 수정 폼에 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 수정하기 버튼을 누르면 수납 및 납부 안내 화면으로 리다이렉트한다.(DB연결 전)
	 */
	@PostMapping("/incomeUpdate")
	public String incomeUpdate(Model model) {
		
		System.out.println("수납 내역 수정 처리완료");
		return "redirect:/incomeList";
	}
	
	/* @param  /incomeDelete url
	 * @return /academy/income/incomeDelete 화면
	 * @detail 휴지통 모양 버튼을 누르면 수납 내역 삭제하는 화면으로 이동한다.
	 */
	@GetMapping("/incomeDelete")
	public String incomeDelete() {
		
		System.out.println("수납 내역 삭제 화면이동");
		return "/academy/income/incomeDelete";
	}
	
	/* @param  /수납 정보 삭제 폼에 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 삭제하기 버튼을 누르면 수납 및 납부 안내 화면으로 리다이렉트한다.(DB연결 전)
	 */
	@PostMapping("/incomeDelete")
	public String incomeDelete(Model model) {
		
		System.out.println("수납 내역 삭제 처리 완료");
		return "redirect:/incomeList";
	}
}
