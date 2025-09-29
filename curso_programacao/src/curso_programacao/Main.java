package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Main {
		
	public static void main(String[] args) {
		
		// EXERCICIO PENSIONATO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10]; //cria vetores de objetos com 10 quartos
		
		int n;
		do {
			System.out.print("How many rooms will be rented? ");

			n = sc.nextInt(); 

			if(n > 10) {
				System.out.println("Enter a quantity of up to 10!");
			}
			
		} while (n > 10);
		
		System.out.println();
		sc.nextLine();		
		
		for(int i=0; i<n;i++) {
			System.out.println("Rent #" + (i+1));
			String name, email;
			int room;
			
			System.out.print("Name: ");
			name = sc.nextLine();

			System.out.print("E-mail: ");
			email = sc.nextLine();

			do {
				System.out.print("Room (1-10): ");

				room = sc.nextInt();
				
				if(room < 1 || room > vect.length) {
					System.out.println("Please enter a number between 1 and " + vect.length + ".");
					continue;
				}
				
				if(vect[room - 1] != null) {
					System.out.println("The selected room is currently rented. Please choose another available room.");
					continue;
				}
				
				break;
				
			} while (true);
			
			System.out.println();
			sc.nextLine();
						
			vect[room - 1] = new Room(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].toString());	
			}
		}
		
		sc.close();
	}
	
}
