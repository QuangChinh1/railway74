package entity;

public abstract class Student2 extends Person {
	
	private int id;
	
	public Student2(String name, int id) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}
	
	


	
	

}
