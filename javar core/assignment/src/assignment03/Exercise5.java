package assignment03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import entity.Department;

public class Exercise5 {
	public static Department department1 = new Department("Phòng A");
	public static Department department2 = new Department("Phòng A");
	public static Department[] departments = {department1, department2};
	public static void question2() {
        for (Department department : departments) {
            System.out.println("department = " + department);
        }
	}
	
	public static void question3() {
        
        System.out.println("department.hashCode() = " + department1.hashCode());
	}
	
	public static void question4() {
       
        boolean answer = department1.DepartmentName.equals("Phòng A");
        System.out.println("answer = " + answer);
	}
	
	public static void question5() {
        boolean answer = department1.equals(department2);
        System.out.println("answer = " + answer);
	}
	
	public static void main(String[] args) {
//		question2();
//		question3();
//		question4();
//		question5();
		
		
	}
}
