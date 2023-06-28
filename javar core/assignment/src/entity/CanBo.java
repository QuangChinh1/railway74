package entity;

import entityenum.gioitinh;
public class CanBo {
	private String hoTen;
	private int tuoi;
	private gioitinh gioiTinh;
	private String diaChi;
	
	
	public CanBo(String hoTen, int tuoi, gioitinh gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	
	public String getHoten() {
		return hoTen;

	}
	public void setHoten(String hoten) {
		this.hoTen = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public gioitinh getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(gioitinh gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiachi() {
		return diaChi;
	}
	public void setDiachi(String diachi) {
		this.diaChi = diachi;
	}
	@Override
	public String toString() {
		return "CanBo [hoten=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diachi=" + diaChi + "]";
	}
	
	
}
