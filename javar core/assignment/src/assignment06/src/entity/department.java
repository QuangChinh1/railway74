package entity;

import java.util.Scanner;
import utils.scannerUtils;

public class department {
	private static Scanner scanner = new Scanner(System.in);

	private int id;
	private String name;
	public department() {
		System.out.println("nhap vao thong tin department");
		
		System.out.println("nhap vao id");
		this.id = scannerUtils.inputPositiveInt("nhap lai");
		
		System.out.println("nhap vao ten department");
		this.name = scannerUtils.inputString("nhap lai");
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("department [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}
	
	
	
}
