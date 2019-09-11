package kr.or.ksmart.eduManger.sangdam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.sangdam.vo.Sangdam;

@Mapper
public interface SangdamMapper {

	public List<Sangdam> getSangdamList();
}
