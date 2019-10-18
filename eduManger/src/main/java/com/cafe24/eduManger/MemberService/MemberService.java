package com.cafe24.eduManger.MemberService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cafe24.eduManger.MemberMapper.MemberMapper;
import com.cafe24.eduManger.MemberVo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	//맴버 list
	public Map<String, Object> memberList(HttpSession session,int currentPage){
		Map<String, Object> map = new HashMap<String, Object>();
		
		String ac_code = (String)session.getAttribute("SACODE");		
		//System.out.println(ac_code + "<--- ac_code com.cafe24.eduManger.MemberService.MemberService.memberList");
		//System.out.println(memberList.toString() + "<--- com.cafe24.eduManger.MemberService.MemberService.memberList");
		
		
		//====페이징=====
		//System.out.println(currentPage + "<----currentPage");
		//한페이지에 들어갈 행
		final int ROW_PER_PAGE = 14;		
		//시작 페이지숫자
		int startPageNum = 1;		
		//끝 페이지
		int lastPageNum = ROW_PER_PAGE;
		
		//페이지가 7이 넘어갈떄 첫번째페이지 숫자,마지막페이지 숫자가 바뀜
		//현제 페이지가 7보다 커야함
		if(currentPage > (ROW_PER_PAGE/2)) {
			
			startPageNum = currentPage-(lastPageNum/2);
			
			lastPageNum += (startPageNum-1);
		}
		
		
		//시작행
		Map<String, Object> rowMap = new HashMap<String, Object>();
		int startRow = (currentPage-1)*ROW_PER_PAGE;
		//System.out.println(startRow + "<---startRow");
		rowMap.put("startRow", startRow);
		rowMap.put("lastRow", ROW_PER_PAGE);			
		rowMap.put("ac_code", ac_code);
		
		//마지막페이지
		double memberCount = memberMapper.AllListCount();		
		int lastPage = (int)(Math.ceil(memberCount/ROW_PER_PAGE));
		if(currentPage >= (lastPage-4)) {
			lastPageNum = lastPage;
		}
		
		
		map.put("memberList", memberMapper.memberList(rowMap));
		map.put("currentPage", currentPage);
		map.put("lastPage", lastPage);
		map.put("startPageNum", startPageNum);
		map.put("lastPageNum", lastPageNum);
		
		return map;
	}
			
	//맴버UpdateForm
	public Member memberUpdateForm(String m_id){
		return memberMapper.memberUpdateForm(m_id);
	}
	
	//맴버update
	public int memberUpdate(Member member) {
		return memberMapper.memberUpdate(member);
	}
	
	//맴버 delete
	public int memberDelete(String m_id) {
		return memberMapper.memberDelete(m_id);
	}
	
	//맴버 Search
	public Map<String,Object> memberSearch(String sk, String sv,int currentPage){	
		Map<String, Object> map = new HashMap<String, Object>();
		
		final int ROW_PER_PAGE = 14;		
		int startPageNum = 1;		
		int lastPageNum = ROW_PER_PAGE;
		
		//페이지변경
		if(currentPage > (ROW_PER_PAGE/2)) {
			
			startPageNum = currentPage-(lastPageNum/2);
			
			lastPageNum += (startPageNum-1);
		}
		
		//행설정
		Map<String,Object> rowMap = new HashMap<String,Object>();
		//첫번째행
		int startRow = (currentPage-1)*ROW_PER_PAGE;
		rowMap.put("startRow", startRow);
		//보여줄행
		rowMap.put("lastRow", ROW_PER_PAGE);
		rowMap.put("sk", sk);
		rowMap.put("sv", sv);
		
		//마지막페이지
		double searchCount = memberMapper.SearchListCount();
		int lastPage = (int)(Math.ceil(searchCount/ROW_PER_PAGE));
		if(currentPage >= (lastPage-4)) {
			lastPageNum = lastPage;
		}
		
		map.put("memberSearchList", memberMapper.memberSearch(rowMap));
		map.put("currentPage", currentPage);
		map.put("lastPage", lastPage);
		map.put("startPageNum", startPageNum);
		map.put("lastPageNum", lastPageNum);
		
		return map;
	}

	
	
}
