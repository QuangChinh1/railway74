package entity;

import entityenum.gioitinh;

public class CongNhan extends CanBo {
	private int bac;


	

	public CongNhan(String hoTen, int tuoi, gioitinh gioiTinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + getHoten() +
                ", tuoi=" + getTuoi() +
                ", gioiTinh=" + getGioiTinh() +
                ", diaChi='" + getDiachi() +
                '}';
    }

	
	
}
