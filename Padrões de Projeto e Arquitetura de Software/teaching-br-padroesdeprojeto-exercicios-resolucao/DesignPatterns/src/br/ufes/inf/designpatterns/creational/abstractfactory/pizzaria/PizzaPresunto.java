package br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria;

/**
 * Representa uma pizza de calabresa (queijo + calabresa + tomate).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2013.03.05
 */
public class PizzaPresunto extends Pizza {
	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Pizza#obterIngredientes() */
	@Override
	public String obterIngredientes() {
		return "Queijo, calabresa e tomate.";
	}
}
