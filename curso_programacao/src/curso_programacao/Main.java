package curso_programacao;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*EXERCICIO MATRIZES*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform the number of columns: ");
        int m = sc.nextInt();

        System.out.print("Inform the number of rows in each column: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i=0; i<matriz.length; i++) {
            System.out.print("Inform the current column row value: ");
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Inform the number inside vect: ");
        int x = sc.nextInt();

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if(matriz[i][j] == x) {
                    String position;
                    Integer left, right, up, down;

                    //position = Arrays.asList(matriz[i]).indexOf(x);
                    position = i + "," + j;

                    System.out.println("Position " + position + ":");
                    if (j != 0) {
                        left = matriz[i][j-1];
                        System.out.println("Left: " + left);
                    }
                    if (j < n - 1) {
                        right = matriz[i][j+1];
                        System.out.println("Right: " + right);
                    }
                    if (i != 0) {
                        up = matriz[i-1][j];
                        System.out.println("Up: " + up);
                    }
                    if (i < m - 1) {
                        down = matriz[i+1][j];
                        System.out.println("Down: " + down);
                    }
                }
            }
        }

        sc.close();
    }
}