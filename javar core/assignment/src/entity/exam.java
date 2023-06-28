package entity;

import java.time.LocalDate;

public class exam {
	public int examID;
	public String code;
	public String title;
	public categoryQuestion categoryID;
	public int duration;
	public Account Creator;
	public LocalDate createDate;
	@Override
	public String toString() {
		return "Exam [examID=" + examID + ", code=" + code + ", title=" + title + ", categoryID=" + categoryID
				+ ", duration=" + duration + ", Creator=" + Creator + ", createDate=" + createDate + "]";
	}
	
	public exam () {
		
	}
	public exam (int examID, String title, LocalDate createDate) {
		this.examID = examID;
		this.title = title;
		this.createDate = createDate;
	}
	public exam (String title, LocalDate createDate) {
		this.title = title;
		this.createDate = createDate;
	}
}

	