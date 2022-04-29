package com.mjv.agualuz.notification.app;

import java.time.LocalDateTime;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.service.GeradorMensagem;
import com.mjv.agualuz.notification.service.LeitorArquivo;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		LeitorArquivo leitor = new LeitorArquivo();
		GeradorMensagem gm = new GeradorMensagem();


		List<Contrato> contratosCsv = leitor.lerContratosCsv();
		Contrato primeiro = contratosCsv.get(0);
		gm.gerar(primeiro);

		/*for(Contrato c: contratosCsv) {
			System.out.println(c.getTipoNotificacao());
		}*/
	}
}
