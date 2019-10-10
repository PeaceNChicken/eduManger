package com.cafe24.eduManger.ProfessorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import com.cafe24.eduManger.ProfessorMapper.ProfesCarMapper;
import com.cafe24.eduManger.ProfessorVo.ProfesCar;

@Service
public class ProfesCarService {
	
	@Autowired
		private ProfesCarMapper ProfesCarMapper;
	
	public List<ProfesCar> ProfesCarList() {
	List<ProfesCar> ProfesCarList = ProfesCarMapper.ProfesCarList();
	System.out.println(ProfesCarList + " <--com.cafe24.eduManger.ProfessorService.ProfesCarService.ProfesCarList()");
	return ProfesCarList;
	}

}
