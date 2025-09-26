package entities;

public class Height {
	private String name;
	private int age;
	private double height;
	
	public Height(String name, int age, double height) {
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
	}
		
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
}
