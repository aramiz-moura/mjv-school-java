package aulas.exercicio1404;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

import static java.time.temporal.ChronoField.HOUR_OF_DAY;

public class LocalDateTimeExample{
    public static void main(String[] args) {
//          1.A Classe LocalDateTime também é uma classe imutável.
//           Através dela é possível representar uma data, normalmente visualizado através de ano-mes-dia-hora-minuto-segundo.
//            Normalmente representado com o formato: 2007-12-03T10:15:30.
//           É possível acessar outras informações como, dia da semana, semana do ano...

//            2. // Como LocalDate, o construtor é de acesso privado;
//                  LocalDateTime now = new LocalDateTime();
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime now2 = LocalDateTime.of(2022,10,20,20,40,50);
                System.out.println("2 :" + now);

                /*3*/
                    /*3.1.*/
                //Método que retorna o dia da semana(DayOfWeek) de uma determinada data.
                System.out.println("3.1: " + now.getDayOfWeek());

                    /*3.2.*/
                //Método que compara duas datas e retorna um boolean. True se a primeira data for a frente da outra e False caso não seja;
                LocalDateTime futureDate = LocalDateTime.now().plusYears(15);
                boolean isAfter = now.isAfter(futureDate);
                System.out.println("3.2: "+ isAfter);

                    /*3.3.*/
                //Método que retorna (LocalDate) apenas o tempo local.
                System.out.println("3.3: " + now.toLocalTime());


                    /*3.4.*/
                //Método que retorna o dia do ano (int)
                System.out.println("3.4 :" + now.getDayOfYear());

//                4. O Método sobrecarregado seria o LocalDateTime.of();
                LocalDateTime date = LocalDateTime.of(2025,10,15,14,20,14);

//                5. Quando precisamos ter um log de acesso:
                        LocalDateTime todayDate = LocalDateTime.now();
//                       5.1 Quando temos duas datas e saber quantos dias faltam para a outra data
                        LocalDateTime afterDate = LocalDateTime.now().plusDays(10);
                        System.out.println("5.1: " + todayDate.until(afterDate, ChronoUnit.DAYS));



    }
}
