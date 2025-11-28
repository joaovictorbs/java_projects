package model.entities;

public class Grade {
	private String name;
	private double firstGrade;
	private double secondGrade;
	
	public Grade(String name, double firstGrade, double secondGrade) {
		this.setName(name);
		this.setFirstGrade(firstGrade);
		this.setSecondGrade(secondGrade);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getFirstGrade() {
		return firstGrade;
	}
	
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}
	
	public double getSecondGrade() {
		return secondGrade;
	}
	
	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}
}
