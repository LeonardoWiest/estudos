package br.ufes.inf.designpatterns.structural.decorator.numeroum;

/**
 * TODO: class description.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.mm.dd
 */
public class DecoratorColchetes implements Componente {
	/** Componente decorado. */
	private Componente componente;

	/** Construtor. */
	public DecoratorColchetes(Componente componente) {
		this.componente = componente;
	}

	/** @see br.ufes.inf.designpatterns.structural.decorator.numeroum.Componente#imprimir() */
	public void imprimir() {
		System.out.print("[");
		componente.imprimir();
		System.out.print("]");
	}

}
