package com.cafe24.eduManger.AcademyMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.AcademyVo.Board;


@Mapper
public interface BoardMapper {

	public List<Board> getBoard();
	
	public Board getBoardUpdate(String board);

	public int getBoardDelete(String board);
	
	public List<Board> getBoardSearch(String sk, String sv);
}
