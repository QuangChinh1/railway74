package backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.MyMath;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Exercise1 {
	public static Student student1 = new Student("Nguyen Van A");
	public static Student student2 = new Student("Nguyen Van B");
	public static Student student3 = new Student("Nguyen Van C");
	public static Student[] students = { student1, student2, student3};
	public static void Question1() {
		
		
		Student.setCollege("Đại học bách khoa");
		
		
		
		for (Student student :  students) {
			System.out.println(student);
		}	
		Student.setCollege("Đại học công nghệ");
		
		for (Student student :  students) {
			System.out.println(student);
		
		}
	}
	
	public static void Question2() {
		
		System.out.println("Tiền quỹ hiện tại : " + Student.moneyGroup);
		
		for (Student student :  students) {
			Student.moneyGroup+=100000; 
		}
		System.out.println("Tiền quỹ hiện tại : " + Student.moneyGroup);
		
		Student.moneyGroup-=50000;
		System.out.println("Tiền quỹ hiện tại : " + Student.moneyGroup);
		
		Student.moneyGroup-=20000;
		System.out.println("Tiền quỹ hiện tại : " + Student.moneyGroup);
		
		Student.moneyGroup-=150000;
		System.out.println("Tiền quỹ hiện tại : " + Student.moneyGroup);
		
		for (Student student :  students) {
			Student.moneyGroup+=50000; 
		}
		
		System.out.println("Tiền quỹ hiện tại : " + Student.moneyGroup);
	}
	
	public static void Question3() {
		int min = MyMath.min(5, 7);
		System.out.println(min);
		
		int sum = MyMath.sum(5, 7);
		System.out.println(sum);
	}
	
	public static void Question5() {
		System.out.println("số học sinh được tạo là :" + Student.count);
	}
	
	public static void Question6() {
		PrimaryStudent PrimaryStudent1 = new PrimaryStudent("PrimaryStudent1");
		SecondaryStudent SecondaryStudent1 = new SecondaryStudent("SecondaryStudent1");
		SecondaryStudent SecondaryStudent2 = new SecondaryStudent("SecondaryStudent2");
		SecondaryStudent SecondaryStudent3 = new SecondaryStudent("SecondaryStudent3");
		SecondaryStudent SecondaryStudent4 = new SecondaryStudent("SecondaryStudent4");
		SecondaryStudent SecondaryStudent5 = new SecondaryStudent("SecondaryStudent5");
		
		System.out.println("số PrimaryStudent được tạo là :" + PrimaryStudent.count);
		System.out.println("số SecondaryStudent được tạo là :" + SecondaryStudent.count);
		System.out.println("số học sinh được tạo là :" + Student.count);
	}
}		
