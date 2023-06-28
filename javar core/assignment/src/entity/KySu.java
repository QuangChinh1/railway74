package entity;

import entityenum.gioitinh;

public class KySu extends CanBo{
	private String nganhDaoTao;
	
    public KySu(String hoTen, int tuoi, gioitinh gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", hoTen='" + getHoten() + '\'' +
                ", tuoi=" + getTuoi() +
                ", gioiTinh=" + getGioiTinh() +
                ", diaChi='" + getDiachi() + '\'' +
                '}';
    }
    
}
