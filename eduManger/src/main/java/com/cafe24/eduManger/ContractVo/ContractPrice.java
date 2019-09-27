package com.cafe24.eduManger.ContractVo;

public class ContractPrice {

	private String contract_price_code;
	private String member_id;
	private String contract_price_money;
	private String contract_price_etc;
	private String contract_price_date;
	
	public String getContract_price_code() {
		return contract_price_code;
	}
	public void setContract_price_code(String contract_price_code) {
		this.contract_price_code = contract_price_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getContract_price_money() {
		return contract_price_money;
	}
	public void setContract_price_money(String contract_price_money) {
		this.contract_price_money = contract_price_money;
	}
	public String getContract_price_etc() {
		return contract_price_etc;
	}
	public void setContract_price_etc(String contract_price_etc) {
		this.contract_price_etc = contract_price_etc;
	}
	public String getContract_price_date() {
		return contract_price_date;
	}
	public void setContract_price_date(String contract_price_date) {
		this.contract_price_date = contract_price_date;
	}
	@Override
	public String toString() {
		return "ContractPrice [contract_price_code=" + contract_price_code + ", member_id=" + member_id
				+ ", contract_price_money=" + contract_price_money + ", contract_price_etc=" + contract_price_etc
				+ ", contract_price_date=" + contract_price_date + "]";
	}
	
}
