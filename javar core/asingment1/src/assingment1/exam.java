package assingment1;

import java.time.LocalDate;

public class exam {
	int examID;
	String code;
	String title;
	categoryQuestion categoryID;
	int duration;
	Account Creator;
	LocalDate createDate;
	@Override
	public String toString() {
		return "Exam [examID=" + examID + ", code=" + code + ", title=" + title + ", categoryID=" + categoryID
				+ ", duration=" + duration + ", Creator=" + Creator + ", createDate=" + createDate + "]";
	}
}
