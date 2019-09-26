package com.cafe24.eduManger.ContractVo;

public class ContractAcademy {

	private String ac_code;
	private String ac_name;
	private String ac_location;
	private String ac_phone;
	private String ac_date;
	private String member_id;
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public String getAc_location() {
		return ac_location;
	}
	public void setAc_location(String ac_location) {
		this.ac_location = ac_location;
	}
	public String getAc_phone() {
		return ac_phone;
	}
	public void setAc_phone(String ac_phone) {
		this.ac_phone = ac_phone;
	}
	public String getAc_date() {
		return ac_date;
	}
	public void setAc_date(String ac_date) {
		this.ac_date = ac_date;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	@Override
	public String toString() {
		return "ContractAcademy [ac_code=" + ac_code + ", ac_name=" + ac_name + ", ac_location=" + ac_location
				+ ", ac_phone=" + ac_phone + ", ac_date=" + ac_date + ", member_id=" + member_id + "]";
	}
	
	
}
