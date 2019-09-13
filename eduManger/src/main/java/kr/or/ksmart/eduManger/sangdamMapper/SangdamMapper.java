package kr.or.ksmart.eduManger.sangdamMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.sangdamVo.Sangdam;

@Mapper
public interface SangdamMapper {

	public List<Sangdam> getSangdamList();
}
