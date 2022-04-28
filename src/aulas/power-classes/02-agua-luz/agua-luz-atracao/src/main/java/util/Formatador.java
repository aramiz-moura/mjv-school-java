package util;

import model.Pessoa;

import java.util.Arrays;

public class Formatador {

    private String outputCsv;
    private String outputDelimitado;


   public String ouputFormatado(Pessoa pessoa) {

        String cpf = pessoa.getCpf();
        String cpfString = pessoa.getCpf().replaceAll("\\D","");
        String cpfFormatado = numeroFormatador(cpfString,11);

        String rg = pessoa.getRg();
        String rgFormatado = stringFormatador(pessoa.getRg(),10);

        String nome = pessoa.getNome();
        String nomeFormatado = stringFormatador(pessoa.getNome(),30).toUpperCase();

        String celular = pessoa.getCelular();
        String celularFormatado = stringFormatador(pessoa.getCelular().replaceAll("\\D",""), 11);


        String logradouro = pessoa.getEndereco().getLogradouro();
        String logradouroFormatado = stringFormatador(logradouro,20).toUpperCase();


        Integer numero = pessoa.getEndereco().getNumero();
        String numeroString = numero.toString();
        String numeroFormatado = numeroFormatador(numeroString,6);


        String complemento = pessoa.getEndereco().getComplemento();
        String complementoFormatado = stringFormatador(pessoa.getEndereco().getComplemento(),10);

        String bairro = pessoa.getEndereco().getBairro();
        String bairroFormatado = stringFormatador(bairro,15).toUpperCase();

        String cidade = pessoa.getEndereco().getCidade();
        String cidadeFormatada = stringFormatador(cidade,30).toUpperCase();


        String uf = pessoa.getEndereco().getUf();
        String ufFormatado = stringFormatador(uf,2).toUpperCase();

        String cep = pessoa.getEndereco().getCep();
        String cepString = pessoa.getEndereco().getCep().replaceAll("\\D","");
        String cepFormatado = stringFormatador(cepString, 8);

        String protocolo = pessoa.getProtocolo().getNumeroProtocolo().toString();
        String protocoloFormatado = numeroFormatador(protocolo,10);

        String data = pessoa.getProtocolo().getData().toString();
        String dataString = data.replaceAll("\\D","");
        String dataFormatada = stringFormatador(dataString,8);

        String hora = pessoa.getProtocolo().getHora().toString();
        String horaString = hora.replaceAll("\\D","");
        String horaFormatada = stringFormatador(horaString,4);

        String valor = pessoa.getProtocolo().getValor().toString();
        String valorFormatado = numeroFormatador(valor,8);


        String[] allStrings = {cpfFormatado,rgFormatado,nomeFormatado,celularFormatado,logradouroFormatado,numeroFormatado,
        complementoFormatado,bairroFormatado,cidadeFormatada,ufFormatado,cepFormatado,pessoa.getEndereco().getLocalidade().getSigla(),protocoloFormatado,dataFormatada,horaFormatada, pessoa.getProtocolo().getTipoServico().getSigla(),
        valorFormatado,pessoa.getProtocolo().getTipoNotificacao().getSigla()};

       String[] allStringsDelimitado = {cpfFormatado,";",rgFormatado,";",nomeFormatado,";",celularFormatado,";",logradouroFormatado,";",numeroFormatado,
               ";",complementoFormatado,";",bairroFormatado,";",cidadeFormatada,";",ufFormatado,";",cepFormatado,";",pessoa.getEndereco().getLocalidade().getSigla(),";",protocoloFormatado,";",dataFormatada,";",horaFormatada, ";",pessoa.getProtocolo().getTipoServico().getSigla(),
               ";",valorFormatado,";",pessoa.getProtocolo().getTipoNotificacao().getSigla()};

       String[] allStringsCsv = {"CPF",";","RG",";","NOME",";","CELULAR",";","LOUGRADOURO",";","NUMERO",";","COMPLEMENTO",";","BAIRRO",";","CIDADE",";","UF",
               ";","CEP",";","PAIS",";","PROTOCOLO",";","DATA",";","HORA",";","TIPO SERVICO",";","VALOR",";","TIPO NOTIFICACAO",";","\n",cpf,";",rgFormatado,";",nome,";",celular,";",logradouro,";",numeroString,
               ";",complemento,";",bairro,";",cidade,";",uf,";",cep,";",pessoa.getEndereco().getLocalidade().toString(),";",protocolo,";",dataFormatada,";",hora, ";",pessoa.getProtocolo().getTipoServico().toString(),
               ";",valor,";",pessoa.getProtocolo().getTipoNotificacao().toString()};

       StringBuilder output = new StringBuilder();
       Arrays.stream(allStrings).forEach(string -> output.append(string));

       StringBuilder outputDelimitado = new StringBuilder();
       Arrays.stream(allStringsDelimitado).forEach(string -> outputDelimitado.append(string));

       StringBuilder outputCsv = new StringBuilder();
       Arrays.stream(allStringsCsv).forEach(string -> outputCsv.append(string));




        this.outputDelimitado = outputDelimitado.toString();
        this.outputCsv = outputCsv.toString();



       return output.toString();
    }




    private  String stringFormatador(String dado,int delimitador) {
        String stringFormatada;
       if(dado.length() >= delimitador){
           stringFormatada = dado.substring(0, delimitador);
       } else {
           String completer = " ".repeat(delimitador - dado.length());
           stringFormatada = completer + dado;
       }
       return stringFormatada;
    }

    private  String numeroFormatador(String dado, int delimitador) {
       String dadoFormatado = dado.replaceAll("\\D","");
       if(dado.length() >= delimitador) {
           dadoFormatado = dado.substring(0,delimitador);
       } else{
            dadoFormatado = String.format("%0" + delimitador + "d", Long.valueOf(dadoFormatado));
       }

       return dadoFormatado;
    }


    public String getOutputCsv() {
        return outputCsv;
    }

    public String getOutputDelimitado(){
       return outputDelimitado;
    }

}
