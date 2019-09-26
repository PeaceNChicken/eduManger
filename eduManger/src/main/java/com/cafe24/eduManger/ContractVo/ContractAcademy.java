package com.cafe24.eduManger.ContractVo;

public class ContractAcademy {

	private String acCode;
	private String acName;
	private String acLocation;
	private String acPhone;
	private String acDate;
	private String memberId;
	public String getAcCode() {
		return acCode;
	}
	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getAcLocation() {
		return acLocation;
	}
	public void setAcLocation(String acLocation) {
		this.acLocation = acLocation;
	}
	public String getAcPhone() {
		return acPhone;
	}
	public void setAcPhone(String acPhone) {
		this.acPhone = acPhone;
	}
	public String getAcDate() {
		return acDate;
	}
	public void setAcDate(String acDate) {
		this.acDate = acDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "ContractAcademy [acCode=" + acCode + ", acName=" + acName + ", acLocation=" + acLocation + ", acPhone="
				+ acPhone + ", acDate=" + acDate + ", memberId=" + memberId + "]";
	}
		
}
