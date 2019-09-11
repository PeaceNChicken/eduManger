package kr.or.ksmart.eduManger.sangdam.vo;

public class Sangdam {

	private String acCode;
	private String acName;
	private String acBranch;
	private String acPhone;
	private String acDate;
	private String mId;
	
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
	public String getAcBranch() {
		return acBranch;
	}
	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
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
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	@Override
	public String toString() {
		return "sangdam [acCode=" + acCode + ", acName=" + acName + ", acBranch=" + acBranch + ", acPhone=" + acPhone
				+ ", acDate=" + acDate + ", mId=" + mId + "]";
	}
	
	
}
