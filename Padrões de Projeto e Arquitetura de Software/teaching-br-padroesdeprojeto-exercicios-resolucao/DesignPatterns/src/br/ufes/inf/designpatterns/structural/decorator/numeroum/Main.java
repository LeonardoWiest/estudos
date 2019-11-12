package br.ufes.inf.designpatterns.structural.decorator.numeroum;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		// (1)
		Componente c = new DecoratorParenteses(new NumeroUm());
		c.imprimir();

		System.out.println();

		// {[1]}
		c = new DecoratorChaves(new DecoratorColchetes(new NumeroUm()));
		c.imprimir();
	}
}
