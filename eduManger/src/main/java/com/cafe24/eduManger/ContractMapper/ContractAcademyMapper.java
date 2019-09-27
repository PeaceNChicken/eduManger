package com.cafe24.eduManger.ContractMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.ContractVo.ContractAcademy;

@Mapper
public interface ContractAcademyMapper {

	public List<ContractAcademy> contractAcademyList();
	
	public int contractAcademyInsert(ContractAcademy contractAcademy);
}
