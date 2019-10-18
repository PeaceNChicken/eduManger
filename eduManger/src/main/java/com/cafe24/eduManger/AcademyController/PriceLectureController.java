package com.cafe24.eduManger.AcademyController;

import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.DiscountService;
import com.cafe24.eduManger.AcademyService.PriceLectureService;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.AcademyVo.PriceLectureList;

@Controller
public class PriceLectureController {

	@Autowired private PriceLectureService priceLectureService;
	@Autowired private DiscountService discountService;
	/* @param  	priceLectureList url
	 * @return 	수강료 및 수강료 할인 정보 페이지 priceLectureList.html
	 * @detail 	학원관리-수강료 및 할인 정보를 눌렀을 때 get방식으로 priceLectureList url 요청시 priceLectureList메서드를 호출한다.
	 * 			service단의 priceLectureList 메서드 호출해서 수강료 목록이 담긴 map객체를 리턴받아  Map 데이터 타입으로 선언한 
	 * 			map 변수에 담고 model객체에 list라는 이름으로 map에 담겨있던 주소값들을 담는다. priceLectureList.html
	 * 			화면으로 이동해서 타임리프 반복문으로 화면에 목록을 보여준다.
	 */ 
	@GetMapping("/priceLectureList")
	public String priceLectureList(Model model) {
		Map<String, Object> map = priceLectureService.priceLectureList();
		Map<String, Object> mapd = discountService.discountList();
		//System.out.println(map +"<-- priceLectureController");
		model.addAttribute("list", map.get("list"));
		model.addAttribute("dList", mapd.get("dList"));
		return "/academy/priceLecture/priceLectureList";
	}
	
	/* @param  	priceLectureInsert url, 과목, 학년 및 수업과정분류 VO객체
	 * @return 	academy/priceLecture/priceLectureInsert.html 화면
	 * @detail 	수강료 등록 버튼을 누르면 과목과 학년 및 수업과정 분류를 선택하면 결과적으로 강의코드를 가져올 수 있도록
	 * 			과목, 학년 및 수업과정분류 목록을 가져오는 메서드 실행하여 리턴받은 결과값을 model객체에 담아서
	 * 			수강료 등록화면으로 넘어가고 과목이나 학년 및 수업과정은 코드가 아닌 알아보기 쉬운 이름으로 선택하게끔 보여준다.
	 */
	@GetMapping("/priceLectureInsert")
	public String priceLectureInsert(Model model) {
		model.addAttribute("subjectList", priceLectureService.subjectList());
		model.addAttribute("classLevelList", priceLectureService.classLevelList());
		return "/academy/priceLecture/priceLectureInsert";
	}
	
	/* @param  	PriceLecture 타입 객체, sub_code, class_level_code 변수 값
	 * @return 	수강료 등록 후 수강료 목록화면으로 redirect:/priceLectureList
	 * @detail 	수강료 정보를 입력하고 추가하기 버튼을 누르면 post방식으로 service단에서 강의코드를 결정해줄 과목코드, 학년 및 수업과정 변수값
	 * 			그리고 PriceLecture 타입의 데이터들이 입력된 객체, 학원코드나 등록자아이디를 결정해줄 session 정보를
	 * 			매개변수로 담아 priceLectureInsert() 호출하고 실행되면 service단의 priceLectureInsert 메서드에
	 * 			controller단에 전달된 값들을 매개변수로 담아서 호출한다. 등록 처리가 되면 수강료 목록화면으로 리다이렉트한다.
	 */
	@PostMapping("/priceLectureInsert")
	public String priceLectureInsert(@RequestParam(value="sub_code") String sub_code
									,@RequestParam(value="class_level_code") String class_level_code
									,PriceLecture priceLecture, HttpSession session) {
		priceLectureService.priceLectureInsert(sub_code, class_level_code, priceLecture, session);
		System.out.println(sub_code +"<- sub_code priceLectureController");
		System.out.println(class_level_code +"<- class_level_code priceLectureController");
		return "redirect:/priceLectureList";
	}
	
	/* @param  	priceLectureUpdateById url, price_list_code 수강료 코드 값
	 * @return 	수강료 코드값으로 쿼리문 실행해서 priceLectureList 타입으로 가져온 데이터로 구성한 수강료 수정 화면 priceLectureUpdate.html
	 * @detail 	수강료 목록화면에서 수정버튼을 누르면 해당 수강료 코드값을 get방식으로 가져와 service단에 있는 priceLectureUpdateById()
	 * 			메서드 호출하면서 매개변수로 담아서 전달한다. service단에서 리턴받은 결과값을 model 객체에 list라는 이름표르 붙여 담고
	 * 			priceLectureUpdate.html 화면에서 model객체에 담긴 값들을 꺼내와서 화면에 출력해준다.
	 */	
	@GetMapping("/priceLectureUpdateById")
	public String priceLectureUpdateById(@RequestParam(value="price_list_code") String price_list_code, Model model) {
		System.out.println(price_list_code);
		model.addAttribute("list", priceLectureService.priceLectureUpdateById(price_list_code));
		//priceLectureService.priceLectureUpdateById(price_list_code);
		
		return "/academy/priceLecture/priceLectureUpdate";
	}
	
	/* @param  	priceLectureList 폼 입력 데이터, session 영역 데이터
	 * @return 	수정 처리 후 리다이렉트 한 수강료 목록 화면 priceLectureList.html
	 * @detail 	수강료 수정 화면에서 수정하기 버튼을 누르면 post방식으로 입력된 priceLectureList 타입의 데이터와 session 영역에 담긴
	 * 			데이터를 매개변수에 담아서 controller단의 priceLectureUpdate() 메서드 호출한다. service단의 
	 * 			priceLectureUpdate() 메서드에 받은 매개변수를 전달하여 메서드 호출한다. 수정 처리 되면
	 * 			수강표 목록화면으로 리다이렉트한다.
	 * 			
	 */
	@PostMapping("/priceLectureUpdate")
	public String priceLectureUpdate(PriceLectureList priceLectureList, Model model, HttpSession session) {
		System.out.println(priceLectureList + "<- priceLectureList priceLectureController");
		priceLectureService.priceLectureUpdate(priceLectureList, session);
		return "redirect:/priceLectureList";
	}
	
	/* @param  	priceLectureDelete url, price_list_code 수강료코드 값
	 * @return 	삭제 처리 후 수강료 목록으로 리다이렉트 한 priceLectureList.html 화면
	 * @detail 	priceLectureList 화면에서 삭제 버튼을 누르면 각 행의 수강료코드 값을 받아오면서 모달로 경고창을 띄운다.
	 * 			모달창에서 YES를 누르면 priceLectureDelete url 요청하면서 미리 받아온 코드값을 매개변수로 받아
	 * 			priceLectureDelete() 메서드 호출한다. 실행되면 service단의 priceLectureDelete() 메서드에
	 * 			수강료 코드를 매개변수에 담아 호출하고 삭제처리가 되면 수강료 목록화면으로 리다이렉트한다.
	 */
	@GetMapping("/priceLectureDelete")
	public String priceLectureDelete(@RequestParam(value="price_list_code") String price_list_code) {
		//System.out.println(price_list_code +"<- price_list_code priceLectureController");
		priceLectureService.priceLectureDelete(price_list_code);
		return "redirect:/priceLectureList";
	}
}
