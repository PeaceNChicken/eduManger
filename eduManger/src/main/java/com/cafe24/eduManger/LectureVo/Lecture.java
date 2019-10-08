package com.cafe24.eduManger.LectureVo;

public class Lecture {

	private String lec_code;
	private String ac_code;
	private String m_id;
	private String room_code;
	private String mem_id;
	private String sub_code;
	private String clle_code;
	private String lec_stu_num;
	private String lec_start;
	private String lec_end;
	private String lec_date;
	
	
	public String getLec_code() {
		return lec_code;
	}
	public void setLec_code(String lec_code) {
		this.lec_code = lec_code;
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
	public String getRoom_code() {
		return room_code;
	}
	public void setRoom_code(String room_code) {
		this.room_code = room_code;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getSub_code() {
		return sub_code;
	}
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}
	public String getClle_code() {
		return clle_code;
	}
	public void setClle_code(String clle_code) {
		this.clle_code = clle_code;
	}
	public String getLec_stu_num() {
		return lec_stu_num;
	}
	public void setLec_stu_num(String lec_stu_num) {
		this.lec_stu_num = lec_stu_num;
	}
	public String getLec_start() {
		return lec_start;
	}
	public void setLec_start(String lec_start) {
		this.lec_start = lec_start;
	}
	public String getLec_end() {
		return lec_end;
	}
	public void setLec_end(String lec_end) {
		this.lec_end = lec_end;
	}
	public String getLec_date() {
		return lec_date;
	}
	public void setLec_date(String lec_date) {
		this.lec_date = lec_date;
	}
	
	
	
	@Override
	public String toString() {
		return "Lecture [lec_code=" + lec_code + ", ac_code=" + ac_code + ", m_id=" + m_id + ", room_code=" + room_code
				+ ", mem_id=" + mem_id + ", sub_code=" + sub_code + ", clle_code=" + clle_code
				+ ", lec_stu_num=" + lec_stu_num + ", lec_start=" + lec_start + ", lec_end=" + lec_end + ", lec_date="
				+ lec_date + "]";
	}
	

	
	
}
