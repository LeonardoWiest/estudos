package br.ufes.inf.designpatterns.structural.bridge.refrigerante;

/**
 * Tamanho pequeno.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.11
 */
public class TamanhoGrande extends AbstracaoTamanho {
	/** Construtor. */
	public TamanhoGrande(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
	}

	/** @see br.ufes.inf.designpatterns.structural.bridge.refrigerante.AbstracaoTamanho#beber() */
	public void beber() {
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
