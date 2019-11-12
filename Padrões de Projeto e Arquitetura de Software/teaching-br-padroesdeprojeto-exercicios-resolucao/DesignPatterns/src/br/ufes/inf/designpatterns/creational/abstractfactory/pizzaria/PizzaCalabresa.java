package br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria;

/**
 * Representa uma pizza de presunto (queijo + presunto + tomate).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2013.03.05
 */
public class PizzaCalabresa extends Pizza {
	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Pizza#obterIngredientes() */
	@Override
	public String obterIngredientes() {
		return "Queijo, presunto e tomate.";
	}
}
