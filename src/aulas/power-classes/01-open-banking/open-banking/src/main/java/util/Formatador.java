package util;

import model.Cliente;

import java.util.Arrays;

public class Formatador {

    private String output;

    public static String outputFormatado(Cliente cliente) {
        String dataFormatada = cliente.getMovimentacao()
                .getDataMovimentacao()
                .toString()
                .replace("-", "");

        String cpfString = cliente.getCpfCnpj()
                .replaceAll("\\D", "");

        Long cpfLong = Long.valueOf(cpfString);

        String cpfFormatado = String.format("%014d",cpfLong);


        String nomeFormatado = nomeFormatador(cliente.getNome());

        Double valor = cliente.getMovimentacao().getValor();
        String valorString = valor.toString().replaceAll("\\D","");
        String valorFormatado = String.format("%010d",Long.valueOf(valorString));

        //String siglaTipoPessoa = cliente.getTipoPessoa().getSigla();

        String siglaTipoMovimentacao = cliente.getMovimentacao().getTipoMovimentacao().getSigla();

        String movimentacaoEstornada = checarMovimentacao(cliente.getMovimentacao().getEstornada());


        String[] allStrings = {dataFormatada,cpfFormatado,nomeFormatado,valorFormatado,siglaTipoMovimentacao,movimentacaoEstornada};

        StringBuilder output = new StringBuilder();
        Arrays.stream(allStrings).forEach(string -> output.append(string));

        return output.toString();

    }


    public static String nomeFormatador(String nome) {
        String nomeFormatado = nome;
        if(nome.length() >= 30) {
            nomeFormatado = nome.substring(0,30);
        } else {
            nomeFormatado = String.format("%-30s", nome);
        }
        return nomeFormatado;
    }

    public static String checarMovimentacao(Boolean estornada) {
        String transacaoEstornada;
        if(estornada) {
            return transacaoEstornada = "1";
        } else {
            transacaoEstornada = "2";
        }

        return transacaoEstornada;
    }
}
