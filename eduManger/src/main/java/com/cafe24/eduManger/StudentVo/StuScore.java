package com.cafe24.eduManger.StudentVo;

public class StuScore {

	private String stu_score_code;
	private String ac_code;
	private String stu_id;
	private String subject_code;
	private String m_id;
	private String test_season;
	private String test_cate;
	private String test_score;
	private String test_level;
	private String test_date;
	private String stu_score_date;
	
	
	public String getStu_score_code() {
		return stu_score_code;
	}
	public void setStu_score_code(String stu_score_code) {
		this.stu_score_code = stu_score_code;
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
	public String getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getTest_season() {
		return test_season;
	}
	public void setTest_season(String test_season) {
		this.test_season = test_season;
	}
	public String getTest_cate() {
		return test_cate;
	}
	public void setTest_cate(String test_cate) {
		this.test_cate = test_cate;
	}
	public String getTest_score() {
		return test_score;
	}
	public void setTest_score(String test_score) {
		this.test_score = test_score;
	}
	public String getTest_level() {
		return test_level;
	}
	public void setTest_level(String test_level) {
		this.test_level = test_level;
	}
	public String getTest_date() {
		return test_date;
	}
	public void setTest_date(String test_date) {
		this.test_date = test_date;
	}
	public String getStu_score_date() {
		return stu_score_date;
	}
	public void setStu_score_date(String stu_score_date) {
		this.stu_score_date = stu_score_date;
	}
	
	
	@Override
	public String toString() {
		return "StuScore [stu_score_code=" + stu_score_code + ", ac_code=" + ac_code + ", stu_id=" + stu_id
				+ ", subject_code=" + subject_code + ", m_id=" + m_id + ", test_season=" + test_season + ", test_cate="
				+ test_cate + ", test_score=" + test_score + ", test_level=" + test_level + ", test_date=" + test_date
				+ ", stu_score_date=" + stu_score_date + "]";
	}
	
	
	
}
