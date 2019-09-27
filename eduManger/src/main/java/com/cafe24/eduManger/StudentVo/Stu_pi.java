package com.cafe24.eduManger.StudentVo;

import com.cafe24.eduManger.MemberVo.Member;

public class Stu_pi extends Member{
	
	private String stu_info_code;
	private String ac_code;
	private String stu_id;
	private String admin_id;
	private String drive_code;
	private String stu_school;
	private String parents_phone;
	private String stu_brother;
	private String stu_info_etc;
	
	public String getStu_info_code() {
		return stu_info_code;
	}
	public void setStu_info_code(String stu_info_code) {
		this.stu_info_code = stu_info_code;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getDrive_code() {
		return drive_code;
	}
	public void setDrive_code(String drive_code) {
		this.drive_code = drive_code;
	}
	public String getStu_school() {
		return stu_school;
	}
	public void setStu_school(String stu_school) {
		this.stu_school = stu_school;
	}
	public String getParents_phone() {
		return parents_phone;
	}
	public void setParents_phone(String parents_phone) {
		this.parents_phone = parents_phone;
	}
	public String getStu_brother() {
		return stu_brother;
	}
	public void setStu_brother(String stu_brother) {
		this.stu_brother = stu_brother;
	}
	public String getStu_info_etc() {
		return stu_info_etc;
	}
	public void setStu_info_etc(String stu_info_etc) {
		this.stu_info_etc = stu_info_etc;
	}
	
	@Override
	public String toString() {
		return "Stu_pi [stu_info_code=" + stu_info_code + ", ac_code=" + ac_code + ", stu_id=" + stu_id + ", admin_id="
				+ admin_id + ", drive_code=" + drive_code + ", stu_school=" + stu_school + ", parents_phone="
				+ parents_phone + ", stu_brother=" + stu_brother + ", stu_info_etc=" + stu_info_etc + "]";
	}
	
	
	
	
	

}
