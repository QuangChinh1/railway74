package entity;

public class HinhChuNhat extends HinhHoc {
	public HinhChuNhat() throws HinhHocException {
		super();
		// TODO Auto-generated constructor stub
	}
	private double chieudai;
	private double chieurong;
	@Override
	public double tinhChuVi() {
		double chuvi= 2*(chieudai+chieurong);
		return chuvi;
	}
	@Override
	public double tinhDienTich() {
		double dientich = chieudai*chieurong;
		return dientich;
	}
	
	
}
