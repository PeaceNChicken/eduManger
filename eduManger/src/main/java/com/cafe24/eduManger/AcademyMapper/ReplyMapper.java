package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.Reply;

@Mapper
public interface ReplyMapper {

	public List<Reply> getReply();
}
