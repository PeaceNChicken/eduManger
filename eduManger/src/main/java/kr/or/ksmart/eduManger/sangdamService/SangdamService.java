package kr.or.ksmart.eduManger.sangdamService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ksmart.eduManger.sangdamMapper.SangdamMapper;
import kr.or.ksmart.eduManger.sangdamVo.Sangdam;

@Service
@Transactional
public class SangdamService {
	@Autowired SangdamMapper sangdamMapper;
	
	public List<Sangdam> getSangdamList(){
		System.out.println(sangdamMapper.getSangdamList() + "<-- SangdamService.java");
		return sangdamMapper.getSangdamList();
	}
}
