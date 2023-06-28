package entity;


import java.time.LocalDateTime;

import entity.Account;

public class Group {
	private int groupID;
	private String groupName;
	private Account creatorID;
	private LocalDateTime createDate;
	private  Account[] accounts;
	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creatorID=" + creatorID + ", createDate="
				+ createDate + "]";
	}
	
	public Group() {
	}
	
	public Group(int groupID, String groupName, LocalDateTime localDateTime  ) {
		this.groupID = groupID;
		this.groupName = groupName;
		this.createDate = localDateTime;
	}

	public Group(String groupName, Account creatorID, LocalDateTime createDate, Account[] accounts) {
		super();
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	
	public Group(String name, Account creator, LocalDateTime createdDate, String[] usernames) {
		super();
		this.groupName = name;
        this.creatorID = creator;
        this.createDate = createdDate;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account account = new Account();
            account.setUserName(usernames[i]);
            accounts[i] = account;
        }
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(Account creatorID) {
		this.creatorID = creatorID;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	
      
}
