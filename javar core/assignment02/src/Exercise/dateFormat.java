package Exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import entity.exam;

public class dateFormat {
	public static  exam exam1 = new exam (1, "java core", LocalDate.of(2020, 02, 20));
	public static  exam exam2 = new exam (2, "java core", LocalDate.now());
	
	public static void question01 () {
	System.out.println("exam : " + exam1.examID);
	System.out.println("title " + exam1.examID);
	DateTimeFormatter formatter = DateTimeFormatter
			.ofLocalizedDate(FormatStyle.FULL)
            .withLocale(new Locale("vi", "VN"));
	System.out.println("exam.createdDate = " + exam1.createDate.format(formatter));
	}
	
	public static void question02 () {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM - dd");
        System.out.println("exam.createdDate = " + exam2.createDate.format(formatter));
	}

	public static void question03 () {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("exam.createdDate = " + exam2.createDate.format(formatter));
	}
	
	public static void question04 () {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM");
        System.out.println("exam.createdDate = " + exam2.createDate.format(formatter));
	}
	
	public static void question05 () {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" MM - dd");
        System.out.println("exam.createdDate = " + exam2.createDate.format(formatter));
	}
	
	public static void main(String[] args) {
//		question01();
//		question02();
//		question03();
//		question04();
		question05();
		
	}
}
