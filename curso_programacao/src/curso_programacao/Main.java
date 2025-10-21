package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmployeeSalary;

public class Main {
		
	public static void main(String[] args) {
		
		/*EXERCICIO FIXACAO LISTA*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int numberEmployees = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		List<EmployeeSalary> employeeSalary = new ArrayList<EmployeeSalary>();
		
		for(int i=0; i<numberEmployees; i++) {
			
			System.out.println("Employee #" + (i+1));
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			while (hasId(employeeSalary, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
		
			System.out.println();
			
			EmployeeSalary emp = new EmployeeSalary(id, name, salary); 
			
			employeeSalary.add(emp); 
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSearch = sc.nextInt();
		Integer indexPercentage = null;
	
		for(int i=0;i<employeeSalary.size();i++) {
			if(employeeSalary.get(i).getId() == idSearch) {
				indexPercentage = i;	
			}
		}
		
		EmployeeSalary emp = employeeSalary.stream()
			    .filter(e -> e.getId() == idSearch)
			    .findFirst()
			    .orElse(null);
		
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			emp.increaseSalary(sc.nextDouble());
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		
		for(int i=0; i<employeeSalary.size(); i++) {
			System.out.println(employeeSalary.get(i));
		}
		
		sc.close();
	}
	
	public static Integer position(List<EmployeeSalary> employeeSalary, int id) {
		for (int i = 0; i < employeeSalary.size(); i++) {
			if (employeeSalary.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<EmployeeSalary> employeeSalary, int id ) {
		EmployeeSalary emp = employeeSalary.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;	
	}
}
