package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.cafe24.eduManger.AcademyMapper.DiscountMapper;
import com.cafe24.eduManger.AcademyVo.Discount;

@Service
@Transactional
public class DiscountService {

	@Autowired private DiscountMapper discountMapper;
	/* @param  	controller단에서 요청된 priceLectureList() 호출
	 * @return 	discountMapper.discountList() 실행결과를 담은 map객체
	 * @detail 	controller단에서 priceLectureList() 실행 요청받으면 할인 목록을 map 타입 변수로 controller단에
	 * 			리턴시켜주기 위해	Map<String, Object> 로 타입 선언해주고 discountList() 실행한다.
	 * 			새로운 map 객체참조변수를 선언해준 다음 mapper쪽에 있는 discountMapper.discountList() 메서드 호출하고 
	 * 			실행결과로 리턴받은 목록을 List 데이터 타입으로 선언한 list 변수에 담는다.
	 * 			그리고 생성된 map 변수에 dList라고 이름표를 붙여 결과값을 담아 controller단에 리턴시켜준다.
	 */
	public Map<String, Object> discountList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Discount> list = discountMapper.discountList();
		//System.out.println(discountMapper.discountList());
		map.put("dList", list);
		return map;
	}
	/* @param  	Discount 객체 타입 데이터, session에 담겨있는 데이터
	 * @return 	discountMapper.discountInsert(discount) 실행결과(정수값)
	 * @detail 	할인 입력 화면에서 추가하기 버튼을 누르면 controller단에 매개변수에 담긴 값들이 전달되고 그 값들을 service단에서
	 * 			discountInsert() 메서드에 매개변수로 담아서 호출한다. insert 쿼리문 추가 결과값은 정수로 표현되기에 
	 * 			int 타입으로 선언하여 메서드 실행할 때 할인 코드는 자동증가되도록 count 변수에 자동증가값을 선언해주고 할인 코드의
	 * 			discount 라는 문자열과 결합하여 할인 코드에 세팅해준다. 학원코드와 등록자아이디는 session영역에 담아놓은 
	 * 			학원코드값과 아이디값을 가져와 세팅해준다. 세팅된 Discount 타입 데이터를 discount 객체에 담고
	 * 			mapper 클래스 내 discountInsert() 메서드에 매개변수로 전달하여 호출한다. 
	 * 			그리고 메서드 실행된 결과값을 controller단에 리턴시켜준다.
	 */
	public int discountInsert(Discount discount, HttpSession session) {
		//할인코드 자동증가
		int count = discountMapper.discountMaxCount() + 1;
		String discountCode = "discount";
		discount.setDiscount_code(discountCode + count);
		//학원코드
		discount.setAc_code((String)session.getAttribute("SACODE"));
		//등록자아이디
		discount.setMember_id((String)session.getAttribute("SID"));
		//System.out.println(discount);
		return discountMapper.discountInsert(discount);
	}
	/* @param  	할인 코드 값 discountCode
	 * @return 	discountMapper.discountUpdateById(discountCode) 실행결과(행 하나)
	 * @detail	controller단에서 메서드 호출됐을 때 매개변수로 할인 코드 값을 받고 mapper에서 쿼리문 실행한 결과 값으로
	 * 			Discount 타입의 행 하나를 리턴받을 것이기에 Discount 타입으로 선언하여 메서드 실행하는데
	 * 			mapper에 있는 discountUpdateById() 메서드에 매개변수로 할인 코드 값을 담아서 호출하고
	 * 			그 결과값을 controller단에 리턴시켜준다.
	 */
	public Discount discountUpdateById(String discountCode) {		
		return discountMapper.discountUpdateById(discountCode);
	}
	/* @param  	Discount 타입의 수강료 수정 폼에 입력된 데이터, session 데이터
	 * @return 	discountMapper.discountUpdate(discount) 실행 결과값(정수값)
	 * @detail 	controller단에서 discountUpdate() 호출될 때 쿼리문 실행결과값이 정수값이기에 int로 선언하고 
	 * 			매개변수로 수정폼에 입력된 Discount 타입의 데이터와 session 데이터를 받아서 메서드 실행한다. 
	 * 			이전 등록자와 현재 등록자가 다를경우 등록자아이디 데이터를 갱신해주기 위해 session에서 아이디 값을 가져와서 
	 * 			discount 매개변수에 세팅해주고 discount 객체를 매개변수로 mapper에 있는 
	 * 			discountUpdate() 메서드 호출한다. 그리고 나서 수정 처리 후 결과값을 controller단으로 리턴시켜준다.
	 */
	public int discountUpdate(Discount discount, HttpSession session) {
		discount.setMember_id((String)session.getAttribute("SID")); //이전등록자와 다른 사람이 수정할 경우 등록자 갱신하기 위한 코드
		return discountMapper.discountUpdate(discount);
	}
	/* @param  	discountDelete() 호출, 수강료 코드 값 discountCode
	 * @return 	discountMapper.discountDelete(discountCode) 실행 결과값(정수값)
	 * @detail 	controller단에서 매개변수로 할인 코드값을 받아오고 쿼리문 실행결과값이 정수값이기에 int로 선언하여
	 * 			discountDelete() 메서드 실행한다. mapper에 있는 discountDelete()메서드 호출
	 * 			하면서 매개변수에 할인 코드값을 담는다. 삭제 처리 후 메서드 실행결과 값을 controller단에 리턴시켜준다.
	 */
	public int discountDelete(String discountCode) {
		return discountMapper.discountDelete(discountCode);
	}
}
