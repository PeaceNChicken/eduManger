package com.cafe24.eduManger.StudentVo;

import com.cafe24.eduManger.MemberVo.Member;

public class StuCounsel extends Member{
	
	private String stu_counsel_code;
	private String admin_id;
	private String counsel_title;
	private String counsel_cate;
	private String counsel_desc;
	private String counsel_date;
	private String counsel_etc;
	
	public String getStu_counsel_code() {
		return stu_counsel_code;
	}
	public void setStu_counsel_code(String stu_counsel_code) {
		this.stu_counsel_code = stu_counsel_code;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getCounsel_title() {
		return counsel_title;
	}
	public void setCounsel_title(String counsel_title) {
		this.counsel_title = counsel_title;
	}
	public String getCounsel_cate() {
		return counsel_cate;
	}
	public void setCounsel_cate(String counsel_cate) {
		this.counsel_cate = counsel_cate;
	}
	public String getCounsel_desc() {
		return counsel_desc;
	}
	public void setCounsel_desc(String counsel_desc) {
		this.counsel_desc = counsel_desc;
	}
	public String getCounsel_date() {
		return counsel_date;
	}
	public void setCounsel_date(String counsel_date) {
		this.counsel_date = counsel_date;
	}
	public String getCounsel_etc() {
		return counsel_etc;
	}
	public void setCounsel_etc(String counsel_etc) {
		this.counsel_etc = counsel_etc;
	}
	
	@Override
	public String toString() {
		return "StuCounsel [stu_counsel_code=" + stu_counsel_code + ", admin_id=" + admin_id + ", counsel_title="
				+ counsel_title + ", counsel_cate=" + counsel_cate + ", counsel_desc=" + counsel_desc
				+ ", counsel_date=" + counsel_date + ", counsel_etc=" + counsel_etc + "]";
	}
	
	
	
	
}
