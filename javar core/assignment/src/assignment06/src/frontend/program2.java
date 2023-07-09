package frontend;

import utils.scannerUtils;
import entity.department;
import backend.Exercise02;

public class program2 {
	public static void main(String[] args) {
//		try {
//			float result = divide(7,0);
//			System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("cannot divide 0");
//		}finally {
//			System.out.println("divide completed!");
//		}
//		
//		try {
//			int[] numbers = {1, 2, 3};
//			
//			System.out.println(numbers[10]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		getIndex(100);
//		
//		System.out.println("nhap vao tuoi");
//		scannerUtils.inputAge();
//		
//		System.out.println("nhap vao int");
//		scannerUtils.inputInt("asfwe");
//		
		
//		Exercise02.question09();
		Exercise02.question11();
	}
	
	public static float divide(int a, int b) {
		return a/b;
	}
	
	public static void getIndex(int index) {
		try {
			int[] departments = { 1, 2, 3 };
			System.out.println(departments[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot find department.");
		}
	}
	
	

	
}
