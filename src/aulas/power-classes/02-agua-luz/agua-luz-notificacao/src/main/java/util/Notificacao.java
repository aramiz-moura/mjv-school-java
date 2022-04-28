package util;

public class Notificacao {
    public static String[] strings = new String[0];

    public static String mensagem() {
        return "Senhor(a)" + strings[2] + ", " + "cpf de número " +
                strings[0] + ". " + "Informamos que conforme contrato com protocolo de número "
                + strings[12] + " " + "está agendado para a data\\hora " + strings[13] + " " +
                strings[14] + " a instalação do serviço de " + strings[15] + " com taxa de valor " +
                "R$" +strings[16] + " em sua residência localizada no endereço abaixo: " + "\n " +
                endereco();

    }

    public static String endereco() {
        return
                "Logradouro: " + strings[4] + ", " + strings[5] + "\n "+
                "Complemento: " + strings[6] + "\n "+
                "Bairro: " + strings[7] + "\n" +
                "Cidade: " + strings[8]+ "/" + strings[9] + "\n" +
                "Cep: " + strings [10];

    }
}
