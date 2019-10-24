package com.cafe24.eduManger.AcademyController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe24.eduManger.AcademyService.PriceInfoService;
import com.cafe24.eduManger.AcademyService.PriceLectureService;
import com.cafe24.eduManger.AcademyVo.PriceInfo;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.StudentService.StuPiService;

@Controller
public class PriceInfoController {
	@Autowired private PriceInfoService priceInfoService;
	@Autowired private PriceLectureService priceLectureService;
	/* @param  	priceInfoInsert url, model 객체
	 * @return 	학원비 납부 추가 폼이 있는 priceInfoInsert.html 화면
	 * @detail 	수납 및 납부 안내 화면에서 학원비 납부 안내 내역 추가를 누르면 추가 폼 화면에서
	 * 			처리하게 될 데이터들을 받아오기 위해 priceLectureService.subjectList(),
	 * 			priceLectureService.classLevelList(), priceInfoService.stuList(session),
	 * 			priceInfoService.priceLectureList() 메서드 호출하고 리턴값을 model 객체에 담아서
	 * 			추가 폼 화면으로 리턴시킨다.
	 */
	@GetMapping("/priceInfoInsert")
	public String priceInfoInsert(Model model, HttpSession session) {
		model.addAttribute("subjectList", priceLectureService.subjectList()); //과목리스트
		model.addAttribute("classLevelList", priceLectureService.classLevelList()); //학년 및 과정 리스트
		model.addAttribute("stuList", priceInfoService.stuList(session)); //학생 상세정보 리스트
		model.addAttribute("pList", priceInfoService.priceLectureList()); //강의료 리스트
		//System.out.println(priceInfoService.priceLectureList());
		return "academy/priceInfo/priceInfoInsert";
	}
	
	/* @param  	학원비 납부 안내 추가 폼에서 입력된 PriceInfoList 타입의 데이터, session 객체 값
	 * @return 	수납 및 납부 내역 화면 redirect:/incomeList
	 * @detail 	추가하기 버튼을 누르면 post방식으로 priceInfoList 변수에 담긴 값과 session에 남아있는 값을
	 * 			service 내 priceInfoInsert() 호출하면서 매개변수로 전달한다. 실행 후
	 * 			수납 및 납부 내역 화면으로 리다이렉트한다.
	 */
	@PostMapping("/priceInfoInsert")
	public String priceInfoInsert(PriceInfoList priceInfoList, HttpSession session) {
		priceInfoService.priceInfoInsert(priceInfoList, session);
		//System.out.println(priceInfoList+"<- priceInfoList priceInfoController");
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
	
	@GetMapping("/lecturePrice")
	@ResponseBody
	public int lecturePrice(String subCode, String classLevelCode, String priceListEtc) {
		//System.out.println(subCode);
		//System.out.println(classLevelCode);
		//System.out.println(priceListEtc);
		int result = priceInfoService.lecturePrice(subCode, classLevelCode, priceListEtc);
		//System.out.println(result + "<-result");
		return result;
	}
	
	@GetMapping("/discountPrice")
	@ResponseBody
	public int discountCode(String discountCode) {
		System.out.println(discountCode);
		int dCode = priceInfoService.discountCode(discountCode);
		System.out.println(dCode);
		return dCode;
	}
}
