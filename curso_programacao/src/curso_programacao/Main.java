package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
		
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //importa classe ArrayList para manter otimizada
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Carlo");
		list.add("Luiz");
		list.add("Robert");
		list.add("Andre");
		list.add(2, "Marco");
	
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");

		list.remove("Anna");
		list.remove(3);
		list.removeIf(x -> x.charAt(0) == 'M'); //remove todo string x, onde o primeiro caractere seja M
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Luiz"));
		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		System.out.println("------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //mantem a contabilidade com o list e permite operacoes de lambda com o tipo List / cria novo lista com nomes com A
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //coleta primeiro elemento / se nao existir retorna nulo
		String nameNull = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

		System.out.println(name);
		System.out.println(nameNull);

	}
	
}
