package Exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import entity.Group;
import entity.Department;
import entity.Position;
import entity.positionName;
import entity.Account;

public class Exercise_05_inputFromConsole {
	public static final Scanner scanner = new Scanner(System.in);
	private static final String A = null;
	public static Account account = new Account();
	public static Position position = new Position();
	public static Department department = new Department();
	public static Group groupA = new Group (1, "Database", LocalDateTime.now());
	public static Group groupB = new Group (2, "Java ore", LocalDateTime.now());
	public static Group groupC = new Group (2, "ReactJS", LocalDateTime.now());
	public static Account accountA = new Account();
	public static Account accountB = new Account();
	public static Account accountC = new Account();
	public static Group[] groups = {groupA, groupB, groupC};
	public static Account[] accounts = {accountA, accountB, accountC};
	
	public static void question01() {
        System.out.println("Mời bạn nhập vào 3 số nguyên.");

        System.out.println("Nhập vào số thứ 1:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số thứ 2:");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số thứ 3:");
        int c = scanner.nextInt();

        System.out.printf("Bạn vừa nhập vào 3 số nguyên là: %d, %d và %d.%n", a, b, c);
	}
	
	public static void question02() {
        System.out.println("Mời bạn nhập vào 2 số thực.");

        System.out.println("Nhập vào số thứ 1:");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào số thứ 2:");
        double b = scanner.nextDouble();

        System.out.printf("Bạn vừa nhập vào 2 số thực là: %f và %f.%n", a, b);
	}
	
	public static void question03() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        System.out.printf("Bạn vừa nhập vào họ và tên là: %s.%n", fullName);
	}
	
    public static void question04() {
        System.out.println("Mời bạn nhập vào ngày sinh.");

        System.out.println("Nhập vào ngày sinh (yyyy-MM-dd):");
        LocalDate birthdate = LocalDate.parse(scanner.next());

        System.out.printf("Bạn vừa nhập vào ngày sinh là: %s.%n", birthdate);
    }
    
    public static void question05() {
        System.out.println("Mời bạn nhập vào thông tin account.");

        System.out.println("Nhập vào id:");
        account.accountID = scanner.nextInt();

        System.out.println("Nhập vào email:");
        account.email = scanner.next();

        System.out.println("Nhập vào username:");
        account.userName = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào full name:");
        account.fullName = scanner.nextLine();

        System.out.println("Nhập vào position:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Scrum Master");
        System.out.println("4. Project Manager");

        int ordinal = scanner.nextInt();
        position.PositionName = positionName.values()[ordinal - 1];
        account.Position = position;

        System.out.println("Bạn vừa nhập vào account có thông tin như sau:");
        System.out.printf(
                "%d - %s - %s - %s - %s.%n",
                account.accountID, account.email, account.userName, account.fullName, account.Position.PositionName
        );
    }
    
    public static void question06() {
        System.out.println("Mời bạn nhập vào thông tin department.");

        System.out.println("Nhập vào id:");
        department.Departmentid = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào name:");
        department.DepartmentName = scanner.nextLine();

        System.out.println("Bạn vừa nhập vào department có thông tin như sau:");
        System.out.printf("%d - %s.%n", department.Departmentid, department.DepartmentName);
    }
    
    public static void question07() {
        System.out.println("Mời bạn nhập vào 1 số chẵn.");

        while (true) {
            System.out.println("Nhập vào 1 số chẵn:");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.printf("Bạn vừa nhập vào 1 số chẵn là: %d.%n", n);
                break;
            } else {
                System.out.printf("Số %d không phải là số chẵn.%n", n);
                System.out.println("Mời bạn nhập lại.");
            }
        }
    }
    
    public static void question08() {
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
        }
    }
    
    public static void question09() {
        System.out.println("Hiển thị danh sách accounts:");
        for (Account account : accounts) {
            System.out.println("- account: " + account.userName);
        }

        System.out.println("Nhập vào username:");
        String username = scanner.next();
        scanner.nextLine();

        System.out.println("Hiển thị danh sách groups:");
        for (Group group : groups) {
            System.out.println("- group: " + group.groupName);
        }

        System.out.println("Nhập vào group name:");
        String name = scanner.nextLine();

        for (Account account : accounts) {
            if (username.equals(account.userName)) {
                for (Group group : groups) {
                    if (name.equals(group.groupName)) {
                        account.groups = new Group[]{group};
                        group.accounts = new Account[]{account};
                        System.out.printf("Bạn vừa thêm account %s vào group %s.%n", username, name);
                    }
                }
            }
        }

    }
    
    public static void question10() {
    	while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thêm account vào group");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    question09();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
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
		question10();
	}
}
