package curso_programacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
import entities.Employee;
import entities.Student;

public class Main {
	public static void main(String[] args) {
		
		/*EXERCICIO 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
				
		sc.close();
		*/
		
		/*EXERCICIO 2
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name:");
		emp.name = sc.nextLine();
		
		System.out.println("Gross salary:");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax:");
		emp.tax= sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.println("Which percentage to increase salary?");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + emp);
		*/
		
		/*EXERCICIO 3 //testando exemplo com array
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		
		int trimestre = 0;
		double[] arrGrades = new double[3];
		
		stud.name = sc.nextLine();
		
		while(trimestre < 3) {
			arrGrades[trimestre] = sc.nextDouble();
			trimestre += 1;
		}
		
		stud.addGrade(arrGrades);
		stud.calculateGrade();
		stud.missingPoints();

		System.out.println(stud);
		*/
	}
}
