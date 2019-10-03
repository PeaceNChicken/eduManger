package com.cafe24.eduManger.ContractVo;

public class Contract {

	private String contract_code;
	private String contract_price_code;
	private String ac_code;
	private String member_id;
	private String contract_date;
	private String contract_start;
	private String contract_end;
	private String contract_valid;
	private String contract_state;
	private int contract_price;
	private String contract_price_sys;
	private int contract_pay;
	private int contract_unpay;
	
	public String getContract_code() {
		return contract_code;
	}
	public void setContract_code(String contract_code) {
		this.contract_code = contract_code;
	}
	public String getContract_price_code() {
		return contract_price_code;
	}
	public void setContract_price_code(String contract_price_code) {
		this.contract_price_code = contract_price_code;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getContract_date() {
		return contract_date;
	}
	public void setContract_date(String contract_date) {
		this.contract_date = contract_date;
	}
	public String getContract_start() {
		return contract_start;
	}
	public void setContract_start(String contract_start) {
		this.contract_start = contract_start;
	}
	public String getContract_end() {
		return contract_end;
	}
	public void setContract_end(String contract_end) {
		this.contract_end = contract_end;
	}
	public String getContract_valid() {
		return contract_valid;
	}
	public void setContract_valid(String contract_valid) {
		this.contract_valid = contract_valid;
	}
	public String getContract_state() {
		return contract_state;
	}
	public void setContract_state(String contract_state) {
		this.contract_state = contract_state;
	}
	public int getContract_price() {
		return contract_price;
	}
	public void setContract_price(int contract_price) {
		this.contract_price = contract_price;
	}
	public String getContract_price_sys() {
		return contract_price_sys;
	}
	public void setContract_price_sys(String contract_price_sys) {
		this.contract_price_sys = contract_price_sys;
	}
	public int getContract_pay() {
		return contract_pay;
	}
	public void setContract_pay(int contract_pay) {
		this.contract_pay = contract_pay;
	}
	public int getContract_unpay() {
		return contract_unpay;
	}
	public void setContract_unpay(int contract_unpay) {
		this.contract_unpay = contract_unpay;
	}
	@Override
	public String toString() {
		return "Contract [contract_code=" + contract_code + ", contract_price_code=" + contract_price_code
				+ ", ac_code=" + ac_code + ", member_id=" + member_id + ", contract_date=" + contract_date
				+ ", contract_start=" + contract_start + ", contract_end=" + contract_end + ", contract_valid="
				+ contract_valid + ", contract_state=" + contract_state + ", contract_price=" + contract_price
				+ ", contract_price_sys=" + contract_price_sys + ", contract_pay=" + contract_pay + ", contract_unpay="
				+ contract_unpay + "]";
	}
	
}
