package curso_programacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> courses = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for(int i=0; i<courseA; i++) {
            courses.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for(int i=0; i<courseB; i++) {
            courses.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for(int i=0; i<courseC; i++) {
            courses.add(sc.nextInt());
        }

        System.out.println("Total students: " + courses.size());

        sc.close();

    }

}