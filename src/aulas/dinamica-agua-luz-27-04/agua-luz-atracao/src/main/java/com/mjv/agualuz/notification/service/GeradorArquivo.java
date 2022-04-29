package com.mjv.agualuz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorArquivo {
	public void csv(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c : contratos) {
			Cadastro cad = c.getCliente();
			sb.append(cad.getCpf() + ";");
			sb.append(cad.getRg() + ";");
			sb.append(cad.getNome() + ";");
			sb.append(cad.getCelular() + ";");
			sb.append(FormatadorUtil.removerAcentos(cad.getEndereco().getLogradouro()) + ";");
			sb.append(cad.getEndereco().getNumero() + ";");
			sb.append(cad.getEndereco().getComplemento() + ";");
			sb.append(cad.getEndereco().getBairro() + ";");
			sb.append(FormatadorUtil.removerAcentos(cad.getEndereco().getCidade() + ";"));
			sb.append(cad.getEndereco().getEstado() + ";");
			sb.append(cad.getEndereco().getCep() + ";");
			sb.append(cad.getPais() + ";");
			sb.append(c.getNumeroProtocolo() + ";");
			sb.append(c.getDataHora() + ";");
			sb.append(c.getServico() + ";");
			sb.append(c.getValor()+ ";");
			sb.append(c.getTipoNotificacao());
		}
		System.out.println(sb.toString());
		
		escrever(sb.toString(), "agua-luz-contratos.csv");
		
	}

	public void txt(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c : contratos) {
			Cadastro cad = c.getCliente();
			sb.append(cad.getCpf().replaceAll("\\D",""));//remover os caracteres especiais
			sb.append(FormatadorUtil.formataString(cad.getRg(),10));// incluir espaços em branco ate 10 e alinhar a equerda
			sb.append(FormatadorUtil.formataString(cad.getNome(),30).toUpperCase());//cortar o nome para no máximo 30c e colocar maiusculo.
			sb.append(cad.getCelular().replaceAll("\\D",""));
			sb.append(FormatadorUtil.removerAcentos(FormatadorUtil.formataString(cad.getEndereco().getLogradouro(),20).toUpperCase()));
			sb.append(FormatadorUtil.completaNumero(cad.getEndereco().getNumero(),6));
			sb.append(FormatadorUtil.formataString(cad.getEndereco().getComplemento(),10).toUpperCase());
			sb.append(FormatadorUtil.formataString(cad.getEndereco().getBairro(),15).toUpperCase());
			sb.append(FormatadorUtil.formataString(cad.getEndereco().getCidade(),30).toUpperCase());
			sb.append(cad.getEndereco().getEstado());
			sb.append(cad.getEndereco().getCep().replaceAll("\\D",""));
			sb.append(cad.getPais().getSigla());
			sb.append(FormatadorUtil.completaNumero(String.valueOf(c.getNumeroProtocolo()),10));
			sb.append(FormatadorUtil.formatarData(c.getDataHora()));
			sb.append(c.getServico().getSigla());
			String valor = c.getValor().toString().replaceAll("\\D","");
			sb.append(FormatadorUtil.completaNumero(valor,8));
			sb.append(c.getTipoNotificacao().getSigla());
		}
		System.out.println(sb.toString());
		escrever(sb.toString(), "agua-luz-contratos.txt");
		
	}
	private void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("D:\\mjv-school\\src\\aulas\\dinamica-agua-luz-27-04\\agua-luz-output");
		dir.mkdirs();
		
		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
