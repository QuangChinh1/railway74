package entity;

public class Department {
	private int Departmentid;
	private String DepartmentName;
	@Override
	public String toString() {
		return "Department [Departmentid=" + Departmentid + ", DepartmentName=" + DepartmentName + "]";
	}
	public Department(String DepartmentName) {
		this.DepartmentName = DepartmentName;
		this.Departmentid = 0;
	}
	
	public Department() {
	}
	
	public int getDepartmentid() {
		return Departmentid;
	}
	public void setDepartmentid(int departmentid) {
		Departmentid = departmentid;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	
	
}
