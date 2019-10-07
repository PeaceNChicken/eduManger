package com.cafe24.eduManger.AcademyVo;

public class Busline {

	private String line_code;
	private String ac_code;
	private String member_id;
	private String line_info;
	private String line_date;
	private String line_num;
	public String getLine_code() {
		return line_code;
	}
	public void setLine_code(String line_code) {
		this.line_code = line_code;
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
	public String getLine_info() {
		return line_info;
	}
	public void setLine_info(String line_info) {
		this.line_info = line_info;
	}
	public String getLine_date() {
		return line_date;
	}
	public void setLine_date(String line_date) {
		this.line_date = line_date;
	}
	public String getLine_num() {
		return line_num;
	}
	public void setLine_num(String line_num) {
		this.line_num = line_num;
	}
	@Override
	public String toString() {
		return "Busline [line_code=" + line_code + ", ac_code=" + ac_code + ", member_id=" + member_id + ", line_info="
				+ line_info + ", line_date=" + line_date + ", line_num=" + line_num + "]";
	}
	
	
	
}
	
