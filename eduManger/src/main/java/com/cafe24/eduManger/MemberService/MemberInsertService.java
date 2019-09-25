package com.cafe24.eduManger.MemberService;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.MemberMapper.MemberInsertMapper;
import com.cafe24.eduManger.MemberVo.Member;
import com.cafe24.eduManger.ProfessorVo.ProfesInfo;

@Service
public class MemberInsertService {
	@Autowired
	private MemberInsertMapper memberInsertMapper;
	
	//맴버 insert
		public int masterInsert(Member member) {		
			return memberInsertMapper.masterInsert(member);
		}
		
		public Map<String, Object> professorInsert(ProfesInfo profesInfo, HttpSession session) {			
			Map<String, Object> map = new HashMap<String, Object>();			
			//코드 자동증가
			int count = memberInsertMapper.professorMaxCount() + 1;
			String tempCode = "idprinfo_";
			profesInfo.setPrInfo_code(tempCode + count);
			//등록자 아이디
			profesInfo.setAdmin_id((String)session.getAttribute("SID"));
			
			//System.out.println(profesInfo.toString() + "<----- profesInfo.toStirng()");
			//등록자 아이디 확인
			//System.out.println(profesInfo.getM_id() + "<------profesInfo.getM_id()");
			
			map.put("profeInsert", memberInsertMapper.professorInsert(profesInfo));
			map.put("profeInfoInsert", memberInsertMapper.professorInfoInsert(profesInfo));
			return map;
		}
		
		public int studnetInsert(Member member) {
			return 0;
		}

}
