package entity;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.Arrays;

import entity.Position;

public class Account {
	private int accountID;
	private String email;
	private String userName;
	private String lastName;
	private String fullName;
	private Department Department;
	private Position Position;
	private LocalDate createDate;
	private Group[] groups;

	
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", lastName="
				+ lastName + ", fullName=" + fullName + ", Department=" + Department + ", Position=" + Position
				+ ", createDate=" + createDate + ", groups=" + Arrays.toString(groups) + "]";
	}

	public Account (int accountID, String email, String userName, String fullName, LocalDate createDate ) {
		this.accountID = accountID;
		this.email= email;
		this.userName = userName;
		this.fullName = fullName;
		this.createDate = createDate;
	}
	
	public Account (int accountID, String userName, String fullName, LocalDate localDateTime ) {
		this.accountID = accountID;
		this.userName = userName;
		this.fullName = fullName;
		this.createDate = localDateTime;
	}
	
	public Account() {}

	public Account(int accountID, String email, String userName, String lastName, String fullName) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.lastName = lastName;
		this.fullName = userName + lastName ;
	}

	public Account(int accountID, String email, String userName, String lastName, String fullName,
			entity.Position position) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.lastName = lastName;
		this.fullName = userName + lastName;
		Position = position;
		this.createDate = LocalDate.now();
	}

	public Account(int accountID, String email, String userName, String lastName, String fullName,
			entity.Position position, LocalDate createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.lastName = lastName;
		this.fullName = userName + lastName;
		Position = position;
		this.createDate = createDate;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return Department;
	}

	public void setDepartment(Department department) {
		Department = department;
	}

	public Position getPosition() {
		return Position;
	}

	public void setPosition(Position position) {
		Position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
}

