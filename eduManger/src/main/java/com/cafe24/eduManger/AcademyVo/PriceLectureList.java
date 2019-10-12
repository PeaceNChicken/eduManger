package com.cafe24.eduManger.AcademyVo;

public class PriceLectureList {

	private String price_list_code;
	private String ac_code;
	private String lecture_code;
	private String class_grade;
	private String class_course;
	private String class_level_code;
	private String subject_name;
	private String member_id;
	private String member_name;
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
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
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
		return "PriceLectureList [price_list_code=" + price_list_code + ", ac_code=" + ac_code + ", lecture_code="
				+ lecture_code + ", class_grade=" + class_grade + ", class_course=" + class_course
				+ ", class_level_code=" + class_level_code + ", subject_name=" + subject_name + ", member_id="
				+ member_id + ", member_name=" + member_name + ", lecture_price=" + lecture_price + ", price_list_etc="
				+ price_list_etc + ", price_list_date=" + price_list_date + "]";
	}
	
}
