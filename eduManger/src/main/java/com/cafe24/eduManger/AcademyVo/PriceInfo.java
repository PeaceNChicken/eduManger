package com.cafe24.eduManger.AcademyVo;

public class PriceInfo {

	private String price_info_code;
	private String ac_code;
	private String member_id;
	private String lecture_code;
	private String member_id2;
	private String price_list_code;
	private String book_code;
	private String discount_code;
	private String price_info_desc;
	private String price_info_date;
	
	public String getPrice_info_code() {
		return price_info_code;
	}
	public void setPrice_info_code(String price_info_code) {
		this.price_info_code = price_info_code;
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
	public String getLecture_code() {
		return lecture_code;
	}
	public void setLecture_code(String lecture_code) {
		this.lecture_code = lecture_code;
	}
	public String getMember_id2() {
		return member_id2;
	}
	public void setMember_id2(String member_id2) {
		this.member_id2 = member_id2;
	}
	public String getPrice_list_code() {
		return price_list_code;
	}
	public void setPrice_list_code(String price_list_code) {
		this.price_list_code = price_list_code;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getDiscount_code() {
		return discount_code;
	}
	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
	public String getPrice_info_desc() {
		return price_info_desc;
	}
	public void setPrice_info_desc(String price_info_desc) {
		this.price_info_desc = price_info_desc;
	}
	public String getPrice_info_date() {
		return price_info_date;
	}
	public void setPrice_info_date(String price_info_date) {
		this.price_info_date = price_info_date;
	}
	@Override
	public String toString() {
		return "PriceInfo [price_info_code=" + price_info_code + ", ac_code=" + ac_code + ", member_id=" + member_id
				+ ", lecture_code=" + lecture_code + ", member_id2=" + member_id2 + ", price_list_code="
				+ price_list_code + ", book_code=" + book_code + ", discount_code=" + discount_code
				+ ", price_info_desc=" + price_info_desc + ", price_info_date=" + price_info_date + "]";
	}
	
}
