package com.mjv.agualuz.notification.util;

import java.text.Normalizer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil {
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2= cpf.substring(3,6);
		String part3= cpf.substring(6,9);
		String part4= cpf.substring(9,11);
		String cpfFormatador=String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		return cpfFormatador;
	}


	public static String removerAcentos(String palavra) {
		return Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	/*public static String formataNome(String nome) {
		String stringFormatada;
		if(nome.length() >= 30) {
			stringFormatada = nome.substring(0, 30);
		} else {
			String completer = " ".repeat(30 - nome.length());
			stringFormatada = completer + nome;
		}
		return stringFormatada.toUpperCase();
	}*/

	public static String formataString(String textoOriginal, int delimitador) {
		String stringFormatada = completaStringComEspaco(textoOriginal, delimitador);
		stringFormatada = cortaString(stringFormatada,delimitador);
		return stringFormatada;
	}

	public static String completaNumero(String numero, int delimitador) {
		String formato = "%0" + delimitador + "d";
		String numeroFormatado = String.format(formato,Long.valueOf(numero));
		return numeroFormatado;
	}


	public static String completaStringComEspaco(String textoOriginal, int delimitador) {
		String formato = "%-" + delimitador + "s";
		String stringFormatada = String.format(formato, textoOriginal);
		return stringFormatada;
	}

	public static String cortaString(String textoOriginal, int delimitador) {
		int max = Math.min(delimitador, textoOriginal.length());
		return textoOriginal.substring(0, max);
	}

	public static String formatarData(LocalDateTime dataHora) {
		DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formatter = dataHora.format(dataHoraFormatada);
		return formatter;
	}
	
}
