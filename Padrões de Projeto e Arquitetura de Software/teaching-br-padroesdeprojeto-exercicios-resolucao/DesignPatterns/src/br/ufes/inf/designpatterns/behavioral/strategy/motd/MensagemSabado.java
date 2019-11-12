package br.ufes.inf.designpatterns.behavioral.strategy.motd;

/**
 * Mensagem de segunda-feira.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class MensagemSabado implements MensagemDoDia {
	/** @see br.ufes.inf.designpatterns.behavioral.strategy.motd.MensagemDoDia#imprimir() */
	public void imprimir() {
		System.out.println("Hoje é sábado.");
	}
}
