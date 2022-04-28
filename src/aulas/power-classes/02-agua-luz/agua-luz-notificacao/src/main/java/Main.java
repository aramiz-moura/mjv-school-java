import util.Notificacao;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(
                    new FileReader("D:\\mjv-school-java\\src\\aulas\\power-classes\\02-agua-luz\\agua-luz-output\\agua-luz-contratos.csv"));
                    String reader;

                    while((reader = br.readLine()) != null){
                        String data = br.readLine();
                        String values[] = data.split(";");
                        Notificacao.strings = values.clone();
                    }
                    br.close();
        } catch (Exception e) {

        }
        System.out.println(Notificacao.mensagem());

    }
}
