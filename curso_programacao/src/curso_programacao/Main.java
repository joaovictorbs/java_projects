package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmployeeSalary;

public class Main {

    public static void main(String[] args) {

        /*EXERCICIO MATRIZES*/
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //matriz com linha e coluna

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }

            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}