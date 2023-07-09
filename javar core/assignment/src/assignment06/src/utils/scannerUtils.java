package utils;

import java.util.Scanner;

public class scannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputAge() {
		while (true) {
			try {
				int age = Integer.parseInt(scanner.nextLine());

				if (age < 0) {
					System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
				} else {
					return age;
				}
			} catch (NumberFormatException e) {
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}
		}
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	public static int inputPositiveInt(String errorMessage) {
		while (true) {
			try {
				int a = Integer.parseInt(scanner.nextLine());

				if (a > 0) {
					return a;
				} else {
					System.out.println(errorMessage);
				}
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	public static int inputFloat(String errorMessage) {
		while (true) {
			try {
				float a = Float.parseFloat(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	public static int inputDouble(String errorMessage) {
		while (true) {
			try {
				double a = Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String text = scanner.nextLine().trim();
			if (text.isEmpty()) {
				System.out.println(errorMessage);
			} else {
				return text.replaceAll("\\s+", " ");
			}
		}
	}
}