package backend;

import java.time.LocalDate;
import java.time.LocalDateTime;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;

public class Exercise01 {
	
	public static void Question1() {
		Department department1 = new Department();
		
		Department department2 = new Department("Giám Đốc");
	}
	
	public static void Question2() {
		Account accountA = new Account();
        Account accountB = new Account(1, "A.nv@gmail.com", "A.nv", "A", "Nguyễn Văn");
        Account accountC = new Account(2, "A.nv@gmail.com", "A.nv", "A", "Nguyễn Văn", new Position());
        Account accountD = new Account(3, "A.nv@gmail.com", "A.nv", "A", "Nguyễn Văn", new Position(), LocalDate.now());
	}
	
	public static void Question3() {
		Group groupA = new Group();
        Group groupB = new Group("Java core", new Account(), LocalDateTime.now(), new Account[]{new Account()});
        Group groupC = new Group("Java core", new Account(), LocalDateTime.now(), new String[]{"a.nv"});
	}

}
