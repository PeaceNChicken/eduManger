package com.cafe24.eduManger.LectureVo;

public class ClassLevel {

	private String class_level_code;
	private String ac_code;
	private String m_id;
	private String class_grade;
	private String class_course;
	private String class_level_date;
	
	public String getClass_level_code() {
		return class_level_code;
	}
	public void setClass_level_code(String class_level_code) {
		this.class_level_code = class_level_code;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
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
	public String getClass_level_date() {
		return class_level_date;
	}
	public void setClass_level_date(String class_level_date) {
		this.class_level_date = class_level_date;
	}
	@Override
	public String toString() {
		return "ClassLevel [class_level_code=" + class_level_code + ", ac_code=" + ac_code + ", m_id=" + m_id
				+ ", class_grade=" + class_grade + ", class_course=" + class_course + ", class_level_date="
				+ class_level_date + "]";
	}
	
}