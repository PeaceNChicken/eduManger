package kr.or.ksmart.eduManger.sangdam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ksmart.eduManger.sangdam.mapper.SangdamMapper;
import kr.or.ksmart.eduManger.sangdam.vo.Sangdam;

@Service
@Transactional
public class SangdamService {
	@Autowired SangdamMapper sangdamMapper;
	
	public List<Sangdam> getSangdamList(){
		return sangdamMapper.getSangdamList();
	}
}
