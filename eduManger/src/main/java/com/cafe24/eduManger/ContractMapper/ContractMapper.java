package com.cafe24.eduManger.ContractMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cafe24.eduManger.ContractVo.Contract;

@Mapper
public interface ContractMapper {

	public List<Contract> contractList();
}
