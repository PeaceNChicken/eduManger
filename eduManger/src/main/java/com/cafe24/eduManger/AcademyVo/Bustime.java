package com.cafe24.eduManger.AcademyVo;

public class Bustime {

	private String bus_time_code;
	private String member_id;
	private String ac_code;
	private String bus_A_time;
	private String bus_B_time;
	private String car_info;
	private String bus_station;
	private String bus_day;
	private String bus_time_date;
	
	public String getBus_time_code() {
		return bus_time_code;
	}
	public void setBus_time_code(String bus_time_code) {
		this.bus_time_code = bus_time_code;
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
	public String getBus_A_time() {
		return bus_A_time;
	}
	public void setBus_A_time(String bus_A_time) {
		this.bus_A_time = bus_A_time;
	}
	public String getBus_B_time() {
		return bus_B_time;
	}
	public void setBus_B_time(String bus_B_time) {
		this.bus_B_time = bus_B_time;
	}
	public String getCar_info() {
		return car_info;
	}
	public void setCar_info(String car_info) {
		this.car_info = car_info;
	}
	public String getBus_station() {
		return bus_station;
	}
	public void setBus_station(String bus_station) {
		this.bus_station = bus_station;
	}
	public String getBus_day() {
		return bus_day;
	}
	public void setBus_day(String bus_day) {
		this.bus_day = bus_day;
	}
	public String getBus_time_date() {
		return bus_time_date;
	}
	public void setBus_time_date(String bus_time_date) {
		this.bus_time_date = bus_time_date;
	}
	@Override
	public String toString() {
		return "Bustime [bus_time_code=" + bus_time_code + ", member_id=" + member_id + ", ac_code=" + ac_code
				+ ", bus_A_time=" + bus_A_time + ", bus_B_time=" + bus_B_time + ", car_info=" + car_info
				+ ", bus_station=" + bus_station + ", bus_day=" + bus_day + ", bus_time_date=" + bus_time_date + "]";
	}
	
	
}
