package br.ufes.inf.designpatterns.behavioral.chainofresponsibility.sleep;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Membro da cadeia.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.20
 */
public class Handler {
	/** Contador de handlers. */
	private static int HANDLER_COUNT = 0;

	/** Tempo de sono em milisegundos. */
	private static final int SLEEP_TIME = 200;

	/** Impressor de horas. */
	private static final DateFormat formataHoras = new SimpleDateFormat("hh:MM:ss:SSS");

	/** Número deste handler. */
	private int numero;

	/** Timestamp da última vez que atendeu a uma requisição. */
	private long timestamp = 0;

	/** Próximo handler. */
	private Handler proximo;

	/** Construtor. */
	public Handler() {
		numero = ++HANDLER_COUNT;
		System.out.println("Criado handler " + numero);
	}

	/** Construtor. */
	public Handler(Handler proximo) {
		this();
		this.proximo = proximo;
	}

	/** Método que responde à requisição. */
	public void handleRequest(int numeroRequisicao) {
		// Obtem o timestamp atual.
		long now = System.currentTimeMillis();

		// Verifica se este handler está dormindo e passa ao próximo, se houver.
		if (((now - timestamp) < SLEEP_TIME) && (proximo != null)) {
			proximo.handleRequest(numeroRequisicao);
		}

		// Do contrário, trata a requisição.
		else {
			Date data = new Date(now);
			System.out.println("Requisição " + numeroRequisicao + " tratada pelo handler " + numero + " - " + formataHoras.format(data));
			timestamp = now;
		}
	}
}
