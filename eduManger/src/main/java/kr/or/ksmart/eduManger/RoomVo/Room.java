package kr.or.ksmart.eduManger.RoomVo;

public class Room {

	private String roomCode;
	private int roomNum;
	private String roomSpot;
	private String roomDate;
	private String acade_code;
	private String wrCode;
	
	public String getRoomCode() {
		return roomCode;
	}
	
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomSpot() {
		return roomSpot;
	}
	public void setRoomSpot(String roomSpot) {
		this.roomSpot = roomSpot;
	}
	public String getRoomDate() {
		return roomDate;
	}
	public void setRoomDate(String roomDate) {
		this.roomDate = roomDate;
	}
	public String getAcade_code() {
		return acade_code;
	}
	public void setAcade_code(String acade_code) {
		this.acade_code = acade_code;
	}
	public String getWrCode() {
		return wrCode;
	}
	public void setWrCode(String wrCode) {
		this.wrCode = wrCode;
	}
	@Override
	public String toString() {
		return "roomVo [roomCode=" + roomCode + ", roomNum=" + roomNum + ", roomSpot=" + roomSpot + ", roomDate="
				+ roomDate + ", acade_code=" + acade_code + ", wrCode=" + wrCode + "]";
	}
}