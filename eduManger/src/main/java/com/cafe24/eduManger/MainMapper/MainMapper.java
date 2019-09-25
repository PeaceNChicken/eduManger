package com.cafe24.eduManger.MainMapper;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.MemberVo.Member;

@Mapper
public interface MainMapper {
	
	public Member login(Member member);

}
