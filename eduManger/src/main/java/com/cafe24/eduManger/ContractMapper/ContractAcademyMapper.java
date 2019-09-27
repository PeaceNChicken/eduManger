package com.cafe24.eduManger.ContractMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.ContractVo.ContractAcademy;

@Mapper
public interface ContractAcademyMapper {

	public List<ContractAcademy> contractAcademyList();
	
	public int contractAcademyInsert(ContractAcademy contractAcademy);
	
	public ContractAcademy contractAcademyUpdateById(String ac_code);
	
	public int contractAcademyUpdate(ContractAcademy contractAcademy);
	
	public int contractAcademyDelete(String ac_code);
	
	public int contractAcademyDelete(ContractAcademy contractAcademy);
	
}
