package com.cafe24.eduManger.ProfessorVo;

import com.cafe24.eduManger.MemberVo.Member;

public class ProfesInfo extends Member{
	private String prInfo_code;
	private String admin_id;
	private String prInfo_subject;
	private String prInfo_edu;
	private String prInfo_date;
	
	public String getPrInfo_code() {
		return prInfo_code;
	}
	public void setPrInfo_code(String prInfo_code) {
		this.prInfo_code = prInfo_code;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getPrInfo_subject() {
		return prInfo_subject;
	}
	public void setPrInfo_subject(String prInfo_subject) {
		this.prInfo_subject = prInfo_subject;
	}
	public String getPrInfo_edu() {
		return prInfo_edu;
	}
	public void setPrInfo_edu(String prInfo_edu) {
		this.prInfo_edu = prInfo_edu;
	}
	public String getPrInfo_date() {
		return prInfo_date;
	}
	public void setPrInfo_date(String prInfo_date) {
		this.prInfo_date = prInfo_date;
	}
	
	@Override
	public String toString() {
		return "ProfesInfo [prInfo_code=" + prInfo_code + ", admin_id=" + admin_id + ", prInfo_subject="
				+ prInfo_subject + ", prInfo_edu=" + prInfo_edu + ", prInfo_date=" + prInfo_date + "]";
	}
	
	
	
}
