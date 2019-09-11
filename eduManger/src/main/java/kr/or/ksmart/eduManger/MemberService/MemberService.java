package kr.or.ksmart.eduManger.MemberService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.eduManger.MemberMapper.MemberMapper;
import kr.or.ksmart.eduManger.vo.Member;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	public List<Member> getMemberList() {
		List<Member> list = memberMapper.getMemberList();
		return list;
		
	}
}
