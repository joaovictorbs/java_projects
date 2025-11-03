package curso_programacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-10-31");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-31T03:33:33");
        Instant d06 = Instant.parse("2025-10-31T03:33:33Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte instant para data local considerando fuso horario do usuario
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Asia/Tokyo"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println();

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());
        /*for (String s : ZoneId.getAvailableZoneIds()) { //zoneids disponiveis
            System.out.println(s);
        }*/


    }
}