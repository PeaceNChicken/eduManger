package com.cafe24.eduManger.ContractMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.ContractVo.Contract;

@Mapper
public interface ContractMapper {

	public List<Contract> contractList();
	
	public int contractInsert(Contract contract);
	
	public Contract contractUpdateById(String contract_code);
	
	public int contractUpdate(Contract contract);
	
	public int contractDelete(String contract_code);
}
