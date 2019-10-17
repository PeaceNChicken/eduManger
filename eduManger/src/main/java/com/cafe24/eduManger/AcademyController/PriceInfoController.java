package com.cafe24.eduManger.AcademyController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.PriceInfoService;
import com.cafe24.eduManger.AcademyService.PriceLectureService;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;
import com.cafe24.eduManger.StudentService.StuPiService;

@Controller
public class PriceInfoController {
	@Autowired private PriceInfoService priceInfoService;
	@Autowired private PriceLectureService priceLectureService;
	/* @param  	priceInfoInsert url
	 * @return 	학원비 납부 추가 폼이 있는 priceInfoInsert.html 화면
	 * @detail 	수납 및 납부 안내 화면에서 학원비 납부 안내 내역 추가를 누르면 추가 폼이 있는 화면으로 이동한다.
	 */
	@GetMapping("/priceInfoInsert")
	public String priceInfoInsert(Model model, HttpSession session) {
		//System.out.println(priceLectureService.subjectList() +"<- subjectList()");
		model.addAttribute("subjectList", priceLectureService.subjectList());
		model.addAttribute("classLevelList", priceLectureService.classLevelList());
		model.addAttribute("stuList", priceInfoService.stuList(session));
		return "academy/priceInfo/priceInfoInsert";
	}
	
	/* @param  학원비 납부 안내 추가 폼에서 입력된 데이터
	 * @return redirect:/incomeList 화면
	 * @detail 추가하기 버튼을 누르면 수납 및 납부 안내 목록 화면으로 리다이렉트 한다.(DB연결 전)
	 */
	@PostMapping("/priceInfoInsert")
	public String priceInfoInsert(PriceInfoList priceInfoList) {
		System.out.println(priceInfoList+"<- priceInfoList priceInfoController");
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
