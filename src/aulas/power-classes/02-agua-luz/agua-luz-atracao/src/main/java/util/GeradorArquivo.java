package util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorArquivo {

    public static void geraArquivoTxt(String output) {
        String nomeArquivo = "agua-luz-contratos.txt";
        try{
            File diretorio = new File("D:\\mjv-school-java\\src\\aulas\\power-classes\\02-agua-luz\\agua-luz-output");
            if(! diretorio.exists())
                diretorio.mkdirs();
            Path path = Paths.get(diretorio.getAbsolutePath(),nomeArquivo);
            Files.write(path, output.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public static void geraArquivoCsv(String output) {
        String nomeArquivo = "agua-luz-contratos.csv";
       try{
           File diretorio = new File("D:\\mjv-school-java\\src\\aulas\\power-classes\\02-agua-luz\\agua-luz-output");
           if(! diretorio.exists())
               diretorio.mkdirs();
           Path path = Paths.get(diretorio.getAbsolutePath(),nomeArquivo);
           Files.write(path, output.getBytes(StandardCharsets.UTF_8));
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
