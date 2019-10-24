package com.cafe24.eduManger.AcademyVo;

public class Board {

	private String board_code;
	private String ac_code;
	private String member_id;
	private String board_cate;
	private String board_title;
	private String read_level;
	private String board_content;
	private int board_count;
	private String board_date;
	
	
	public String getBoard_code() {
		return board_code;
	}
	public void setBoard_code(String board_code) {
		this.board_code = board_code;
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
	public String getBoard_cate() {
		return board_cate;
	}
	public void setBoard_cate(String board_cate) {
		this.board_cate = board_cate;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getRead_level() {
		return read_level;
	}
	public void setRead_level(String read_level) {
		this.read_level = read_level;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	@Override
	public String toString() {
		return "Board [board_code=" + board_code + ", ac_code=" + ac_code + ", member_id=" + member_id + ", board_cate="
				+ board_cate + ", board_title=" + board_title + ", read_level=" + read_level + ", board_content="
				+ board_content + ", board_count=" + board_count + ", board_date=" + board_date + "]";
	}
}
