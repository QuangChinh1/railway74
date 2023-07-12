package entity;

public class HinhTron extends HinhHoc {
	
	private double radius;
	private static final double PI = 3.14;

	public HinhTron() throws HinhHocException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		double chuvi = 2*PI*radius;
		return chuvi;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		double dientich = PI* radius *radius;
		return dientich;
	}

}
