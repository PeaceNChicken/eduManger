package com.cafe24.eduManger.ContractVo;

public class ContractPrice {

	private String contractPriceCode;
	private String memberId;
	private String contractPriceMoney;
	private String contractPriceEtc;
	private String contractPriceDate;
	
	public String getContractPriceCode() {
		return contractPriceCode;
	}
	public void setContractPriceCode(String contractPriceCode) {
		this.contractPriceCode = contractPriceCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContractPriceMoney() {
		return contractPriceMoney;
	}
	public void setContractPriceMoney(String contractPriceMoney) {
		this.contractPriceMoney = contractPriceMoney;
	}
	public String getContractPriceEtc() {
		return contractPriceEtc;
	}
	public void setContractPriceEtc(String contractPriceEtc) {
		this.contractPriceEtc = contractPriceEtc;
	}
	public String getContractPriceDate() {
		return contractPriceDate;
	}
	public void setContractPriceDate(String contractPriceDate) {
		this.contractPriceDate = contractPriceDate;
	}
	
	@Override
	public String toString() {
		return "ContractPrice [contractPriceCode=" + contractPriceCode + ", memberId=" + memberId
				+ ", contractPriceMoney=" + contractPriceMoney + ", contractPriceEtc=" + contractPriceEtc
				+ ", contractPriceDate=" + contractPriceDate + "]";
	}
	
}
