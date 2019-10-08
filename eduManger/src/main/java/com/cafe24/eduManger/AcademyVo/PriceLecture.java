package com.cafe24.eduManger.AcademyVo;

public class PriceLecture {

	private String price_list_code;
	private String ac_code;
	private String lecture_code;
	private String member_id;
	private String lecture_price;
	private String price_list_etc;
	private String price_list_date;
	
	public String getPrice_list_code() {
		return price_list_code;
	}
	public void setPrice_list_code(String price_list_code) {
		this.price_list_code = price_list_code;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getLecture_code() {
		return lecture_code;
	}
	public void setLecture_code(String lecture_code) {
		this.lecture_code = lecture_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getLecture_price() {
		return lecture_price;
	}
	public void setLecture_price(String lecture_price) {
		this.lecture_price = lecture_price;
	}
	public String getPrice_list_etc() {
		return price_list_etc;
	}
	public void setPrice_list_etc(String price_list_etc) {
		this.price_list_etc = price_list_etc;
	}
	public String getPrice_list_date() {
		return price_list_date;
	}
	public void setPrice_list_date(String price_list_date) {
		this.price_list_date = price_list_date;
	}
	
	@Override
	public String toString() {
		return "PriceLecture [price_list_code=" + price_list_code + ", ac_code=" + ac_code + ", lecture_code="
				+ lecture_code + ", member_id=" + member_id + ", lecture_price=" + lecture_price + ", price_list_etc="
				+ price_list_etc + ", price_list_date=" + price_list_date + "]";
	}
}
