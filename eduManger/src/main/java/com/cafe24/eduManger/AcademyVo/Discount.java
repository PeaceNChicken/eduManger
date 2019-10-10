package com.cafe24.eduManger.AcademyVo;

public class Discount {

	private String discount_code;
	private String member_id;
	private String ac_code;
	private String discount_rate;
	private String discount_content;
	private String discount_date;
	
	public String getDiscount_code() {
		return discount_code;
	}
	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getDiscount_rate() {
		return discount_rate;
	}
	public void setDiscount_rate(String discount_rate) {
		this.discount_rate = discount_rate;
	}
	public String getDiscount_content() {
		return discount_content;
	}
	public void setDiscount_content(String discount_content) {
		this.discount_content = discount_content;
	}
	public String getDiscount_date() {
		return discount_date;
	}
	public void setDiscount_date(String discount_date) {
		this.discount_date = discount_date;
	}
	@Override
	public String toString() {
		return "Discount [discount_code=" + discount_code + ", member_id=" + member_id + ", ac_code=" + ac_code
				+ ", discount_rate=" + discount_rate + ", discount_content=" + discount_content + ", discount_date="
				+ discount_date + "]";
	}
	
}
