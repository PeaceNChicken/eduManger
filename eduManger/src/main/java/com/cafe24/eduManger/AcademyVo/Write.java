package com.cafe24.eduManger.AcademyVo;

public class Write {
	 
	private String write_code;
	private String ac_code;
	private String member_id;
	private String board_code;
	private String write_content;
	private String write_date;
	public String getWrite_code() {
		return write_code;
	}
	public void setWrite_code(String write_code) {
		this.write_code = write_code;
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
	public String getBoard_code() {
		return board_code;
	}
	public void setBoard_code(String board_code) {
		this.board_code = board_code;
	}
	public String getWrite_content() {
		return write_content;
	}
	public void setWrite_content(String write_content) {
		this.write_content = write_content;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	@Override
	public String toString() {
		return "Write [write_code=" + write_code + ", ac_code=" + ac_code + ", member_id=" + member_id + ", board_code="
				+ board_code + ", write_content=" + write_content + ", write_date=" + write_date + "]";
	}
	
	
}
