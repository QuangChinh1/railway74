package Exercise;

import java.time.LocalDate;
import java.util.Random;

public class exercise_04_randomNumber {
	public static Random random1 = new Random();
	public static String[] names = {"Cường", "Hùng", "Duy", "Nam"};
	
	 public static void question01() {
		 System.out.println("number = " + random1.nextInt());
	 }
	 
	 public static void question02() {
		 System.out.println("number = " + random1.nextDouble());
	 }
	 
	 public static void question3() {
		 int index = random1.nextInt(names.length);
	     System.out.printf("names[%d] = %s%n", index, names[index]);
	 }
	 
	 public static void question4() {
		 LocalDate minDate = LocalDate.of(1995, 7, 24);
		 LocalDate maxDate = LocalDate.of(1995, 12, 20);
		 int minDay = (int) minDate.toEpochDay();
		 int maxDay = (int) maxDate.toEpochDay();
		 int randomDay = minDay + random1.nextInt(maxDay - minDay + 1);
		 LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
		 System.out.println("randomDate = " + randomDate);
	 }
	 
	 public static void question5() {
		 LocalDate minDate = LocalDate.now().minusYears(1);
	     LocalDate maxDate = LocalDate.now();
	     int minDay = (int) minDate.toEpochDay();
	     int maxDay = (int) maxDate.toEpochDay();
	     int randomDay = minDay + random1.nextInt(maxDay - minDay + 1);
	     LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
	     System.out.println("randomDate = " + randomDate);
	 }
	 
	 public static void question6() {
		 LocalDate maxDate = LocalDate.now();
	     int minDay = 0;
	     int maxDay = (int) maxDate.toEpochDay();
	     int randomDay = minDay + random1.nextInt(maxDay - minDay + 1);
	     LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
	     System.out.println("randomDate = " + randomDate);
	 }
	 
	 public static void question7() {
	     int min = 100;
	     int max = 999;
	     int number = min + random1.nextInt(max - min + 1);
	     System.out.println("number = " + number);
	 }
	 
	 public static void main(String[] args) {
//		 question01();
//		 question02();
//		 question3();
//		 question4();
//		 question5();
//		 question6();
		 question7();
	}
}

