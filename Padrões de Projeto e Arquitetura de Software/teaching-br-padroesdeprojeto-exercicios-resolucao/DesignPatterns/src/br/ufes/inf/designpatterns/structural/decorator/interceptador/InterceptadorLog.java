package br.ufes.inf.designpatterns.structural.decorator.interceptador;

import java.text.DateFormat;
import java.util.Date;

/**
 * Interceptador log.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class InterceptadorLog implements Componente {
	/** Componente. */
	private Componente componente;

	/** Formatador de timestamp. */
	private DateFormat timestampFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM);

	/** Construtor. */
	public InterceptadorLog(Componente componente) {
		this.componente = componente;
	}

	/** @see br.ufes.inf.designpatterns.structural.decorator.interceptador.Componente#executarTarefa() */
	public void executarTarefa() {
		System.out.println("[LOG] " + timestampFormat.format(new Date(System.currentTimeMillis())) + ": executando a tarefa.");
		componente.executarTarefa();
	}
}
