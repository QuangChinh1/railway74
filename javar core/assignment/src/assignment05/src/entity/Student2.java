package entity;

import java.util.Scanner;

import entityenum.GioiTinh;

public class Student2 extends Person {
    private String maSinhVien;
    private double diemTrungBinh;
    private String email;
	public Student2() {
	}
	public Student2(String maSinhVien, double diemTrungBinh, String email) {
		super();
		this.maSinhVien = maSinhVien;
		this.diemTrungBinh = diemTrungBinh;
		this.email = email;
	}
	public Student2(String ten, GioiTinh gioiTinh, String ngaySinh, String diaChi, String maSinhVien, double diemTrungBinh, String email) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		this.maSinhVien = maSinhVien;
		this.diemTrungBinh = diemTrungBinh;
		this.email = email;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    
    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin student.");

        System.out.println("Nhập vào mã sinh viên:");
        this.maSinhVien = scanner.next();

        System.out.println("Nhập vào điểm trung bình:");
        this.diemTrungBinh = scanner.nextDouble();

        System.out.println("Nhập vào email:");
        this.email = scanner.next();    
    }
    
    public void showInfo() {
        System.out.println(this);
    }
    
    public boolean datDuocHocBong() {
        return diemTrungBinh >= 8.0;
    }   
}
