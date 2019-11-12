package br.ufes.inf.designpatterns.structural.decorator.numeroum;

/**
 * O número 1.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.mm.dd
 */
public class NumeroUm implements Componente {
	/** @see br.ufes.inf.designpatterns.structural.decorator.numeroum.Componente#imprimir() */
	public void imprimir() {
		System.out.print("1");
	}
}
