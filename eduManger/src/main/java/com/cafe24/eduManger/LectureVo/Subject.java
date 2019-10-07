package com.cafe24.eduManger.LectureVo;
//vo
public class Subject {
	
	private String sub_code;
	private String ac_code;
	private String m_id;
	private String sub_name;
	private String sub_date;
	
	
	public String getSub_code() {
		return sub_code;
	}
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
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
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public String getSub_date() {
		return sub_date;
	}
	public void setSub_date(String sub_date) {
		this.sub_date = sub_date;
	}
	
	@Override
	public String toString() {
		return "Lecture [sub_code=" + sub_code + ", ac_code=" + ac_code + ", m_id=" + m_id + ", sub_name=" + sub_name
				+ ", sub_date=" + sub_date + "]";
	}
	
	
	
	
}
