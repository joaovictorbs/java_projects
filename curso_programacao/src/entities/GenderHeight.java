package entities;

public class GenderHeight {
	private double height;
	private char gender;
	
	public GenderHeight(double height, char gender) {
		this.setHeight(height);
		this.setGender(gender);
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
}
