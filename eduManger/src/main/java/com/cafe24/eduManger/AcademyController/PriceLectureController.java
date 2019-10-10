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

import com.cafe24.eduManger.AcademyService.PriceLectureService;
import com.cafe24.eduManger.AcademyVo.PriceLecture;

@Controller
public class PriceLectureController {

	@Autowired private PriceLectureService priceLectureService;
	/* @param  	priceLectureList url
	 * @return 	수강료 및 수강료 할인 정보 페이지 priceLectureList.html
	 * @detail 	학원관리-수강료 및 할인 정보를 눌렀을 때 priceLectureList url 요청하면 priceLectureList메서드를 호출한다.
	 * 			service단의 priceLectureList 메서드 호출해서 수강료 목록이 담긴 map객체를 리턴받아  Map 데이터 타입으로 선언한 
	 * 			map 변수에 담고 model객체에 list라는 이름으로 map에 담겨있던 주소값들을 담는다. priceLectureList.html
	 * 			화면으로 이동해서 타임리프 반복문으로 화면에 목록을 보여준다.
	 */ 
	@GetMapping("/priceLectureList")
	public String priceLectureList(Model model) {
		Map<String, Object> map = priceLectureService.priceLectureList();
		System.out.println(map +"<-- priceLectureController");
		model.addAttribute("list", map.get("list"));
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
		System.out.println("수강료등록화면이동");
		model.addAttribute("subjectList", priceLectureService.subjectList());
		model.addAttribute("classLevelList", priceLectureService.classLevelList());
		return "/academy/priceLecture/priceLectureInsert";
	}
	
	/* @param  /priceLectureInsert 수강료 등록 폼 입력 데이터
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 수강료 정보를 입력하고 등록을 누르면 priceLectureList화면으로 리다이렉트 한다(DB연결 전)
	 */
	@PostMapping("/priceLectureInsert")
	public String priceLectureInsert(@RequestParam(value="sub_code") String sub_code
									,@RequestParam(value="class_level_code") String class_level_code
									,PriceLecture priceLecture, HttpSession session) {
		System.out.println("수강료등록완료");
		priceLectureService.priceLectureInsert(sub_code, class_level_code, priceLecture, session);
		System.out.println(sub_code +"<- sub_code priceLectureController");
		System.out.println(class_level_code +"<- class_level_code priceLectureController");
		return "redirect:/priceLectureList";
	}
	
	/* @param  /priceLectureUpdate 수강료 수정 폼 화면
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 연필 모양 버튼을 누르면 priceLectureUpdate화면으로 이동
	 */	
	@GetMapping("/priceLectureUpdate")
	public String priceLectureUpdate() {
		
		System.out.println("수강료수정화면이동");
		return "/academy/priceLecture/priceLectureUpdate";
	}
	
	/* @param  /priceLectureUpdate 수강료 수정 폼 입력 데이터
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 수강료 정보 수정하고 수정하기 버튼을 누르면 priceLectureList화면으로 리다이렉트 한다(DB연결 전)
	 */
	@PostMapping("/priceLectureUpdate")
	public String priceLectureUpdate(Model model) {
		System.out.println("수강료수정완료");
		return "redirect:/priceLectureList";
	}
	
	/* @param  /priceLectureDelete 수강료 삭제 폼 화면
	 * @return /academy/priceLecture/priceLectureDelete.html 화면
	 * @detail 휴지통 모양 버튼을 누르면 priceLectureDelete화면으로 이동
	 */
	@GetMapping("/priceLectureDelete")
	public String priceLectureDelete() {
		
		System.out.println("수강료삭제화면이동");
		return "/academy/priceLecture/priceLectureDelete";
	}
	
	/* @param  /priceLectureDelete 수강료 삭제 폼 데이터
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 수강료 삭제 버튼을 누르면 priceLectureList화면으로 리다이렉트 한다 (DB연결 전) 
	 */
	@PostMapping("/priceLectureDelete")
	public String priceLectureDelete(Model model) {
		
		System.out.println("수강료삭제완료");
		return "redirect:/priceLectureList";
	}
	
}
