package br.ufes.inf.designpatterns.structural.decorator.interceptador;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Interceptador log.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class InterceptadorVerificaMinuto implements Componente {
	/** Componente. */
	private Componente componente;

	/** Formatador de timestamp. */
	private DateFormat timestampFormat = DateFormat.getTimeInstance(DateFormat.SHORT);

	/** Construtor. */
	public InterceptadorVerificaMinuto(Componente componente) {
		this.componente = componente;
	}

	/** @see br.ufes.inf.designpatterns.structural.decorator.interceptador.Componente#executarTarefa() */
	public void executarTarefa() {
		// Verifica o minuto atual.
		Date agora = new Date(System.currentTimeMillis());
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(agora);
		int minuto = calendar.get(Calendar.MINUTE);

		// Interrompe se o minuto é par.
		if ((minuto % 2) == 0) {
			System.out.println("[MIN] Execução interrompida em minuto par: " + timestampFormat.format(agora));
		}
		else componente.executarTarefa();
	}
}
