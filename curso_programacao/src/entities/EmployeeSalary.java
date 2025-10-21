package entities;

public class EmployeeSalary {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeSalary(int id, String name, double salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	} 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		double newSalary = salary * (1 + percentage / 100);
		this.setSalary(newSalary);
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, salary);
	}
}
