package entity;

import java.util.ArrayList;

public class Student {
	private final int id;
	private String name;
	private static String college;
	public static int moneyGroup;
	
	public static int count;
	
	public Student( String name) {
		if (count >=7) {
			 throw new IllegalStateException("Chỉ được tạo được tối đa 7 học sinh.");
		}
		
		this.id = count++;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

//	public static int getMoneyGroup() {
//		return moneyGroup;
//	}
//
//	public static void setMoneyGroup(int moneyGroup) {
//		Student.moneyGroup = moneyGroup;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("student [id=").append(id).append(", name=").append(name).append(", college=").append(college).append("]");
		return builder.toString();
	}

	public static final void study() {
		System.out.println("Đang học bài...");
	}
}
