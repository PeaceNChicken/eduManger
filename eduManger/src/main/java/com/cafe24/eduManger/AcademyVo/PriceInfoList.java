package com.cafe24.eduManger.AcademyVo;

public class PriceInfoList {

	
	private String price_info_code;
	private String member_name; 
	private String stu_school; 
	private String sub_name;
	private String sub_code;
	private String class_grade;
	private String class_course;
	private String class_level_code;
	private String admin_name;
	private String lecture_price;
	private String price_list_etc;
	private String discount_content; 
	private String discount_code; 
	private String price_info_desc; 
	private String price_info_date;
	public String getPrice_info_code() {
		return price_info_code;
	}
	public void setPrice_info_code(String price_info_code) {
		this.price_info_code = price_info_code;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getStu_school() {
		return stu_school;
	}
	public void setStu_school(String stu_school) {
		this.stu_school = stu_school;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getSub_code() {
		return sub_code;
	}
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}
	public String getClass_grade() {
		return class_grade;
	}
	public void setClass_grade(String class_grade) {
		this.class_grade = class_grade;
	}
	public String getClass_course() {
		return class_course;
	}
	public void setClass_course(String class_course) {
		this.class_course = class_course;
	}
	public String getClass_level_code() {
		return class_level_code;
	}
	public void setClass_level_code(String class_level_code) {
		this.class_level_code = class_level_code;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
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
	public String getDiscount_content() {
		return discount_content;
	}
	public void setDiscount_content(String discount_content) {
		this.discount_content = discount_content;
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
		return "PriceInfoList [price_info_code=" + price_info_code + ", member_name=" + member_name + ", stu_school="
				+ stu_school + ", sub_name=" + sub_name + ", sub_code=" + sub_code + ", class_grade=" + class_grade
				+ ", class_course=" + class_course + ", class_level_code=" + class_level_code + ", admin_name="
				+ admin_name + ", lecture_price=" + lecture_price + ", price_list_etc=" + price_list_etc
				+ ", discount_content=" + discount_content + ", discount_code=" + discount_code + ", price_info_desc="
				+ price_info_desc + ", price_info_date=" + price_info_date + "]";
	}
		
}
