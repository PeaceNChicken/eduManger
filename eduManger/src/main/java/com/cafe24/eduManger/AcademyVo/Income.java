package com.cafe24.eduManger.AcademyVo;

public class Income {

	private String income_code;
	private String ac_code;
	private String member_id;
	private String price_list_code;
	private String lecture_code;
	private String discount_code;
	private String member_id2;
	private String income_cate;
	private int income_pay;
	private int income_unpay;
	private String income_date;
	
	public String getIncome_code() {
		return income_code;
	}
	public void setIncome_code(String income_code) {
		this.income_code = income_code;
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
	public String getPrice_list_code() {
		return price_list_code;
	}
	public void setPrice_list_code(String price_list_code) {
		this.price_list_code = price_list_code;
	}
	public String getLecture_code() {
		return lecture_code;
	}
	public void setLecture_code(String lecture_code) {
		this.lecture_code = lecture_code;
	}
	public String getDiscount_code() {
		return discount_code;
	}
	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
	public String getMember_id2() {
		return member_id2;
	}
	public void setMember_id2(String member_id2) {
		this.member_id2 = member_id2;
	}
	public String getIncome_cate() {
		return income_cate;
	}
	public void setIncome_cate(String income_cate) {
		this.income_cate = income_cate;
	}
	public int getIncome_pay() {
		return income_pay;
	}
	public void setIncome_pay(int income_pay) {
		this.income_pay = income_pay;
	}
	public int getIncome_unpay() {
		return income_unpay;
	}
	public void setIncome_unpay(int income_unpay) {
		this.income_unpay = income_unpay;
	}
	public String getIncome_date() {
		return income_date;
	}
	public void setIncome_date(String income_date) {
		this.income_date = income_date;
	}
	@Override
	public String toString() {
		return "Income [income_code=" + income_code + ", ac_code=" + ac_code + ", member_id=" + member_id
				+ ", price_list_code=" + price_list_code + ", lecture_code=" + lecture_code + ", discount_code="
				+ discount_code + ", member_id2=" + member_id2 + ", income_cate=" + income_cate + ", income_pay="
				+ income_pay + ", income_unpay=" + income_unpay + ", income_date=" + income_date + "]";
	}
	
}
