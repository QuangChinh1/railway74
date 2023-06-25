package assignment03;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	public static Random random1 = new Random();
	
	public static void question1() {
		float Salary1 = 5240.5f;
		float Salary2 = 10970.055f;
		
		System.out.println("Salary 1 = " + (int) Salary1);
		System.out.println("Salary 2 = " + (int) Salary2);
	}
	
	public static void question2() {
		int n = random1.nextInt(100000);
			System.out.printf("=> n = %05d", n);
	}
	
	public static void question3() {
		int n = random1.nextInt(100000);
		System.out.printf("=> n = %05d.%n", n);
		System.out.printf("=> 2 số cuối = %d.%n", n % 100);
	}
	
	public static void question4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số nguyên a và b.");

        System.out.println("Nhập vào số nguyên a:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên b:");
        int b = scanner.nextInt();
        
        float c = ((float)a/b);
        System.out.println("thương của 2 số" + c);
        
	}
	
	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
		question4();
	
	}
}
