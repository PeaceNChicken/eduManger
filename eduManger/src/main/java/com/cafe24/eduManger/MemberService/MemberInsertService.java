package com.cafe24.eduManger.MemberService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.ContractVo.ContractAcademy;
import com.cafe24.eduManger.MemberMapper.MemberInsertMapper;
import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;
import com.cafe24.eduManger.StudentVo.Stu_pi;

@Service
public class MemberInsertService {
	@Autowired
	private MemberInsertMapper memberInsertMapper;
	
	//아이디 중복 체크
		public String idDuplicateCheck(String mId) {			
			//System.out.println(memberInsertMapper.idDuplicateCheck(mId) + "<--idDuplicateCheck com.cafe24.eduManger.MemberService.MemberInsertService.idDuplicateCheck");
			return memberInsertMapper.idDuplicateCheck(mId);
		}
	
	//학원리스트
		public List<ContractAcademy> academyList(){
			return memberInsertMapper.academyList();
		}
	
	//관리자 insert
		public int masterInsert(Member member) {											
			return memberInsertMapper.masterInsert(member);
		}
		
	//강사 insert
		public Map<String, Object> professorInsert(ProfesInfo profesInfo, HttpSession session) {			
			Map<String, Object> map = new HashMap<String, Object>();			
			//코드 자동증가
			int count = memberInsertMapper.professorMaxCount() + 1;
			String tempCode = "idprinfo_";
			profesInfo.setPrInfo_code(tempCode + count);
			//등록자 아이디
			profesInfo.setAdmin_id((String)session.getAttribute("SID"));
			//학원코드
			profesInfo.setAc_code((String)session.getAttribute("SACODE"));
			
			//System.out.println(profesInfo.toString() + "<----- profesInfo.toStirng() com.cafe24.eduManger.MemberService professorInsert");
			//System.out.println(profesInfo.getM_id() + "<------profesInfo.getM_id() com.cafe24.eduManger.MemberService professorInsert");
			//System.out.println(profesInfo.getAc_code() + "<--------profesInfo.getAc_code com.cafe24.eduManger.MemberService professorInsert");
			
			map.put("profesInsert", memberInsertMapper.masterInsert(profesInfo));
			map.put("profeInfoInsert", memberInsertMapper.professorInfoInsert(profesInfo));
			return map;
		}
		
	//수강생 insert
		public Map<String, Object> studentInfoInsert(Stu_pi stuPi,HttpSession session) {
			Map<String, Object> map = new HashMap<String, Object>();
			
			int count = memberInsertMapper.studentInfoPiMaxCount() + 1;
			String tempCode = "stuInfo_";
			stuPi.setStu_info_code(tempCode + count);
			stuPi.setAdmin_id((String)session.getAttribute("SID"));
			stuPi.setAc_code((String)session.getAttribute("SACODE"));
			
			//System.out.println(stuPi.toString() + "<------- stuPi.toString MemberInsertService studentInfoInsert");
			map.put("studentInsert", memberInsertMapper.masterInsert(stuPi));
			map.put("studentInfo", memberInsertMapper.studentInfoInsert(stuPi));
			
			return map;
		}

}
