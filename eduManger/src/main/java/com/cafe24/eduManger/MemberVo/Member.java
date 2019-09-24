package com.cafe24.eduManger.MemberVo;

public class Member {
	
	private String m_id;
	private String ac_code;
	private String m_pw;
	private String m_level;
	private String m_name;
	private String m_gender;
	private String m_birth;
	private String m_phone;
	private String m_date;
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_level() {
		return m_level;
	}
	public void setM_level(String m_level) {
		this.m_level = m_level;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public String getM_birth() {
		return m_birth;
	}
	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	
	@Override
	public String toString() {
		return "MemberVo [m_id=" + m_id + ", ac_code=" + ac_code + ", m_pw=" + m_pw + ", m_level=" + m_level
				+ ", m_name=" + m_name + ", m_gender=" + m_gender + ", m_birth=" + m_birth + ", m_phone=" + m_phone
				+ ", m_date=" + m_date + "]";
	}
	
	

}
