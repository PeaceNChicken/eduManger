package com.cafe24.eduManger.AcademyController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.DiscountService;
import com.cafe24.eduManger.AcademyVo.Discount;

@Controller
public class DiscountController {
	
	@Autowired private DiscountService discountService;
	
	/* @param  	discountInsert url
	 * @return 	수강료 할인 정보 추가 화면 academy/discount/discountInsert.html
	 * @detail 	할인 추가 버튼을 누르면 get방식으로 할인 추가 폼이 있는 discountInsert.html 화면으로 이동한다.
	 */
	@GetMapping("/discountInsert")
	public String discountInsert() {
		//System.out.println("할인정보입력화면이동");
		return "/academy/discount/discountInsert";
	}
	
	/* @param  	할인 추가 폼에 입력된 discount 타입 데이터
	 * @return 	추가 처리 후 리다이렉트한 priceLectureList.html 화면
	 * @detail 	추가하기 버튼을 누르면 discountInsert url 요청되면 post방식으로 
	 * 			폼에 입력한 데이터와 session 영역 데이터에 매개변수 선언하고 
	 * 			service단의 discountInsert() 메서드에 매개변수를 담아서 호출한다. 
	 * 			메서드 실행 후 목록화면으로 리다이렉트한다.  
	 */
	@PostMapping("/discountInsert")
	public String discountInsert(Discount discount, HttpSession session) {
		discountService.discountInsert(discount, session);
		//System.out.println("할인정보입력완료");
		return "redirect:/priceLectureList";
	}

	/* @param  	discontUpdateById url, discountCode 할인 코드 값
	 * @return 	할인코드 값으로 쿼리문 실행하여 Discount 타입으로 가져온 데이터를 화면에 보여주는 할인 수정 화면 discountUpdate.html
	 * @detail 	할인 목록 화면에서 수정 버튼을 누르면 해당 할인 코드 값을 get방식으로 가져와  매개변수에 담은 discountUpdateById() 메서드 호출하고 
	 * 			실행하면 service단에 있는 discountUpdateById() 메서드 호출할 때 매개변수로 전달한다. service단 메서드 호출한 결과값을
	 * 			model 객체에 list라는 이름을 붙여 담고 할인 수정 화면에서 model 객체에 담긴 값들을 꺼내와서 화면에 출력해준다. 
	 */
	@GetMapping("/discountUpdateById")
	public String discountUpdateById(@RequestParam(value="discountCode") String discountCode, Model model) {
		//System.out.println(discountCode + "<- discountCode DiscountController");
		model.addAttribute("list", discountService.discountUpdateById(discountCode));
		//System.out.println(discountService.discountUpdateById(discountCode));
		return "/academy/discount/discountUpdate";
	}
	
	/* @param 	Discount 타입으로 입력된 할인 정보 수정 데이터, session 에 담긴 데이터
	 * @return 	수정 처리 후 할인 목록 화면 priceLectureList.html
	 * @detail 	할인 수정 페이지에서 수정하기를 누르면 post방식으로 discountUpdate url 요청되고
	 * 			입력된 Discount 타입의 데이터와 session 영역에 담긴	데이터를 매개변수로 담아  discountUpdate() 메서드 호출한다.
	 * 			실행되면 service단의 discountUpdate() 메서드에 매개변수를 전달하면서 메서드 호출하고
	 * 			할인 목록 화면으로 리다이렉트한다.
	 */
	@PostMapping("/discountUpdate")
	public String discountUpdate(Discount discount, HttpSession session) {
		discountService.discountUpdate(discount, session);
		//System.out.println(discount + "<-discount DiscountController");
		return "redirect:/priceLectureList";
	}
	
	/* @param  	discountDelete url, 할인 코드 값 discountCode
	 * @return 	삭제 처리 후 리다이렉트한 수강료 및 할인 목록 화면 priceLectureList.html
	 * @detail 	할인 목록 화면에서 삭제 버튼을 누르면 해당 행의 할인 코드 값을 받아오면서 모달로 경고창을 띄운다.
	 * 			모달창에서 YES를 누르면 discountDelete url 요청하면서 받아온 할인 코드 값을 매개변수로 담아
	 * 			discountDelete() 메서드 호출한다. 실행하면서 service단의 discountDelete() 메서드에
	 * 			할인 코드를 매개변수로 전달하여 호출하고 수강료 및 할인 목록 화면으로 리다이렉트 한다.  
	 */
	@GetMapping("/discountDelete")
	public String discountDelete(@RequestParam(value="discountCode") String discountCode) {
		//System.out.println(discountCode);
		discountService.discountDelete(discountCode);
		return "redirect:/priceLectureList";
	}
}
