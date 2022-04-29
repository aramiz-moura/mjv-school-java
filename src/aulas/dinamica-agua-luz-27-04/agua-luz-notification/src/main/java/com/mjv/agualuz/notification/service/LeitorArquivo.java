package com.mjv.agualuz.notification.service;

import com.mjv.agualuz.notification.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {
    public List<Contrato> lerContratosCsv() {
        List<String> conteudo = lerArquivo("agua-luz-contratos.csv");
        List<Contrato> contratos = new ArrayList<>();
        for(String linha : conteudo) {
            Contrato c = new Contrato();
            Cadastro cad = new Cadastro();
            Endereco endereco = new Endereco();


            String campos[] = linha.split(";");
            cad.setEndereco(endereco);
            cad.setCpf(campos[0]);
            cad.setRg(campos[1]);
            cad.setNome(campos[2]);
            cad.setCelular(campos[3]);
            endereco.setLogradouro(campos[4]);
            endereco.setNumero(campos[5]);
            endereco.setComplemento(campos[6]);
            endereco.setBairro(campos[7]);
            endereco.setCidade(campos[8]);
            endereco.setEstado(campos[9]);
            endereco.setCep(campos[10]);

            Pais pais = Pais.valueOf(campos[11].toUpperCase());
            cad.setPais(pais);

            c.setNumeroProtocolo(Long.valueOf(campos[12]));
            c.setDataHora(LocalDateTime.parse(campos[13]));


            Servico servico = Servico.valueOf(campos[14].toUpperCase());
            c.setServico(servico);
            c.setValor(Double.valueOf(campos[15]));

            TipoNotificacao tipoNotificacao = TipoNotificacao.valueOf(campos[16].toUpperCase());
            c.setTipoNotificacao(tipoNotificacao);


            c.setCliente(cad);
            contratos.add(c);
        }
        return contratos;
    }

    private List<String> lerArquivo(String nomeArquivo) {
        Path filePath = Paths.get("D:\\mjv-school\\src\\aulas\\dinamica-agua-luz-27-04\\agua-luz-output", nomeArquivo);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
