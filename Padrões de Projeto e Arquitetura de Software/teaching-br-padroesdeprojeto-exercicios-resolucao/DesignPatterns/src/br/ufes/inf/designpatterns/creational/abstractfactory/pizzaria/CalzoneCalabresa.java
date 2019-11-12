package br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria;

/**
 * Representa um calzone de presunto (queijo + presunto + tomate).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2013.03.05
 */
public class CalzoneCalabresa extends Calzone {
	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Calzone#obterIngredientes() */
	@Override
	public String obterIngredientes() {
		return "Queijo, presunto e tomate.";
	}
}
