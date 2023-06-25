package Exercise;

import entity.Position;
import entity.Group;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.positionName;

public class flowControl {
	public static void question01() {
		Account account = new Account(); 
		if (account.Department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else {
			System.out.println("Phòng ban của nhân viên này là ...");
		}
	}
	
	public static void question02() {
		Account account = new Account();
		if (account.groups==null || account.groups.length == 0) {
			System.out.println("Nhân viên này chưa có group");
		}else if (account.groups.length == 1 || account.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		}else if (account.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
	}
	
	public static void question03() {
		Account account = new Account();
		String massege = (account.Department == null)
					? "Nhân viên này chưa có phòng ban"
					: "Phòng ban của nhân viên này là ...";
		System.out.println(massege);
	}
	
	public static void question04() {
		Account account = new Account();
        Position position = new Position();
        position.PositionName = positionName.DEV;
        account.Position = position;
        String massege = (account.Position.PositionName == positionName.DEV)
        					? "Đây là Developer"
        					: "Người này không phải là Developer";
        System.out.println(massege); 						
	}
	
	public static void question05() {
		Group group = new Group();
		group.accounts = new Account[]{new Account(), new Account(), new Account() };
		switch (group.accounts.length) {
		case 1:
			System.out.println("Nhóm có một thành viên"); 
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
	}
	
	public static void question06() {
		Account account = new Account();
		account.groups = new Group[]{new Group()};
		switch (account.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;	
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}	
	}
	
	public static void question07() {
		Account account = new Account();
        Position position = new Position();
        position.PositionName = positionName.DEV;
        account.Position = position;
        switch (account.Position.PositionName) {
		case DEV:
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
	}
	
	public static void question08() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2};
		
		for (Account acc : accounts) {
			System.out.println("acc.email" + acc.email);
			System.out.println("acc.fullName" + acc.fullName);
			System.out.println("acc.Department.DepartmentName" + acc.Department.DepartmentName);
		}
	}
	
	public static void question09() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department[] Departments = {DepartmentA};
		
		for (Department Dep : Departments) {
			System.out.println("Dep.id " + Dep.Departmentid);
			System.out.println("Dep.name " + Dep.DepartmentName);
		}
	}
	
	public static void question10() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2};
		
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i+1) + "là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
		}
	}
	
	public static void question11() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department[] Departments = {DepartmentA};
		
		for (int i = 0; i < Departments.length; i++) {
			System.out.println("Thông tin department thứ "+ (i+1) + "là:");
			System.out.println("Id: " + Departments[i].Departmentid);
			System.out.println("Name: " + Departments[i].DepartmentName);
		}
	}
	
	public static void question12() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2};
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin account thứ " + (i+1) + "là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
		}
	}
	
	public static void question13() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2, Account1};
		
		for (int i = 0; i < accounts.length; i++) {
			if (i!=1) {
				System.out.println("Thông tin account thứ " + (i+1) + "là:");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Full name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
			}
		}
	}
	
	public static void question14() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2, Account1};
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].Department.Departmentid <4) {
				System.out.println("Thông tin account thứ " + (i+1) + "là:");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Full name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
			}
		}
	}
	
	public static void question15() {
		for (int i = 0; i <= 20; i=i+2) {
			System.out.println(i);
		}
	}
	
	public static void question1610() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2, Account1};
		
		int i = 0; 
		while (i < accounts.length) {
			System.out.println("Thông tin account thứ " + (i+1) + "là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
			i++;
		}
	}
	
	public static void question1611() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department[] Departments = {DepartmentA};
	
		int i=0;
		while (i < Departments.length) {
			System.out.println("Thông tin department thứ "+ (i+1) + "là:");
			System.out.println("Id: " + Departments[i].Departmentid);
			System.out.println("Name: " + Departments[i].DepartmentName);
			i++;
		}
	}
	
	public static void question1612() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2, Account1};
		
		int i =0;
		while (i < accounts.length) {
			if (i>1) {
				break;
			}else {
			System.out.println("Thông tin account thứ " + (i+1) + "là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full name: " + accounts[i].fullName);
			System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
		
			i++;
			}
		}
	}
	
	public static void question1613() {
		Department DepartmentA = new Department();
		DepartmentA.Departmentid = 1;
		DepartmentA.DepartmentName = "giam doc";
		
		Department DepartmentB = new Department();
		DepartmentB.Departmentid = 2;
		DepartmentB.DepartmentName = "Sale";
		
		Account Account1 = new Account();
		Account1.email = "haidang29productions@gmail.com";
		Account1.fullName = "Nguyen Hai Dang";
		Account1.Department = DepartmentA;
		
		Account Account2 = new Account();
		Account2.email = "account1@gmail.com";
		Account2.fullName = "Tong Quang Anh";
		Account2.Department = DepartmentB;
		
		Account[] accounts  = {Account1, Account2, Account1};
		
		int i = 0;
		
		while (i < accounts.length) {
			if (i==1) {
				continue;
			}else {
			
				System.out.println("Thông tin account thứ " + (i+1) + "là:");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Full name: " + accounts[i].fullName);
				System.out.println("Phòng ban: " + accounts[i].Department.DepartmentName);
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
//		question01();
//		question02();
//		question03();
//		question04();
//		question05();
//		question06();
//		question07();
//		question08();
//		question09();
//		question10();
//		question11();
//		question12();
//		question13();
//		question14();
//		question15();
//		question1610();
//		question1611();
//		question1612();
		question1613();
	}
}
