package com.cafe24.eduManger.AcademyVo;

public class Bus {

	private String bus_code;
	private String member_id;
	private String ac_code;
	private String bus_number;
	private String bus_cate;
	private String bus_driver;
	private String bus_driver_phone;
	private String bus_num;
	private int bus_limit;
	private String bus_date;
	
	
	public String getBus_code() {
		return bus_code;
	}
	public void setBus_code(String bus_code) {
		this.bus_code = bus_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getAc_code() {
		return ac_code;
	}
	public void setAc_code(String ac_code) {
		this.ac_code = ac_code;
	}
	public String getBus_number() {
		return bus_number;
	}
	public void setBus_number(String bus_number) {
		this.bus_number = bus_number;
	}
	public String getBus_cate() {
		return bus_cate;
	}
	public void setBus_cate(String bus_cate) {
		this.bus_cate = bus_cate;
	}
	public String getBus_driver() {
		return bus_driver;
	}
	public void setBus_driver(String bus_driver) {
		this.bus_driver = bus_driver;
	}
	public String getBus_driver_phone() {
		return bus_driver_phone;
	}
	public void setBus_driver_phone(String bus_driver_phone) {
		this.bus_driver_phone = bus_driver_phone;
	}
	public String getBus_num() {
		return bus_num;
	}
	public void setBus_num(String bus_num) {
		this.bus_num = bus_num;
	}
	public int getBus_limit() {
		return bus_limit;
	}
	public void setBus_limit(int bus_limit) {
		this.bus_limit = bus_limit;
	}
	public String getBus_date() {
		return bus_date;
	}
	public void setBus_date(String bus_date) {
		this.bus_date = bus_date;
	}
	@Override
	public String toString() {
		return "Bus [bus_code=" + bus_code + ", member_id=" + member_id + ", ac_code=" + ac_code + ", bus_number="
				+ bus_number + ", bus_cate=" + bus_cate + ", bus_driver=" + bus_driver + ", bus_driver_phone="
				+ bus_driver_phone + ", bus_num=" + bus_num + ", bus_limit=" + bus_limit + ", bus_date=" + bus_date
				+ "]";
	}
	
	
	
}

