package com.mjv.agualuz.notification.service;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		String dataFormatada = FormatadorUtil.formatarData(contrato.getDataHora());

		sb.append(String.format("Senhor(a) %s cpf de número %s, ",cliente.getNome(), cpfFormatado ));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d ", contrato.getNumeroProtocolo()));
		sb.append(dataFormatada);
		sb.append(String.format("a instalação do serviço de %s com taxa de valor R$ %.2f em sua residência localizada no endereço abaixo:\n", contrato.getServico(), contrato.getValor()));
		sb.append(String.format("-> Logradouro:", cliente.getEndereco().getLogradouro(), cliente.getEndereco().getNumero()));
		sb.append("\n");
		sb.append(String.format("-> Complemento: ", cliente.getEndereco().getComplemento()));
		sb.append("\n");
		sb.append(String.format("-> Bairro: ", cliente.getEndereco().getBairro()));
		sb.append("\n");
		sb.append(String.format("-> Cidade: ", cliente.getEndereco().getCidade()));
		sb.append("\n");
		sb.append(String.format("-> Cep: ", cliente.getEndereco().getCep()));



		System.out.println(sb.toString());
	}
}
