package com.cafe24.eduManger.AcademyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe24.eduManger.AcademyService.DiscountService;

@Controller
public class DiscountController {
	
	@Autowired private DiscountService discountService;
	
	/* @param  /discountInsert url
	 * @return /academy/priceLecture/discountInsert.html 화면
	 * @detail 할인 정보 추가버튼을 누르면 할인 정보 입력 폼이 있는 화면으로 이동한다.
	 */
	@GetMapping("/discountInsert")
	public String discountInsert() {
		
		System.out.println("할인정보입력화면이동");
		return "/academy/discount/discountInsert";
	}
	
	/* @param  /할인 정보 입력 폼에 입력된 데이터
	 * @return redirect:/priceLectureList 화면
	 * @detail 등록하기 버튼을 누르면  할인 정보 목록 화면으로 리다이렉트한다. (DB연결 전)
	 */
	@PostMapping("/discountInsert")
	public String discountInsert(Model model) {
		
		System.out.println("할인정보입력완료");
		return "redirect:/priceLectureList";
	}

	/* @param  /할인 정보 수정 폼 화면
	 * @return /academy/discount/discountUpdate 화면
	 * @detail 연필 모양 버튼을 누르면 할인 정보를 수정할 수 있는 화면으로 이동
	 */
	@GetMapping("/discountUpdate")
	public String discountUpdate() {
		
		System.out.println("할인정보수정화면이동");
		return "/academy/discount/discountUpdate";
	}
	
	/* @param  /할인 정보 수정 폼에 입력된 데이터
	 * @return /academy/discount/discountUpdate 화면
	 * @detail 수정하기 버튼을 누르면 할인 정보 목록 화면으로 리다이렉트한다 (DB연결 전)
	 */
	@PostMapping("/discountUpdate")
	public String discountUpdate(Model model) {
		
		System.out.println("할인정보수정완료");
		return "redirect:/priceLectureList";
	}
	
	/* @param  /할인 정보 삭제 폼 화면
	 * @return /academy/discount/discountDelete 화면
	 * @detail 휴지통 모양의 버튼을 누르면 할인 정보를 삭제할 수 있는 화면으로 이동
	 */
	@GetMapping("/discountDelete")
	public String discountDelete() {
		
		System.out.println("할인정보삭제화면이동");
		return "/academy/discount/discountDelete";
	}
	
	/* @param  /할인 정보 수정 폼에 입력된 데이터
	 * @return redirect:/priceLectureList 화면
	 * @detail 삭제하기 버튼을 누르면 할인 정보 목록 화면으로 리다이렉트한다 (DB연결 전)
	 */
	@PostMapping("/discountDelete")
	public String discountDelete(Model model) {
		
		System.out.println("할인정보삭제완료");
		return "redirect:/priceLectureList";
	}
}
