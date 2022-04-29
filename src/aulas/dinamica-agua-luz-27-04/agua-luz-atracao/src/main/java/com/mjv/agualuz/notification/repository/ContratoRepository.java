package com.mjv.agualuz.notification.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.agualuz.notification.model.*;

public class ContratoRepository {
	//banco de dados fake
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public List<Contrato> listar() {
		Contrato contrato = new Contrato();
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setServico(Servico.AGUA);
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setTipoNotificacao(TipoNotificacao.WHATSAPP);



		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);

		cliente.setNome("Gleyson Sampaio");
		cliente.setCpf("2347688888");
		cliente.setRg("87897");
		cliente.setCelular("(11) 99768 - 1515");
		cliente.setPais(Pais.BRASIL);




		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);

		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("27310657");




		contratos.add(contrato);
		return contratos;
	}
	
	
}
