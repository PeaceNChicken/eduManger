package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.PriceLectureMapper;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.AcademyVo.PriceLectureList;
import com.cafe24.eduManger.LectureVo.ClassLevel;
import com.cafe24.eduManger.LectureVo.Subject;

import groovy.transform.builder.InitializerStrategy.SET;

@Service
@Transactional
public class PriceLectureService {

	@Autowired private PriceLectureMapper priceLectureMapper;
	
	/* @param  	controller단에서 요청된 priceLectureList() 호출
	 * @return 	priceLectureMapper.priceLectureList() 실행결과를 담은 map객체
	 * @detail 	controller단에서 priceLectureList() 실행 요청받으면 수강료 목록을 map 타입 변수로 controller단에 리턴시켜주기 위해
	 * 			Map<String, Object> 로 타입 선언해주고 priceLectureList() 실행한다.
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 priceLectureMapper.priceLectureList() 메서드 호출하고 
	 * 			실행결과로 리턴받은 목록을 List 데이터 타입으로 선언한 pList 변수에 담는다.
	 * 			그리고 생성된 map 변수에 list라고 이름표를 붙여 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public Map<String, Object> priceLectureList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<PriceLectureList> plist = priceLectureMapper.priceLectureList();
		//System.out.println(plist +"<- list PriceLectureService");
		map.put("list", plist);
		return map;
	}
	//insert 화면에 과목 목록 select바를 위해 선언한 메서드
	public List<Subject> subjectList(){
		return priceLectureMapper.subjectList();
	}
	//insert 화면에 학년 및 수업과정 select바를 위해 선언한 메서드	
	public List<ClassLevel> classLevelList(){
		return priceLectureMapper.classLevelList();
	}
	/* @param  	PriceLecture 객체 타입 데이터, 과목코드, 학년 및 수업과정 분류 코드, session에 담겨있는 데이터
	 * @return 	priceLectureMapper.priceLectureInsert(priceLecture) 실행결과(정수값)
	 * @detail 	수강료 등록화면에서 추가하기 버튼을 눌러 controller단에 매개변수에 담긴 값들이 전달되고 그 값들을 service단에서
	 * 			priceLectureInsert() 메서드에 매개변수로 담아서 호출한다. insert 쿼리문 추가 결과값은 정수로 표현되기에 
	 * 			int 타입으로 선언하여 메서드 실행할 때 수강료코드는 자동증가되도록 count 변수에 자동증가값을 선언해주고 수강료 코드의
	 * 			priceList라는 문자열과 결합하여 수강료 코드에 세팅해준다. 학원코드와 등록자아이디는 session영역에 담아놓은 
	 * 			학원코드값과 아이디값을 가져와 세팅해준다. 강의코드는 등록화면에서 과목명과 학년 및 수업과정을 선택한 결과값으로 검색쿼리문을
	 * 			실행하여  나온 강의코드 결과값을 세팅해준 후 세팅된 priceLecture 객체를  mapper 쪽에 priceLectureInsert()
	 * 			메서드에 매개변수로 담아서 호출한다. 그리고 mapper에서 메서드 실행된 결과값을 controller단에 리턴시켜준다.
	 */
	public int priceLectureInsert(String sub_code, String class_level_code, PriceLecture priceLecture, HttpSession session) {
		//수강료코드 자동증가
		int count = priceLectureMapper.priceLectureMaxCount() + 1;
		String priceList = "priceList";
		priceLecture.setPrice_list_code(priceList + count);
		//학원코드
		priceLecture.setAc_code((String)session.getAttribute("SACODE"));
		//등록자 아이디
		priceLecture.setMember_id((String)session.getAttribute("SID"));
		//강의코드
		String lectCode = priceLectureMapper.getLectureCode(sub_code, class_level_code);
		priceLecture.setLecture_code(lectCode);
		//System.out.println(priceLecture.toString() + "<- priceLecture priceLectureService");
		return priceLectureMapper.priceLectureInsert(priceLecture);
	}
	/* @param  	priceLectureUpdateById() 호출, 수강료 코드 값 price_list_code
	 * @return 	수강료코드로 검색된 행 하나의 데이터를 보여주는 수강료 수정 화면 priceLectureUpdate.html
	 * @detail 	controller단에서 priceLectureList() 실행 요청받으면 수강료 목록을 map 타입 변수로 controller단에 리턴시켜주기 위해
	 * 			Map<String, Object> 로 타입 선언해주고 priceLectureList() 실행한다.
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 priceLectureMapper.priceLectureList() 메서드 호출하고 
	 * 			실행결과로 리턴받은 목록을 List 데이터 타입으로 선언한 pList 변수에 담는다.
	 * 			그리고 생성된 map 변수에 list라고 이름표를 붙여 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public PriceLectureList priceLectureUpdateById(String price_list_code) {
		//System.out.println(priceLectureMapper.priceLectureUpdateById(price_list_code) + "<-priceLectureUpdateById");
		return priceLectureMapper.priceLectureUpdateById(price_list_code);
	}
	
	/* @param  	priceLectureUpdate() 호출, priceLectureList 타입의 수강료 수정 폼에 입력된 데이터, session 데이터
	 * @return 	priceLectureMapper.priceLectureUpdate(priceLectureList) 실행 결과값(정수값)
	 * @detail 	controller단에서 priceLectureUpdate() 실행 요청받을 때 쿼리문 실행결과값이 정수값이기에 int로 선언하고 
	 * 			매개변수로 수정폼에 입력된 priceLectureList 타입의 데이터와 session 데이터를 받아서 메서드 실행한다. 
	 * 			이전 등록자와 현재 등록자가 다를경우 등록자아이디 데이터를 갱신해주기 위해 session에서 아이디 값을 가져와서 
	 * 			priceLectureList 매개변수에 세팅해주고 priceLectureList 객체를 매개변수로 mapper에 있는 
	 * 			priceLectureUpdate() 메서드 호출한다. 그리고나서 수정 처리 후 결과값을 controller단으로 리턴시켜준다.
	 */
	public int priceLectureUpdate(PriceLectureList priceLectureList, HttpSession session) {
		priceLectureList.setMember_id((String)session.getAttribute("SID"));//이전 등록자와 다른사람이 수정할 경우 등록자 갱신하기 위한 코드
		return priceLectureMapper.priceLectureUpdate(priceLectureList);
	}
	/* @param  	priceLectureDelete() 호출, 수강료 코드 값 price_list_code
	 * @return 	priceLectureMapper.priceLectureDelete(price_list_code) 실행 결과값(정수값)
	 * @detail 	controller단에서 매개변수로 수강료 코드값을 받아오고 쿼리문 실행결과값이 정수값이기에 int로 선언하여
	 * 			priceLectureDelete() 메서드 실행한다. mapper에 있는 priceLectureDelete()메서드 호출
	 * 			하면서 매개변수에 수강료 코드값을 담는다. 삭제 처리 후 메서드 실행결과 값을 controller단에 리턴시켜준다.
	 */
	public int priceLectureDelete(String price_list_code) {
		return priceLectureMapper.priceLectureDelete(price_list_code);
	}
}
