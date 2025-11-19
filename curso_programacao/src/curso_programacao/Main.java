package curso_programacao;

import java.util.Date;

import entities.OrderEnum;
import entities.enums.OrderStatus;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        OrderEnum order = new OrderEnum(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}