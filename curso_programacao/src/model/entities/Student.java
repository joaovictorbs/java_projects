package model.entities;

public class Student {
	public String name;
	public double[] arrGrades = new double[3];
	public double finalGrade = 0.0;
	public double missingPoints = 0.0;
	
	public void addGrade(double[] grades) {
		for (int i = 0; i < grades.length; i++) {
			arrGrades[i] = grades[i];	
		}
	}
	
	public void calculateGrade() {
		for (int i = 0; i < this.arrGrades.length; i++) {
			this.finalGrade = this.finalGrade + arrGrades[i];
		}
	}
	
	public void missingPoints() {
		if(this.finalGrade < 60.00) {
			this.missingPoints = 60.0 - this.finalGrade; 
		}
	}
	
	public String toString() {
		if (this.missingPoints != 0.0) {
			return
				this.name
				+ "\nFINAL GRADE = " + String.format("%.2f", this.finalGrade)
				+ "\nFAILED"
				+ "\nMISSING " + String.format("%.2f", this.missingPoints) + " POINTS";
		}
		else {
			return
				this.name
				+ "\nFINAL GRADE = " + String.format("%.2f", this.finalGrade)
				+ "\nPASS";
		}
	}
	
}