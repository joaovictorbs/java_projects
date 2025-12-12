package curso_programacao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);
    }

    public static void printList(List<?> list) { //tipo coringa
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}