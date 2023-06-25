package entity;


import java.time.LocalDate;

public class Account {
	public int accountID;
	public String email;
	public String userName;
	public String fullName;
	public Department Department;
	public Position Position;
	public LocalDate createDate;
	public Group[] groups;
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", Department=" + Department + ", Position=" + Position + ", createDate="
				+ createDate + "]";
	}
	
}

