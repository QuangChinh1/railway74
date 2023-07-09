package entity;

import java.util.Scanner;

import utils.scannerUtils;

public class Account {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private int id;
	private String name;
	private	 int age;
	
	public Account() {
		System.out.println("nhap vao thong tin account");
		
		System.out.println("nhap vao id");
		this.id = scannerUtils.inputPositiveInt("nhap lai");
		
		System.out.println("nhap vao ten ");
		this.name = scannerUtils.inputString("nhap lai");
		
		System.out.println("nhap vao tuoi");
			this.age = inputAccountAge();
		
	}

	public Account(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	private int inputAge(){
		int age = scannerUtils.inputInt("nhap lai");
		if (age > 0)	{
			return age;
		}else {
		throw new InvalidAgeInputingException ("The age must be greater than 0");
		}
	}
	
	private int inputAccountAge() {
		while (true)
			try {
				int age = inputAge();
				if (age < 18) {
					System.out.println("Your age must be greater than 18");
					System.out.println("nhập lại");
				} else {
					return age;
				}
			} catch (InvalidAgeInputingException e) {
				System.out.println("The age must be greater than 0");
			}
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", name=").append(name).append(", age=").append(age)
				.append("]");
		return builder.toString();
	}
	
	
	
	
	

	
}
