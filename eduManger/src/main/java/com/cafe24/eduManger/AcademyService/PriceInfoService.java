package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.eduManger.AcademyMapper.PriceInfoMapper;
import com.cafe24.eduManger.AcademyVo.PriceInfo;
import com.cafe24.eduManger.AcademyVo.PriceInfoList;
import com.cafe24.eduManger.AcademyVo.PriceLecture;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Service
@Transactional
public class PriceInfoService {
	@Autowired private PriceInfoMapper priceInfoMapper;
	/* @param  	priceInfoService.priceLectureList()
	 * @return 	학원비 납부 안내 리스트
	 * @detail 	controller에서 priceInfoList() 호출되면 리스트를 담을 Map객체타입의 변수 map을 선언하고
	 * 			PriceInfoList 타입으로 선언한 list라는 변수에 mapper의 priceInfoList()를 호출한 결과값을
	 * 			담는다. 선언해놓은 map객체에 pList라는 이름을 부여하고 list 값을 담고 map 객체를 리턴시킨다.
	 */
	public Map<String, Object> priceInfoList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<PriceInfoList> list = priceInfoMapper.priceInfoList();
		map.put("pList", list);
		return map;
	}
	/* @param  	priceInfoService.stuList(session)
	 * @return 	학원에 소속된 학생 상세정보 리스트
	 * @detail 	controller에서 stuList(HttpSession session) 메서드 호출 되면 session 영역에 남아있는 학원코드를
	 * 			받아와 String 타입으로 선언한 ac_code 변수에 담아준다. ac_code에 담긴 학원코드값을
	 * 			매개변수로 담아 mapper의 stuList(ac_code) 메서드 호출하고 결과값을 리턴시킨다.
	 */
	public List<Stu_pi> stuList(HttpSession session){
		String ac_code = (String)session.getAttribute("SACODE");
		//System.out.println(ac_code);
		return priceInfoMapper.stuList(ac_code);
	}
	
	public int lecturePrice(String subCode, String classLevelCode, String priceListEtc) {
		String lectureCode = priceInfoMapper.lectureCode(subCode, classLevelCode);
		System.out.println(lectureCode +"<- lectureCode");
		return priceInfoMapper.lecturePrice(lectureCode, priceListEtc);
	}
	//강의료 목록을 가져오기 위한 메서드
	public List<PriceLecture> priceLectureList(){
		return priceInfoMapper.priceLectureList();
	}
	//할인코드를 가져오기 위한 메서드
	public int discountCode(String discountCode) {
		return priceInfoMapper.discountCode(discountCode);
	}
	/* @param  	priceInfoList 객체 값, session 객체 값 
	 * @return 	priceInfoMapper.priceInfoInsert(priceInfo) 메서드 실행된 결과값(정수값)
	 * @detail 	controller에서 매개변수로 priceInfoList와 session 값을 전달받아 메서드 호출받으면
	 * 			납부 내역 입력에 필요한 데이터 타입인 PriceInfo 클래스 타입으로 priceInfo 변수를 새로 생성하고
	 * 			priceInfoList에 담겨있던 값들을 가공하거나 아니면 바로 생성해놓은 priceInfo 객체에 세팅한다.
	 * 			mapper 내 priceInfoInsert() 호출하면서 매개변수로 세팅한 priceInfo를 담아서 호출하고
	 * 			결과값을 controller로 리턴시킨다. 
	 */
	public int priceInfoInsert(PriceInfoList priceInfoList, HttpSession session) {
		PriceInfo priceInfo = new PriceInfo();
		String pInfo = "priceInfo";
		int count = priceInfoMapper.getPriceInfoCode() +1;
		priceInfo.setPrice_info_code(pInfo + count); //납부내역코드 세팅
		priceInfo.setAc_code((String)session.getAttribute("SACODE")); //학원코드 세팅
		String mName = priceInfoList.getMember_name();
		String sSchool = priceInfoList.getStu_school();
		priceInfo.setMember_id(priceInfoMapper.getMemberId(mName, sSchool)); //학생아이디 세팅
		String subCode = priceInfoList.getSub_code();
		String classLevelCode = priceInfoList.getClass_level_code();
		String lectureCode = priceInfoMapper.lectureCode(subCode, classLevelCode);
		priceInfo.setLecture_code(lectureCode); //강의코드 세팅
		priceInfo.setMember_id2((String)session.getAttribute("SID")); //등록자아이디 세팅
		String lecturePrice = (String)priceInfoList.getLecture_price();
		String priceListEtc = priceInfoList.getPrice_list_etc();
		priceInfo.setPrice_list_code(priceInfoMapper.GetPriceListCode(lectureCode, lecturePrice, priceListEtc)); //수강료 세팅
		priceInfo.setDiscount_code(priceInfoList.getDiscount_code()); //할인코드 세팅
		priceInfo.setPrice_info_desc(priceInfoList.getPrice_info_desc()); //할인적용된가격 세팅
		
		//System.out.println(priceInfo + "<- priceInfo service");
		
		return priceInfoMapper.priceInfoInsert(priceInfo);
	}
}
