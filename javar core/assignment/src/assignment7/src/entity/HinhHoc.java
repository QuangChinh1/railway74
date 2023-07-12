package entity;

public  abstract class HinhHoc {
	
	public static int count;
	
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    
    public HinhHoc () throws HinhHocException {
    	if (count >= Configs.getSO_LUONG_HINH_TOI_DA()) {
    		throw new HinhHocException("Số lượng hình tối đa là: " + Configs.getSO_LUONG_HINH_TOI_DA());
    	}
    	++count;
    }
	
}
