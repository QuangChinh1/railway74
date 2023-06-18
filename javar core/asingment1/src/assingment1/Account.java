package assingment1;


import java.time.LocalDate;

public class Account {
	int accountID;
	String email;
	String userName;
	String fullName;
	Department Departmentid;
	Position PositionID;
	LocalDate createDate;
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", Departmentid=" + Departmentid + ", PositionID=" + PositionID + ", createDate="
				+ createDate + "]";
	}
	
}

