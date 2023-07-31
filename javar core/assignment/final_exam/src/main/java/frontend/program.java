package frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.controller.IUserController;
import backend.controller.UserController;
import entity.Employee;
import entity.User;

public class program {
	public static void main(String[] args) throws IOException, SQLException {
//		Utils.JDBCutils.checkConnection();
		IUserController controller = new UserController();
	        List<User> users = controller.finallEmployee(1);
	        System.out.println("+------+--------------------+--------------------+------------+------------+------------+-------------+------------+");
	        System.out.println("|  ID  |     FULL NAME      |        EMAIL       |  PASSWORD  |  PROSKILL  | PROJECT ID | EXP IN YEAR |    ROLE    |");
	        System.out.println("+------+--------------------+--------------------+");
	        if (users.isEmpty()) {
	            System.out.printf("| %-4s | %-18s | %-18s | %-10s | %-10s | %-10s | %-11s | %-10s |%n", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
	            System.out.println("+------+--------------------+--------------------+");
	        } else {
	            for (User user : users) {
	                int id = user.getId();
	                String fullName = user.getFullName();
	                String email = user.getEmail();
	                String password = user.getPassword();
	             
	                
	                System.out.printf("| %-4s | %-18s | %-18s | %-10s | %-10s | %-10s | %-11s | %-10s |%n\", id, fullName, email, password, proSkill, projectId, expInYear, role");
	                System.out.println("+------+--------------------+--------------------+------------+------------+------------+-------------+------------+");
	            }
	        }
	        
	        List<User> users2 = controller.Manager();
	        System.out.println("+------+--------------------+--------------------+------------+------------+------------+-------------+------------+");
	        System.out.println("|  ID  |     FULL NAME      |        EMAIL       |  PASSWORD  |  PROSKILL  | PROJECT ID | EXP IN YEAR |    ROLE    |");
	        System.out.println("+------+--------------------+--------------------+");
	        if (users.isEmpty()) {
	            System.out.printf("| %-4s | %-18s | %-18s | %-10s | %-10s | %-10s | %-11s | %-10s |%n", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
	            System.out.println("+------+--------------------+--------------------+");
	        } else {
	            for (User user : users2) {
	                int id = user.getId();
	                String fullName = user.getFullName();
	                String email = user.getEmail();
	                String password = user.getPassword();
	             
	                
	                System.out.printf("| %-4s | %-18s | %-18s | %-10s | %-10s | %-10s | %-11s | %-10s |%n\", id, fullName, email, password, proSkill, projectId, expInYear, role");
	                System.out.println("+------+--------------------+--------------------+------------+------------+------------+-------------+------------+");
	            }
	        }
	        
	        User user3 = controller.login("nva@gmail.com", "123456");
	        
	    }
	    }
	



