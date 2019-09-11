package kr.or.ksmart.eduManger.MemberMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.vo.Member;

@Mapper
public interface MemberMapper {

	public List<Member> getMemberList();
}
