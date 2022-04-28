import model.Endereco;
import model.Pessoa;
import model.Protocolo;
import repository.Repository;
import util.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Formatador formatador = new Formatador();
        Pessoa pessoa1 = new Pessoa(
                "Aramiz Domingos de moura Filho sebastiao",
                "123.412.34123.54",
                "124123124123",
                "(62)99643-3704",
                new Endereco(
                        "Avenida Couto magalhaes",
                        352,
                        "Apartamento 1503B setor pedro ludovico",
                        "Pedro Ludovico",
                        "Goiânia",
                        "GO",
                        "74825-040",
                        Localidade.BRASIL
                ),new Protocolo(
                        1234432L,
                        LocalDate.now(),
                        LocalTime.now(),
                        TipoServico.AGUA,
                        130.25,
                        TipoNotificacao.WHATS
        )


        );


        Repository.salvarCadastro(pessoa1);
        Pessoa cadastroSalvo = Repository.getPessoa(0);
        System.out.println(cadastroSalvo);

        String outputFormatado = formatador.ouputFormatado(pessoa1);
        System.out.println(outputFormatado);
        System.out.println(formatador.getOutputDelimitado());


        GeradorArquivo.geraArquivoTxt(outputFormatado);

        String outputCsv = formatador.getOutputCsv();
        GeradorArquivo.geraArquivoCsv(outputCsv);




    }
}
