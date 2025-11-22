package curso_programacao;

import java.text.SimpleDateFormat;

import entities.*;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate); //associa a cliente

        System.out.println();
        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());

        Order order = new Order(new Date(), status, client); //associa order e o cliente

        System.out.println("How many items to this order?");
        int orderItens = sc.nextInt();

        System.out.println();
        for (int i=0; i<orderItens; i++) {
            System.out.println("Enter #" + (i+1) + " item data");
            sc.nextLine();

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}