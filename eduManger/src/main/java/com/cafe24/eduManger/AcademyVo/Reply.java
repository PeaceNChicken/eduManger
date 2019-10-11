package com.cafe24.eduManger.AcademyVo;

public class Reply {

	private String reply_code;
	private String ac_code;
	private String board_code;
	private String member_id;
	private String reply_content;
	private int reply_count;
	private String reply_date;
	public String getReply_code() {
		return reply_code;
	}
	public void setReply_code(String reply_code) {
		this.reply_code = reply_code;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getBoard_code() {
		return board_code;
	}
	public void setBoard_code(String board_code) {
		this.board_code = board_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public int getReply_count() {
		return reply_count;
	}
	public void setReply_count(int reply_count) {
		this.reply_count = reply_count;
	}
	public String getReply_date() {
		return reply_date;
	}
	public void setReply_date(String reply_date) {
		this.reply_date = reply_date;
	}
	@Override
	public String toString() {
		return "Reply [reply_code=" + reply_code + ", ac_code=" + ac_code + ", board_code=" + board_code
				+ ", member_id=" + member_id + ", reply_content=" + reply_content + ", reply_count=" + reply_count
				+ ", reply_date=" + reply_date + "]";
	}
	
	
}
