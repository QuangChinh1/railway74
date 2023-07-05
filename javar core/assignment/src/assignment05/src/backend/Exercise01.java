package backend;

import java.util.Scanner;

public class Exercise01 {
	public static void question01() {
		Scanner scanner = new Scanner(System.in);
        MyNews myNews = new MyNews();
        
        while (true) {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                myNews.insertNew();
            } else if (menu == 2) {
                myNews.showAllNews();
            } else if (menu == 3) {
                myNews.averageRate();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }
	
    public static void question02() {
    	
    }
}
