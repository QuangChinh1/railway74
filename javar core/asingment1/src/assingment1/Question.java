package assingment1;

import java.time.LocalDate;

public class Question {
	int questionID;
	String Content;
	categoryQuestion categoryID;
	typeQuestion typeID;
	Account creatorID;
	LocalDate createDate;
	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", Content=" + Content + ", categoryID=" + categoryID
				+ ", typeID=" + typeID + ", creatorID=" + creatorID + ", createDate=" + createDate + "]";
	}
	

}
