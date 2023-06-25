package assignment03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;



public class Exercise4 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void question1() {
        System.out.println("Mời bạn nhập vào 1 xâu kí tự.");

        System.out.println("Nhập vào 1 xâu kí tự:");
        String s = scanner.nextLine();

        int count = s.trim().split("\\s+").length;
        System.out.printf("=> Có %d từ.%n", count);
	}
	
	public static void question2() {
		System.out.println("Mời bạn nhập vào 2 xâu kí tự.");

        System.out.println("Nhập vào xâu kí tự thứ 1:");
        String s1 = scanner.nextLine();

        System.out.println("Nhập vào xâu kí tự thứ 2:");
        String s2 = scanner.nextLine();

//        System.out.println(s1+s2);
        
        String s = s1.concat(s2);
        System.out.printf("=> %s.%n", s);
	}
	
	public static void question3() {
		System.out.println("nhập vào tên");
		
		System.out.println("nhập vào tên");
		String  name = scanner.next();
		
		String a = name.substring(0,1).toUpperCase()+name.substring(1);
		System.out.println(a);
	}
	
	public static void question4() {
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        for (int i = 0; i < name.length(); i++) {
            System.out.printf("Kí tự thứ %d là: %C.%n", i + 1, name.charAt(i));
        }
	}
	
	public static void question5() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ:");
        String lastName = scanner.nextLine();

        System.out.println("Nhập vào tên:");
        String firstName = scanner.next();

        System.out.printf("=> %s %s.", lastName, firstName);
	}
	
	public static void question6() {
		System.out.println("Mời bạn nhập vào họ và tên");
		String a = scanner.nextLine();
        String[] words = a.trim().split("\\s+");
        System.out.printf("Họ là: %s.%n", words[0]);
        System.out.printf("Tên đệm là: %s.%n", String.join(" ", Arrays.copyOfRange(words,1, words.length -1)));
        System.out.printf("Tên là: %s.%n", words[words.length - 1]);
	}
	
	public static void question7() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String s = scanner.nextLine();

        s=s.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] s1 = s.split(" ");
        for(int i=0;i<s1.length;i++) {
           String b=String.valueOf(s1[i].charAt(0)).toUpperCase() + s1[i].substring(1);
           if (i<s1.length-1) {
        	   b+=" ";
           }
           System.out.printf(b);
        }   
	}
	
	public static void question8() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.contains("Java")) {
                System.out.println("=> group = "+ group);
            }
        }
	}
	
	public static void question9() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS", "Java"};
        for (String group : groups) {
            if (group.equals("Java")) {
                System.out.println( group);
            }
        }
	}
	
	public static void question10(String s1, String s2) {
//        String s = new StringBuilder(s2).reverse().toString();
//        System.out.printf("=> %s.%n", s.equals(s1) ? "OK" : "KO");
		
		if (s1.length()!= s2.length()) {
			System.out.println("KO");
		}else {
			int length = s1.length();
			for (int i = 0; i < length; i++) {
				if (s1.charAt(i)!=s2.charAt(length-1-i)) {
					System.out.println("KO");
					return;
				}
				System.out.println("OK");	
			}
		}
			
	}
	
	public static void question11(String s,char a) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == a ? 1 : 0;
        }
        System.out.printf("=> %d lần xuất hiện.%n", count);
	}
	
	public static void question12(String s) {
		System.out.printf("=> Chuỗi đảo ngược là: %s.%n", new StringBuilder(s).reverse());
	}
	
	public static void question13(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.println("=> FALSE.");
                return;
            }
        }
        System.out.println("=> TRUE.");
	}
	
	public static void question14(String s, char oldChar, char newChar) {
        System.out.printf("=> Replaced String: %s.%n", s.replace(oldChar, newChar));
	}
	
//	public static void question15(String s) {
//		s=s.trim().toLowerCase().replaceAll("\\s+", " ");
//        String[] s1 = s.split(" ");
//        System.out.println(s);
//        String[] b = null;
//        for(int i=0;i<s1.length;i++) {
//            b[i]=s1[s1.length-i];
//            String c = String.valueOf(b[i]);
//        }
//        System.out.printf(c);
//	}
	
	public static void question16(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("=> KO.");
        }
	}
	
	
	
	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
//		question9();
//		question10("assd", "dssa");
//		question11("ewrd qrcDCACAaCF",'a');
//		question12("assd");
//		question13("ad 2");
//		question14("dwqdqd", 'd', '*');
//		question15("vu van");
		
		
	}
}
