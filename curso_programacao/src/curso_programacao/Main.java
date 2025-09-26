package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Height;
import entities.Grade;
import entities.GenderHeight;

public class Main {
		
	public static void main(String[] args) {
		
		/*EXERCICIO 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		
		do {
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			if(n > 10) {
				System.out.println("Escreva uma quantidade de no maximo 10!");
			}
		} while(n > 10);
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS:");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 2
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0;
		double media = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];

		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(vect[i]);
			if(i < vect.length -1) {
				System.out.print(" ");
			}
			soma += vect[i];
		}
		media = soma / vect.length;
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);

		sc.close()
		*/
		
		
		
		/*EXERCICIO 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Height[] vect = new Height[n]; // vetores de objetos
	
		for(int i = 0; i < vect.length; i++) {
			String name;
			int age;
			double height;
			
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
		    System.out.print("Nome: ");
		    name = sc.nextLine();

		    System.out.print("Idade: ");
		    age = sc.nextInt();
		    sc.nextLine();
		    
		    System.out.print("Altura: ");
		    height = sc.nextDouble();
		    sc.nextLine();
						
			vect[i] = new Height(name, age, height);
		}
		
		double sumHeight = 0.0;
		int sumAge = 0;
		String nameUnderAge = "";
		
		for(int i = 0; i < vect.length; i++) {
			sumHeight += vect[i].getHeight();
			
			if(vect[i].getAge() < 16) {
				sumAge += 1;	
				nameUnderAge += vect[i].getName() + ",";
			}
		}
		
		double avgHeight = sumHeight / vect.length;
		double avgAge = ((double) sumAge / vect.length) * 100;
		
		System.out.println();
		System.out.printf("Altura media: %.2f\n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", avgAge);
				
		if(!nameUnderAge.isEmpty()) {
		    nameUnderAge = nameUnderAge.substring(0, nameUnderAge.length() - 1); //remove ultima virgula 
			String[] arrNameUnderAge = nameUnderAge.split(",");

			for(int i = 0; i < arrNameUnderAge.length; i++) {
				System.out.println(arrNameUnderAge[i]);
			}
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 4
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] numbers = new int[n];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		int sumEven = 0;

		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sumEven += 1;
				System.out.print(numbers[i] + " ");
			}
		}
		
		System.out.println("\n");
		System.out.println("QUANTIDADE DE PARES = " + sumEven);
		
		sc.close();
		*/
		
		
		/*EXERCICIO 5
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] numbers = new double[n];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}
		
		double sumNumbers = 0.0;
		int biggestNumber = 0;
		
		for(int i=0; i<numbers.length; i++) {
			if(sumNumbers < numbers[i]) {
				sumNumbers = numbers[i];
				biggestNumber += 1;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f\n", sumNumbers);
		System.out.printf("POSICAO DO MAIOR VALOR = " + biggestNumber);
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 7
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double sumVetor = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			sumVetor += vetor[i];
		}
			
		double mediaVetor = sumVetor / vetor.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f\n", mediaVetor);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 8
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		} 
	
		double qtdPares = 0;
		double sumPares = 0;
		double mediaPares = 0;
		
		for(int i=0; i<numeros.length; i++) {
			 if(numeros[i] % 2 == 0) {
				 qtdPares += 1;
				 sumPares += numeros[i];
			 }
		}
		
		if(qtdPares < 1) {
			System.out.print("NENHUM NUMERO PAR");
		}
		else {
			mediaPares = sumPares / qtdPares;
			System.out.printf("MEDIA DOS PARES = %.2f", mediaPares);
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 9
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		String nomeVelho = null;
		int idadeVelho = 0;
		
		sc.nextLine();
		
		for(int i=0;i<nome.length;i++) {
			
			System.out.println("Dados da " + (i+1) + "a pessoa");
			
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			
			if(idade[i] > idadeVelho) {
				nomeVelho = nome[i];
				idadeVelho = idade[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nomeVelho);
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 10
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Grade[] vect = new Grade[n]; // vetores de objetos
		
		for(int i=0;i<vect.length;i++) {
			String name;
			double firstGrade;
			double secondGrade;
			
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			
			name = sc.nextLine();
			firstGrade = sc.nextDouble();
			secondGrade = sc.nextDouble();
			sc.nextLine();
			
			vect[i] = new Grade(name, firstGrade, secondGrade);
		}
		
		System.out.println("Alunos aprovados:");
		
		double avgGrade = 0.0;
		for(int i=0; i<vect.length; i++) {
			avgGrade = (vect[i].getFirstGrade() + vect[i].getSecondGrade()) / 2; 
			
			if(avgGrade >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
		*/
		
		
		
		/*EXERCICIO 11*/
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		GenderHeight[] vect = new GenderHeight[n];
		
		for(int i=0; i<vect.length; i++) {
			double height;
			char gender;
			
			System.out.print("Altura da " + (i+1) + "a pessoa ");
			height = sc.nextDouble();
			
			System.out.print("Genero da " + (i+1) + "a pessoa ");
			gender = Character.toUpperCase(sc.next().charAt(0));
			
			vect[i] = new GenderHeight(height, gender);
		}
		
		double smallerHeight = vect[0].getHeight();
		double biggerHeight = vect[0].getHeight();
		double avgFemale = 0;
		int qtyMale = 0;
		
		for(int i=0;i<vect.length;i++) {
			if(smallerHeight > vect[i].getHeight()) {
				smallerHeight = vect[i].getHeight();
			}
			
			if(biggerHeight < vect[i].getHeight()) {
				biggerHeight = vect[i].getHeight();
			}
			
			if(vect[i].getGender() == 'M') {
				qtyMale += 1;
			}
			
			avgFemale += vect[i].getHeight();
		}
		
		avgFemale = avgFemale / vect.length;
		
		System.out.printf("Menor altura = %.2f\n", smallerHeight);
		System.out.printf("Maior altura = %.2f\n", biggerHeight);
		System.out.printf("Media das alturas das mulheres = %.2f\n", avgFemale);
		System.out.println("Numero de homens = " + qtyMale);
		
		sc.close();
	}
	
}
