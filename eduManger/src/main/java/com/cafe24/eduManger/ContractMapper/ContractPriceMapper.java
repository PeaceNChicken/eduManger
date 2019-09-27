package com.cafe24.eduManger.ContractMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.ContractVo.ContractPrice;

@Mapper
public interface ContractPriceMapper {

	public List<ContractPrice> contractPriceList();
}
