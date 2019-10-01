package com.cafe24.eduManger.ContractMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.ContractVo.ContractPrice;

@Mapper
public interface ContractPriceMapper {

	public List<ContractPrice> contractPriceList();
	
	public int contractPriceInsert(ContractPrice contractPrice);
	
	public ContractPrice contractPriceUpdateById(String contract_price_code);
	
	public int contractPriceUpdate(ContractPrice contractPrice);
	
	public int contractPriceDelete(String contract_price_code);
	
}
