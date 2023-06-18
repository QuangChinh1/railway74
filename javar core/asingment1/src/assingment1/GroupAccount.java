package assingment1;

import java.time.LocalDate;

public class GroupAccount {
	Group GroupID;
	Account AccountID;
	LocalDate JoinDate;
	@Override
	public String toString() {
		return "GroupAccount [GroupID=" + GroupID + ", AccountID=" + AccountID + ", JoinDate=" + JoinDate + "]";
	}
	

}
