package com.cafe24.eduManger.AcademyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PriceInfoController {

	/* @param  /priceInfoInsert url
	 * @return /academy/priceInfo/priceInfoInsert.html 화면
	 * @detail 학원비 납부 내역 추가를 누르면 학원비 납부 안내를 추가할 수 있는 화면으로 이동한다
	 */
	@GetMapping("/priceInfoInsert")
	public String priceInfoInsert() {
		
		return "academy/priceInfo/priceInfoInsert";
	}
	
	/* @param  학원비 납부 안내 추가 폼에서 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 추가하기 버튼을 누르면 수납 및 납부 안내 목록 화면으로 리다이렉트 한다.(DB연결 전)
	 */
	@PostMapping("/priceInfoInsert")
	public String priceInfoInsert(Model model) {
		
		return "redirect:/incomeList";
	}
	
	/* @param  /priceInfoUpdate url
	 * @return /academy/priceInfo/priceInfoUpdate.html 화면
	 * @detail 연필모양 버튼을 누르면 학원비 납부 안내 수정 화면으로 이동한다.
	 */
	@GetMapping("/priceInfoUpdate")
	public String priceInfoUpdate() {
		
		return "/academy/priceInfo/priceInfoUpdate";
	}
	
	/* @param  학원비 납부 안내 수정 폼에서 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 수정하기 버튼을 누르면 수납 및 납부 안내 목록 화면으로 리다이렉트 한다.(DB연결 전)
	 */
	@PostMapping("/priceInfoUpdate")
	public String priceInfoUpdate(Model model) {
		
		return "redirect:/incomeList";
	}
	
	/* @param  /priceInfoDelete url
	 * @return /academy/priceInfo/priceInfoDelete.html 화면
	 * @detail 휴지통 모양 버튼을 누르면 학원비 납부 안내 삭제 화면으로 이동한다.
	 */
	@GetMapping("/priceInfoDelete")
	public String priceInfoDelete() {
		
		return "/academy/priceInfo/priceInfoDelete";
	}
	
	/* @param  학원비 납부 안내 삭제 폼에서 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 삭제하기 버튼을 누르면 수납 및 납부 안내 목록 화면으로 리다이렉트 한다.(DB연결 전)
	 */
	@PostMapping("/priceInfoDelete")
	public String priceInfoDelete(Model model) {
		
		return "redirect:/incomeList";
	}
}
