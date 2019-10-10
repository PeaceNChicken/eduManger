package com.cafe24.eduManger.ProfessorMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.eduManger.ProfessorVo.ProfesCar;

@Mapper
public interface ProfesCarMapper {

	public List<ProfesCar> ProfesCarList();
	
	
}
