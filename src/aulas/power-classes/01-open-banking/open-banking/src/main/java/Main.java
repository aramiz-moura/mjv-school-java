import model.Cliente;
import model.Movimentacao;
import util.Formatador;
import util.GeradorArquivo;
import util.TipoMovimentacao;
import util.TipoPessoa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente primeiroCliente = new Cliente("Aramiz",TipoPessoa.PESSOA_FISICA,"041.871.761-36", new Movimentacao(
                LocalDate.now(),
                TipoMovimentacao.DESPESA,
                1275.40,
                true
        ));

        Cliente segundoCliente = new Cliente("Priscila Castro",TipoPessoa.PESSOA_FISICA,"324.435.32-89", new Movimentacao(
                LocalDate.now(),
                TipoMovimentacao.DESPESA,
                1500.40,
                false
        ));

        String output = Formatador.outputFormatado(segundoCliente);

        System.out.println(output);

//        GeradorArquivo.escreverDisco(ouput);
    }
}
