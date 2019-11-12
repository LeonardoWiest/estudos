package br.ufes.inf.designpatterns.behavioral.chainofresponsibility.slots;

/**
 * Moeda de um determinado valor.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.20
 */
public class Moeda {
	/** Valor da moeda. */
	private int valor;

	/** Construtor. */
	public Moeda(int valor) {
		this.valor = valor;
	}

	/** Getter for valor. */
	public int getValor() {
		return valor;
	}
}
