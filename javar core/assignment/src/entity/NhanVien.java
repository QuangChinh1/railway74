package entity;

import entityenum.gioitinh;

public class NhanVien extends CanBo{
	
	private String congViec;
	
	public NhanVien(String hoTen, int tuoi, gioitinh gioiTinh, String diaChi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + getHoten() + '\'' +
                ", tuoi=" + getTuoi() +
                ", gioiTinh=" + getGioiTinh() +
                ", diaChi='" + getDiachi() + '\'' +
                '}';
	}
	
	

	

}
