package aulas.exercicio1404;

import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarExample {

    public static void main(String[] args) {
//        1. A Classe Calendar, é uma classe abstrata.
//            Através dela é possível converter entre um tempo em especifico em campos de calendário, como ANO,MES,DIA DO MES.
//            E também manipulação dos campos de calendário, como pegar a data da proxima semana.

//       2. Por ser uma classe abstrata, não é possível criar uma instancia da mesma. Nisso é possivel criar um
//          método que pode construir uma instancia de calendário formatado como queremos. (getCalendar);

//        3. Exemplos de métodos para a Classe Calendar são:
            /*3.1.*/
                    Calendar example1 = Calendar.getInstance(); // getInstance é static;
                    System.out.println("3.1: " + example1);
                    //Aqui estamos pegando uma instancia de calendário, onde terá VÁRIAS informações. Uma array de atributos.

            /*3.2.*/
                    example1.set(Calendar.DAY_OF_MONTH, 4);
                    System.out.println("3.2: " + example1);
            //Método que tem como paramêtro um FIELD de Calendar e um valor em int. Realiza
            //a substituição do field pelo valor do parametro. Não tem retorno (void).


            /*3.3.*/
        //Método que retorna um boolean se o calendario representa um tempo antes do calendario colocado no parametro
        example1.before(Calendar.MONTH); //boolean
                    System.out.println("3.3: " + example1);


            /*3.4.*/
        //Método que retorna uma string com o tipo do Calendário, seguindo a definição LDML(Locale Date Markup Language);
         System.out.println("3.4: " + example1.getCalendarType());



//        4. Método .set é sobrecarregado, assim como o getInstance;
            example1.set(2022,4,17,15,2,40);
            Calendar example2 = Calendar.getInstance(TimeZone.getTimeZone("Brasil"));
            System.out.println("4: " + example2);



    }

//        5. Construir um Calendario:
    public Calendar getCalendar(int day, int month, int year){
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month+1);
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.HOUR, 15);
        System.out.println("5: " + date);
        return date;
    }
    Calendar now = getCalendar(17,04,2022);






}
