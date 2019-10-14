package com.cafe24.eduManger.AcademyVo;

public class PriceInfoList {

	
	private String price_info_code;
	private String member_name; 
	private String stu_school; 
	private String subject_name;
	private String class_grade;
	private String class_course;
	private String admin_name;
	private String lecture_price;
	private String discount_cate; 
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
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
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
	public String getDiscount_cate() {
		return discount_cate;
	}
	public void setDiscount_cate(String discount_cate) {
		this.discount_cate = discount_cate;
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
				+ stu_school + ", subject_name=" + subject_name + ", class_grade=" + class_grade + ", class_course="
				+ class_course + ", admin_name=" + admin_name + ", lecture_price=" + lecture_price + ", discount_cate="
				+ discount_cate + ", price_info_desc=" + price_info_desc + ", price_info_date=" + price_info_date + "]";
	}
	
}
