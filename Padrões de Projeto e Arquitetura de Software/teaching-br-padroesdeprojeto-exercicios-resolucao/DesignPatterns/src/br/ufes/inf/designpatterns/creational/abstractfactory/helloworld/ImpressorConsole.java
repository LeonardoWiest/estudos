package br.ufes.inf.designpatterns.creational.abstractfactory.helloworld;

/**
 * Impressor para console.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.01
 */
public class ImpressorConsole implements Impressor {
	/** @see br.ufes.inf.designpatterns.creational.abstractfactory.helloworld.Impressor#imprimir(java.lang.String) */
	public void imprimir(String string) {
		System.out.println(string);
	}
}
