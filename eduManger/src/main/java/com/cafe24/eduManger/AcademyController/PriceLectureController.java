package com.cafe24.eduManger.AcademyController;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PriceLectureController {

	/* @param  /priceLectureList url
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 학원관리-수강료 및 할인 정보를 누르면 리턴받은 화면으로 이동한다.
	 */ 
	@GetMapping("/priceLectureList")
	public String priceLectureList() {
		
		return "/academy/priceLecture/priceLectureList";
	}
	
	/* @param  /priceLectureInsert url
	 * @return /academy/priceLecture/priceLectureInsert.html 화면
	 * @detail 수강료 등록 버튼을 누르면 수강료 등록 폼이 있는 화면으로 이동한다.
	 */
	@GetMapping("/priceLectureInsert")
	public String priceLectureInsert() {
		
		return "/academy/priceLecture/priceLectureInsert";
	}
	
	/* @param  /priceLectureInsert 수강료 등록 폼 입력 데이터
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 수강료 정보를 입력하고 등록을 누르면 리다이렉트로 priceLectureList화면으로 이동
	 */
	@PostMapping("/priceLectureInsert")
	public String priceLectureInsert(@RequestParam("priceLectureCode") String priceLectureCode
									,@RequestParam("academyCode") String academyCode
									,@RequestParam("lectureCode") String lectureCode
									,Model model) {
		
		System.out.println("수강료코드: " + priceLectureCode);
		System.out.println("학원코드: " + academyCode);
		System.out.println("강의코드: " + lectureCode);
		return "redirect:/priceLectureList";
	}
	
	/* @param  /priceLectureUpdate 수강료 수정
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 연필 모양 버튼을 누르면 priceLectureUpdate화면으로 이동
	 */	
	@GetMapping("/priceLectureUpdate")
	public String priceLectureUpdate() {
		
		return "/academy/priceLecture/priceLectureUpdate";
	}
	
	/* @param  /priceLectureUpdate 수강료 수정 폼 입력 데이터
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 수강료 정보 수정하고 수정하기 버튼을 누르면 리다이렉트로 priceLectureList화면으로 이동
	 */
	@PostMapping("/priceLectureUpdate")
	public String priceLectureUpdate(@RequestParam("priceLectureCode") String priceLectureCode) {
		
		System.out.println("수강료 코드: " + priceLectureCode);
		return "redirect:/priceLectureList";
	}
	
	/* @param  /priceLectureDelete 수강료 등록 폼 입력 데이터
	 * @return /academy/priceLecture/priceLectureDelete.html 화면
	 * @detail 휴지통 모양 버튼을 누르면 priceLectureDelete화면으로 이동
	 */
	@GetMapping("/priceLectureDelete")
	public String priceLectureDelete() {
		
		return "/academy/priceLecture/priceLectureDelete";
	}
	
	/* @param  /priceLectureDelete 수강료 삭제 폼 데이터
	 * @return /academy/priceLecture/priceLectureList.html 화면
	 * @detail 수강료 삭제 버튼을 누르면 리다이렉트로 priceLectureList화면으로 이동
	 */
	@PostMapping("/priceLectureDelete")
	public String priceLectureDelete(@RequestParam("priceLectureCode") String priceLectureCode) {
		
		System.out.println("수강료 코드: " + priceLectureCode);
		return "redirect:/priceLectureList";
	}
	
}
