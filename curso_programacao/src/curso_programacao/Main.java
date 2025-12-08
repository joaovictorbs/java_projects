package curso_programacao;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

import java.io.*;
import java.text.ParseException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        ContractService service = new ContractService(contract, months, new PaypalService());

        service.processContract(contract, months);

        System.out.println("Parcelas:");
        for (int i=0; i<contract.getInstallments().size(); i++) {
            System.out.println(contract.getInstallments().get(i).getDueDate().format(fmt) + " - " + String.format("%.2f", contract.getInstallments().get(i).getAmount()));
        }

        sc.close();
    }
}