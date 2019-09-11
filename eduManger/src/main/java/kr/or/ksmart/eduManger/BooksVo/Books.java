package kr.or.ksmart.eduManger.BooksVo;

public class Books {
	private String book_code;
	private String book_name;
	private int book_pride;
	private String booknum_code;
	private String sbj_code;
	private String acade_code;
	private String book_date;
	private String int_id;
	
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_pride() {
		return book_pride;
	}
	public void setBook_pride(int book_pride) {
		this.book_pride = book_pride;
	}
	public String getBooknum_code() {
		return booknum_code;
	}
	public void setBooknum_code(String booknum_code) {
		this.booknum_code = booknum_code;
	}
	public String getSbj_code() {
		return sbj_code;
	}
	public void setSbj_code(String sbj_code) {
		this.sbj_code = sbj_code;
	}
	public String getAcade_code() {
		return acade_code;
	}
	public void setAcade_code(String acade_code) {
		this.acade_code = acade_code;
	}
	public String getBook_date() {
		return book_date;
	}
	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}
	public String getInt_id() {
		return int_id;
	}
	public void setInt_id(String int_id) {
		this.int_id = int_id;
	}
	@Override
	public String toString() {
		return "Books [book_code=" + book_code + ", book_name=" + book_name + ", book_pride=" + book_pride
				+ ", booknum_code=" + booknum_code + ", sbj_code=" + sbj_code + ", acade_code=" + acade_code
				+ ", book_date=" + book_date + ", int_id=" + int_id + "]";
	}
	

}
