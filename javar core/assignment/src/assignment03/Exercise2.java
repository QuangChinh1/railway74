package assignment03;

import java.time.LocalDateTime;

import entity.Account;

public class Exercise2 {
	public static void main(String[] args) {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = String.format("Email %d", i + 1);
            account.userName = String.format("Username1 %d", i + 1);
            account.fullName = String.format("Full name %d", i + 1);
            account.createDate = LocalDateTime.now();
            accounts[i] = account;
        }
	}
}