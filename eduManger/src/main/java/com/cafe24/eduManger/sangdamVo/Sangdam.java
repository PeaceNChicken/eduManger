package com.cafe24.eduManger.sangdamVo;

public class Sangdam {

	private String sd_code;
	private String sd_ac;
	private String sd_id;
	private String sd_adId;
	private String sd_cate;
	private String sd_desc;
	private String sd_date;
	
	public String getSd_code() {
		return sd_code;
	}
	public void setSd_code(String sd_code) {
		this.sd_code = sd_code;
	}
	public String getSd_ac() {
		return sd_ac;
	}
	public void setSd_ac(String sd_ac) {
		this.sd_ac = sd_ac;
	}
	public String getSd_id() {
		return sd_id;
	}
	public void setSd_id(String sd_id) {
		this.sd_id = sd_id;
	}
	public String getSd_adId() {
		return sd_adId;
	}
	public void setSd_adId(String sd_adId) {
		this.sd_adId = sd_adId;
	}
	public String getSd_cate() {
		return sd_cate;
	}
	public void setSd_cate(String sd_cate) {
		this.sd_cate = sd_cate;
	}
	public String getSd_desc() {
		return sd_desc;
	}
	public void setSd_desc(String sd_desc) {
		this.sd_desc = sd_desc;
	}
	public String getSd_date() {
		return sd_date;
	}
	public void setSd_date(String sd_date) {
		this.sd_date = sd_date;
	}
	@Override
	public String toString() {
		return "Sangdam [sd_code=" + sd_code + ", sd_ac=" + sd_ac + ", sd_id=" + sd_id + ", sd_adId=" + sd_adId
				+ ", sd_cate=" + sd_cate + ", sd_desc=" + sd_desc + ", sd_date=" + sd_date + "]";
	}
	
}
