package entity;

public class HighSchoolStudent extends Student2 {
	
	private String clazz;
	private String desiredUniversity;
	
	public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	public HighSchoolStudent(String name, int id) {
		super(name, id);
	}
	
	

}
