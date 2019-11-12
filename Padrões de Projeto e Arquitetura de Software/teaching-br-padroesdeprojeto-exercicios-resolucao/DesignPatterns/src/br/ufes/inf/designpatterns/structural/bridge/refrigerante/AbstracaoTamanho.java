package br.ufes.inf.designpatterns.structural.bridge.refrigerante;

/**
 * Abstração de tamanho de refrigerante.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.11
 */
public abstract class AbstracaoTamanho {
	/** Implementação do refrigerante. */
	protected ImplementacaoRefrigerante refrigerante;

	/** Construtor. */
	public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}

	/** Bebe o refrigerante. */
	public abstract void beber();
}
