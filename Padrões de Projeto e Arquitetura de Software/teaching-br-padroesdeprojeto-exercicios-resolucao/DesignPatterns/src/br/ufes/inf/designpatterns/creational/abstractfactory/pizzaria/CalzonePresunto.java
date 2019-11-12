package br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria;

/**
 * Representa uma calzone de calabresa (queijo + calabresa + tomate).
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2013.03.05
 */
public class CalzonePresunto extends Calzone {
	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.pizzaria.Calzone#obterIngredientes() */
	@Override
	public String obterIngredientes() {
		return "Queijo, calabresa e tomate.";
	}
}
