package com.cafe24.eduManger.ProfessorVo;

import com.cafe24.eduManger.MemberVo.Member;

public class ProfesCar extends Member{
	
	private String car_code;
	private String pr_id;
	private String ad_id;
	private String car_title;
	private String car_co;
	private String car_co_start;
	private String car_co_end;
	private String date;

	
	public String getCar_code() {
		return car_code;
	}
	public void setCar_code(String car_code) {
		this.car_code = car_code;
	}
	public String getPr_id() {
		return pr_id;
	}
	public void setPr_id(String pr_id) {
		this.pr_id = pr_id;
	}
	public String getAd_id() {
		return ad_id;
	}
	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}
	public String getCar_title() {
		return car_title;
	}
	public void setCar_title(String car_title) {
		this.car_title = car_title;
	}
	public String getCar_co() {
		return car_co;
	}
	public void setCar_co(String car_co) {
		this.car_co = car_co;
	}
	public String getCar_co_start() {
		return car_co_start;
	}
	public void setCar_co_start(String car_co_start) {
		this.car_co_start = car_co_start;
	}
	public String getCar_co_end() {
		return car_co_end;
	}
	public void setCar_co_end(String car_co_end) {
		this.car_co_end = car_co_end;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "ProfesCar [car_code=" + car_code + ", pr_id=" + pr_id + ", ad_id=" + ad_id + ", car_title=" + car_title
				+ ", car_co=" + car_co + ", car_co_start=" + car_co_start + ", car_co_end=" + car_co_end + ", date="
				+ date + "]";
	}
	
	
	

}
